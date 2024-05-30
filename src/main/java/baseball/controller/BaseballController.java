package baseball.controller;

import baseball.domain.*;
import baseball.domain.Number;
import baseball.util.ParseNumber;
import baseball.util.RandomNumber;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class BaseballController {
    private final InputView INPUT_VIEW;
    private final OutputView OUTPUT_VIEW;

    public BaseballController(InputView inputView, OutputView outputView) {
        INPUT_VIEW = inputView;
        OUTPUT_VIEW = outputView;
    }

    public void execute() {
        final int THREE_STRIKE = 3;
        final int GAME_EXIT = 2;
        INPUT_VIEW.gameStartMessage();

        do {
            Computer computer = new Computer(RandomNumber.generateComputer());

            while (true) {
                String input = INPUT_VIEW.read();
                List<Number> numbers = ParseNumber.toList(split(input));
                if (numbers.size() < 3) {
                    throw new IllegalArgumentException("중복된 숫자를 입력하셨습니다.");
                }

                Result result = Referee.compare(computer, new Player(numbers));
                OUTPUT_VIEW.printResult(result);

                if (result.getStrike() == THREE_STRIKE) {
                    break;
                }
            }
        } while (INPUT_VIEW.readContinue() != GAME_EXIT);
    }

    private String[] split(String input) {
        return input.split("");
    }
}
