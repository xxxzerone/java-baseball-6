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
    }
}
