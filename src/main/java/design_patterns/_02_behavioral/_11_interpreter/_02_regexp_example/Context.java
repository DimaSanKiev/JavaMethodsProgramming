package design_patterns._02_behavioral._11_interpreter._02_regexp_example;

import java.util.ArrayDeque;

public class Context {
    private ArrayDeque<Integer> contextValues = new ArrayDeque<>();

    public Integer popValue() {
        return contextValues.pop();
    }

    public void pushValue(Integer value) {
        contextValues.push(value);
    }
}
