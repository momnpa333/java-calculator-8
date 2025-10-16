package calculator.domain;

import calculator.view.Viewer;

public class Calculator {
    private final Parser parser;
    private final Viewer viewer;

    public Calculator(Parser parser, Viewer viewer) {
        this.parser = parser;
        this.viewer = viewer;
    }

    public void run() {
        String input = viewer.readInput();
        String result = process(input);
        viewer.printResult(result);
    }

    private String process(String input) {
        String[] operand = parser.getOperand(input);
        Long sum = calculate(operand);
        return String.valueOf(sum);
    }

    private Long calculate(String[] operand) {
        Long sum = 0L;
        for (String number : operand) {
            sum += Long.parseLong(number);
        }
        return sum;
    }
}
