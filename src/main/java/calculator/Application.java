package calculator;

import calculator.domain.Calculator;
import calculator.factory.CalculatorFactory;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = CalculatorFactory.calculator();
        calculator.run();
    }
}
