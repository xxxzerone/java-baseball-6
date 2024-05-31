package baseball.domain;

public class Referee {

    public static Result check(Computer computer, Player player) {
        return computer.compare(player);
    }
}
