package baseball.domain;

import java.util.List;

public class Computer {

    private final List<Number> numbers;

    public Computer(List<Number> numbers) {
        this.numbers = numbers;
    }

    public Result compare(Player player) {
        int strike = 0;
        int ball = 0;

        List<Number> playerNumbers = player.getNumbers();
        for (int i = 0; i < numbers.size(); i++) {
            Number playerNumber = playerNumbers.get(i);
            if (numbers.get(i).equals(playerNumber)) {
                strike++;
            } else if (numbers.contains(playerNumber)) {
                ball++;
            }
        }

        return new Result(strike, ball);
    }
}
