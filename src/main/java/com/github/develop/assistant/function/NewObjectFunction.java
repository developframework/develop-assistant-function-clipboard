package com.github.develop.assistant.function;

import com.github.develop.assistant.HotKey;
import com.melloware.jintellitype.JIntellitype;

/**
 * Created by Administrator on 2017/1/24.
 */
public class NewObjectFunction extends VariableBaseFunction {

    @Override
    public HotKey hotKey(int identifier) {
        return new HotKey(identifier, JIntellitype.MOD_ALT, '2', "构造新对象");
    }

    @Override
    protected String dealText(String variable) {
        String className = className(variable);
        String variableName = variableName(variable);
        return String.format("%s %s = new %s();", className, variableName, className);
    }

    private String className(String text) {
        char firstChar = text.charAt(0);
        if (firstChar >= 'a' && firstChar <= 'z') {
            return (char) (firstChar - 32) + text.substring(1);
        } else {
            return text;
        }
    }

    private String variableName(String text) {
        char firstChar = text.charAt(0);
        if (firstChar >= 'A' && firstChar <= 'Z') {
            return (char) (firstChar + 32) + text.substring(1);
        } else {
            return text;
        }
    }
}
