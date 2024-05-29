package baseball.domain;

import java.util.List;

public class Computer {

    private final List<Number> numbers;

    public Computer(List<Number> numbers) {
        this.numbers = numbers;
    }

    public List<Number> getNumbers() {
        return numbers;
    }
}
