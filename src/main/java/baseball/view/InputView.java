package baseball.view;

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
        return Console.readLine();
    }

    public String readContinue() {
        System.out.println(CONTINUE_MESSAGE);
        return Console.readLine();
    }
}
