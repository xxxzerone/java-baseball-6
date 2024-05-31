package baseball.view;

import baseball.domain.Result;

public class OutputView {

    private final String THREE_STRIKE_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private final String STRIKE_MESSAGE = "스트라이크";
    private final String BALL_MESSAGE = "볼";
    private final String NOTHING_MESSAGE = "낫싱";

    public void printResult(Result result) {
        int ball = result.getBall();
        int strike = result.getStrike();

        if (strike == 3) {
            System.out.println(strike + STRIKE_MESSAGE);
            System.out.println(THREE_STRIKE_MESSAGE);
            return;
        } else if (strike == 0 && ball == 0) {
            System.out.println(NOTHING_MESSAGE);
            return;
        } else if (ball == 0) {
            System.out.println(strike + STRIKE_MESSAGE);
            return;
        } else if (strike == 0) {
            System.out.println(ball + BALL_MESSAGE);
            return;
        }

        System.out.println(ball + BALL_MESSAGE + " " + strike + STRIKE_MESSAGE);
    }
}
