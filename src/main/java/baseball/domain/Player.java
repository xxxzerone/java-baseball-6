package baseball.domain;

import java.util.List;

public class Player {

    private List<Number> numbers;

    public Player(List<Number> numbers) {
        this.numbers = numbers;
    }

    public List<Number> getNumbers() {
        return numbers;
    }
}
