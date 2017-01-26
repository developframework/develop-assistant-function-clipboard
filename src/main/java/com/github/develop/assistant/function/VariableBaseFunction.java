package com.github.develop.assistant.function;

import com.github.develop.assistant.Application;
import com.github.develop.assistant.HotKeyFunction;

/**
 * Created by Administrator on 2017/1/24.
 */
public abstract class VariableBaseFunction implements HotKeyFunction {


    @Override
    public void event(Application application) {
        ClipboardContext clipboardContext = new ClipboardContext();
        String text = clipboardContext.getSystemClipboardTextContent();
        if(text != null && !text.isEmpty()) {
            String newText = dealText(text);
            clipboardContext.setSystemClipboardTextContent(newText);
        }
    }

    protected abstract String dealText(String variable);
}
