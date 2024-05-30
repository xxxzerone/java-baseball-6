package baseball.view;

import baseball.util.ParseNumber;
import baseball.util.Validation;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String CONTINUE_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public void gameStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }

    public String read() {
        System.out.println(INPUT_NUMBER_MESSAGE);

        String input = Console.readLine();
        if (!Validation.isSize(input)) {
            throw new IllegalArgumentException("3개의 숫자만 입력 가능합니다.");
        }
        return input;
    }

    public int readContinue() {
        System.out.println(CONTINUE_MESSAGE);

        String input = Console.readLine();
        if (!Validation.isContinueNumber(input)) {
            throw new IllegalArgumentException("1 or 2 숫자만 가능합니다.");
        }
        return ParseNumber.parseNumber(input);
    }
}
