package com.github.develop.assistant.function;

import com.github.develop.assistant.HotKey;
import com.melloware.jintellitype.JIntellitype;

public class LowerVarFunction extends VariableBaseFunction {

    @Override
    public HotKey hotKey(int identifier) {
        return new HotKey(JIntellitype.MOD_ALT, '1', "ALT + 1 小写字母开头");
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
