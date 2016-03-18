package design_patterns._02_behavioral._11_interpreter._02_regexp_example;

public class TerminalExpressionMultiply extends AbstractMathExpression {
    @Override
    public void interpret(Context c) {
        c.pushValue(c.popValue() * c.popValue());
    }
}
