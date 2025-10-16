package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String INPUT_MESSAGE = "덧셈할 문자열을 입력하세요: ";

    public String readInput() {
        System.out.print(INPUT_MESSAGE);
        return Console.readLine();
    }
}
