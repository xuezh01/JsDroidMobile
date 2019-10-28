package com.jsdroid.app.main.list;

import com.jsdroid.app.entity.Tool;
import com.jsdroid.jsdroid_letter_list.LetterModel;

public class ToolModel extends LetterModel {
    public Tool tool;

    public ToolModel(Tool tool) {
        super(tool.name);
        this.tool = tool;
    }

}
