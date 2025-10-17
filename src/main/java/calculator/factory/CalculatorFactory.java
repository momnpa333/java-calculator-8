package calculator.factory;

import calculator.domain.Calculator;
import calculator.domain.Parser;
import calculator.view.InputView;
import calculator.view.OutputView;
import calculator.view.Viewer;

public final class CalculatorFactory {

    private CalculatorFactory() {
    }

    public static Calculator calculator() {
        return new Calculator(parser(), viewer());
    }

    private static Parser parser() {
        return new Parser();
    }

    private static Viewer viewer() {
        return new Viewer(outputView(), inputView());
    }

    private static InputView inputView() {
        return new InputView();
    }

    private static OutputView outputView() {
        return new OutputView();
    }
}
