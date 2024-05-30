package baseball.domain;

import java.util.List;

public class Referee {

    // TODO 플레이어와 컴퓨터 수 비교
    public static Result compare(Computer computer, Player player) {
        int strike = 0;
        int ball = 0;

        List<Number> computerNumbers = computer.getNumbers();
        List<Number> playerNumbers = player.getNumbers();
        for (int i = 0; i < playerNumbers.size(); i++) {
            Number playerNumber = playerNumbers.get(i);
            if (playerNumber.number() == computerNumbers.get(i).number()) {
                strike++;
            } else if (computerNumbers.contains(playerNumber)) {
                ball++;
            }
        }

        return new Result(strike, ball);

//        String message = "";
//        if (strike == 3) {
//            message = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
//        } else if (strike > 0 && ball == 0) {
//            message = strike + "스트라이크";
//        } else if (ball > 0 && strike == 0) {
//            message = ball + "볼";
//        } else if (strike == 0 && ball == 0) {
//            message = "낫싱";
//        } else {
//            message = ball + "볼 " + strike + "스트라이크";
//        }
//        return message;
    }
}
