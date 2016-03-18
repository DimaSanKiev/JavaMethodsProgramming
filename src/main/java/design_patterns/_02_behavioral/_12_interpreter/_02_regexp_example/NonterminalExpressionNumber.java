package design_patterns._02_behavioral._12_interpreter._02_regexp_example;

public class NonterminalExpressionNumber extends AbstractMathExpression {
    private int number;

    public NonterminalExpressionNumber(int number) {
        this.number = number;
    }

    @Override
    public void interpret(Context c) {
        c.pushValue(number);
    }
}
