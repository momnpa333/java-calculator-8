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
        Validator.isValid(operand);
        Long sum = 0L;
        for (String number : operand) {
            sum += Long.parseLong(number);
        }
        return sum;
    }

    private static final class Validator {
        static void isValid(String[] operand) {
            for (String s : operand) {
                checkLong(s);
                checkNegative(Long.parseLong(s));
            }
        }

        private static void checkLong(String s) {
            try {
                Long.parseLong(s);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("정수 형식이 아닙니다: " + s);
            }
        }

        private static void checkNegative(long num) {
            if (num < 0) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다: " + num);
            }
        }
    }
}
