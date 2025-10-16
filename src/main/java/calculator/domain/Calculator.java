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
        //TODO 입력화면
        //TODO 동작
        //TODO 출력화면
    }

    private String process(String input) {
        //TODO 파싱
        //TODO 계산
        return "";
    }
}
