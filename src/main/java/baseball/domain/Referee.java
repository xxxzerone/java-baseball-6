package baseball.domain;

import java.util.List;

public class Referee {

    // TODO 플레이어와 컴퓨터 수 비교
    public static String compare(Computer computer, Player player) {
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

        // TODO 비교 결과 출력 임시용(나중에 리팩토링)
        String message = "";
        if (strike == 3) {
            message = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
        } else if (strike > 0 && ball == 0) {
            message = strike + "스트라이크";
        } else if (ball > 0 && strike == 0) {
            message = ball + "볼";
        }  else {
            message = ball + "볼 " + strike + "스트라이크";
        }
        return message;
    }
}
