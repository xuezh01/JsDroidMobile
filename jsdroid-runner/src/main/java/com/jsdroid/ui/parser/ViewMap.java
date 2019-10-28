package com.jsdroid.ui.parser;

import android.util.Xml;

import com.jsdroid.api.context.JsdContext;
import com.jsdroid.ui.view.Item;
import com.jsdroid.ui.view.JsdView;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xmlpull.v1.XmlSerializer;

import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class ViewMap extends LinkedHashMap<String, Object> {
    private JsdView view;

    public ViewMap(JsdContext jsdContext, String type) {
        put("type", type);
        try {
            String pkg = JsdView.class.getPackage().getName();
            view = (JsdView) Class.forName(pkg + "." + type).getConstructor(JsdContext.class).newInstance(jsdContext);
        } catch (Exception e) {
            view = new Item(jsdContext);
        }

    }

    public ViewMap(JsdView view) {
        this.view = view;
        put("type", view.getName());
    }

    public JsdView getView() {
        return view;
    }

    public JsdView initView() {
        Object children = get("children");
        if (children instanceof List) {
            view.children = new ArrayList<>();
            Iterator iterator = ((List) children).iterator();
            while (iterator.hasNext()) {
                Object next = iterator.next();
                if (next instanceof ViewMap) {
                    JsdView child = ((ViewMap) next).initView();
                    view.children.add(child);
                }
            }
        }
        //初始化属性
        view.setProps(this);
        return view;
    }

    public void dumpXml(OutputStream out) throws IOException {
        XmlSerializer serializer = Xml.newSerializer();
        serializer.setOutput(out, "UTF-8");
        serializer.startDocument("UTF-8", true);
        dumpXmlTag(serializer);
        serializer.endDocument();
    }

    private void dumpXmlTag(XmlSerializer serializer) throws IOException {
        String type = (String) get("type");
        serializer.startTag("", type);
        for (String key : keySet()) {
            Object o = get(key);
            if (o instanceof String) {
                serializer.attribute("", key, (String) o);
            }
        }
        if (containsKey("children")) {
            Object children = get("children");
            if (children instanceof List) {
                Iterator iterator = ((List) children).iterator();
                while (iterator.hasNext()) {
                    Object next = iterator.next();
                    if (next instanceof ViewMap) {
                        ((ViewMap) next).dumpXmlTag(serializer);
                    }
                }
            }
        }

        serializer.endTag("", type);
    }

    public static ViewMap parseXml(JsdContext jsdContext, String xml) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(new InputSource(new StringReader(xml)));
        Element documentElement = document.getDocumentElement();
        return elementToMap(jsdContext, documentElement);
    }

    private static ViewMap elementToMap(JsdContext jsdContext, Node node) {
        ViewMap map = new ViewMap(jsdContext, node.getNodeName());
        NamedNodeMap attributes = node.getAttributes();
        if (attributes != null) {
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                Node item = attributes.item(i);
                map.put(item.getNodeName(), item.getNodeValue());
            }
        }
        List children = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        int childCount = childNodes.getLength();
        for (int i = 0; i < childCount; i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                children.add(elementToMap(jsdContext, item));
            }
        }
        map.put("children", children);
        return map;
    }
}
