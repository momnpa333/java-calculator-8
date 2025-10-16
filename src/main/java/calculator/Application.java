package calculator;

import calculator.domain.Calculator;
import calculator.domain.Parser;
import calculator.view.InputView;
import calculator.view.OutputView;
import calculator.view.Viewer;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        Viewer viewer = new Viewer(outputView, inputView);
        Parser parser = new Parser();
        Calculator calculator = new Calculator(parser, viewer);
        calculator.run();
    }
}
