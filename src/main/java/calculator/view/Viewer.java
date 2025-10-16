package calculator.view;

public class Viewer {

    private final OutputView outputView;
    private final InputView inputView;

    public Viewer(OutputView outputView, InputView inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    public void printResult(String result) {
        outputView.printResult(result);
    }

    public String readInput() {
        return inputView.readInput();
    }

}
