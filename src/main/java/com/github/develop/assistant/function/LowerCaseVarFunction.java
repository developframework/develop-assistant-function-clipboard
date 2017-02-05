package com.github.develop.assistant.function;

import com.github.develop.assistant.HotKey;
import com.melloware.jintellitype.JIntellitype;

public class LowerCaseVarFunction extends VariableBaseFunction {

    @Override
    public HotKey hotKey(int identifier) {
        return new HotKey(identifier, JIntellitype.MOD_ALT, '1', "JAVA代码：Xxx -> xxx");
    }

    @Override
    protected String dealText(String variable) {
        char firstChar = variable.charAt(0);
        if (firstChar >= 'A' && firstChar <= 'Z') {
            return (char) (firstChar + 32) + variable.substring(1);
        } else {
            return variable;
        }
    }
}
