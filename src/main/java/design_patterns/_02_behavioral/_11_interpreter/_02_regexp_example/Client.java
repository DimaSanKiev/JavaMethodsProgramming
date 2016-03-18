package design_patterns._02_behavioral._11_interpreter._02_regexp_example;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private ArrayList<AbstractMathExpression> listExpressions;

    public Client(String expression) {
        listExpressions = new ArrayList<>();
        parse(expression);
    }

    private void parse(String expression) {     // syntax analysis
        for (String lexeme : expression.split("\\p{Blank}+")) {
            if (lexeme.isEmpty()) {
                continue;
            }

            char temp = lexeme.charAt(0);
            switch (temp) {
                case '+':
                    listExpressions.add(new TerminalExpressionPlus());
                    break;
                case '-':
                    listExpressions.add(new TerminalExpressionMinus());
                    break;
                case '/':
                    listExpressions.add(new TerminalExpressionDivide());
                    break;
                case '*':
                    listExpressions.add(new TerminalExpressionMultiply());
                    break;
                default:
                    Scanner scan = new Scanner(lexeme);
                    if (scan.hasNextInt()) {
                        listExpressions.add(new NonterminalExpressionNumber(scan.nextInt()));
                    }
            }
        }
    }

    public Number calculate() {
        Context context = new Context();
        // simple tasks execution and resulting
        for (AbstractMathExpression terminal : listExpressions) {
            terminal.interpret(context);
        }
        return context.popValue();
    }
}
