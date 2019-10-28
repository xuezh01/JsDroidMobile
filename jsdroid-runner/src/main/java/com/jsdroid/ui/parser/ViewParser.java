package com.jsdroid.ui.parser;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

import com.jsdroid.api.context.JsdContext;
import com.jsdroid.ui.view.Button;
import com.jsdroid.ui.view.Check;
import com.jsdroid.ui.view.Edit;
import com.jsdroid.ui.view.Item;
import com.jsdroid.ui.view.JsdView;
import com.jsdroid.ui.view.Layout;
import com.jsdroid.ui.view.Process;
import com.jsdroid.ui.view.Spinner;
import com.jsdroid.ui.view.Text;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class ViewParser {
    public static class ViewContainer {
        public JsdView rootView;
        public Map<String, JsdView> viewMap = new HashMap<>();

        public ViewContainer initView(Context context) {
            rootView.initView(context);
            return this;
        }

        public View getView() {
            if (rootView != null) {
                return rootView.view;
            }
            return null;
        }

    }

    public static ViewContainer parseXml(JsdContext jsdContext, String xml) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(new InputSource(new StringReader(xml)));
        Element documentElement = document.getDocumentElement();
        Map map = elementToMap(jsdContext,documentElement);
        return parseMap(jsdContext, map);

    }

    public static ViewContainer parseMap(JsdContext jsdContext, Map map) {
        ViewContainer viewContainer = new ViewContainer();
        viewContainer.rootView = createBaseView(jsdContext, viewContainer, map, null, null);
        return viewContainer;
    }

    private static JsdView createBaseView(JsdContext jsdContext, ViewContainer viewContainer, Map map, JsdView root, JsdView parent) {
        String name = (String) map.get("type");
        JsdView thisView;
        if ("Check".equals(name)) {
            thisView = new Check(jsdContext);
        } else if ("Edit".equals(name)) {
            thisView = new Edit(jsdContext);
        } else if ("Spinner".equals(name)) {
            thisView = new Spinner(jsdContext);
        } else if ("Text".equals(name)) {
            thisView = new Text(jsdContext);
        } else if ("Layout".equals(name)) {
            thisView = new Layout(jsdContext);
        } else if ("Button".equals(name)) {
            thisView = new Button(jsdContext);
        } else if ("Item".equals(name)) {
            thisView = new Item(jsdContext);
        } else if ("Process".equals(name)) {
            thisView = new Process(jsdContext);
        } else {
            thisView = new Layout(jsdContext);
        }
        if (root == null) {
            root = thisView;
            thisView.root = root;
        }
        if (parent != null) {
            thisView.parent = parent;
        }
        for (Field field : JsdView.class.getFields()) {
            if (!map.containsKey(field.getName())) {
                continue;
            }
            Object data = map.get(field.getName());
            if (field.getType().equals(int.class)) {
                readInt(thisView, field, data);
            } else if (field.getType().equals(String.class)) {
                readString(thisView, field, data);
            } else if (field.getType().equals(boolean.class)) {
                readBoolean(thisView, field, data);
            } else if (field.getType().equals(long.class)) {
                readLong(thisView, field, data);
            } else if (field.getType().equals(float.class)) {
                readFloat(thisView, field, data);
            } else if (field.getType().equals(double.class)) {
                readDouble(thisView, field, data);
            }
        }
        if (thisView.name != null) {
            viewContainer.viewMap.put(thisView.name, thisView);
        }
        if (map.containsKey("children")) {
            Object children = map.get("children");
            if (children instanceof List) {
                thisView.children = new ArrayList<>();

                List list = (List) children;
                for (int i = 0; i < list.size(); i++) {
                    Object child = list.get(i);
                    if (child instanceof Map) {
                        JsdView childView = createBaseView(jsdContext, viewContainer, (Map) child, root, parent);
                        if (childView != null) {
                            thisView.children.add(childView);
                        }
                    }

                }
            }
        }

        return thisView;
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


    private static void readString(JsdView view, Field field, Object value) {
        try {
            field.set(view, value);
        } catch (Exception e) {

        }
    }

    private static void readInt(JsdView view, Field field, Object value) {
        if (value instanceof Integer) {
            try {
                field.set(view, value);
            } catch (IllegalAccessException e) {
            }
        } else {
            String data = value.toString();
            //解析颜色
            if (data.startsWith("#")) {
                try {
                    field.set(view, Color.parseColor(data));
                } catch (Exception e1) {
                }
            } else {
                try {
                    //解析match
                    if (data.equals("match")) {
                        field.set(view, android.widget.LinearLayout.LayoutParams.MATCH_PARENT);
                    } else if (data.equals("wrap")) {
                        field.set(view, android.widget.LinearLayout.LayoutParams.WRAP_CONTENT);
                    }
                } catch (Exception e) {
                }
                //解析为数字
                try {
                    field.set(view, Integer.parseInt(data));
                } catch (Exception e) {

                }
            }
        }

    }

    private static void readLong(JsdView view, Field field, Object value) {
        if (value instanceof Long) {
            try {
                field.set(view, value);
            } catch (IllegalAccessException e) {
            }
        } else {
            String data = value.toString();
            try {
                field.set(view, Long.parseLong(data));
            } catch (Exception e) {
            }
        }
    }

    private static void readFloat(JsdView view, Field field, Object value) {
        if (value instanceof Float) {
            try {
                field.set(view, value);
            } catch (IllegalAccessException e) {
            }
        } else {
            String data = value.toString();
            try {
                field.set(view, Float.parseFloat(data));
            } catch (Exception e) {
            }
        }
    }

    private static void readDouble(JsdView view, Field field, Object value) {
        if (value instanceof Double) {
            try {
                field.set(view, value);
            } catch (IllegalAccessException e) {
            }
        } else {
            try {
                String data = value.toString();
                field.set(view, Double.parseDouble(data));
            } catch (Exception e) {
            }
        }
    }

    private static void readBoolean(JsdView view, Field field, Object value) {
        if (value instanceof Boolean) {
            try {
                field.set(view, value);
            } catch (IllegalAccessException e) {
            }
        } else {
            try {
                String data = value.toString();
                field.set(view, Boolean.parseBoolean(data));
            } catch (Exception e) {
            }
        }
    }
}
