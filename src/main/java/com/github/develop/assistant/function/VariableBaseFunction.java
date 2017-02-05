package com.github.develop.assistant.function;

import com.github.develop.assistant.HotKeyFunction;

import java.awt.*;

/**
 * Created by Administrator on 2017/1/24.
 */
public abstract class VariableBaseFunction implements HotKeyFunction {


    @Override
    public void event() {
        ClipboardContext clipboardContext = new ClipboardContext();
        String text = clipboardContext.getSystemClipboardTextContent();
        if(text != null && !text.isEmpty()) {
            String newText = dealText(text);
            clipboardContext.setSystemClipboardTextContent(newText);
        }
    }

    protected abstract String dealText(String variable);

    @Override
    public MenuItem createMenuItem() {
        return null;
    }
}
