package baseball.domain;

import java.util.Objects;

public class Result {

    private final int strike;
    private final int ball;

    public Result(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Result result = (Result) object;
        return strike == result.strike && ball == result.ball;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strike, ball);
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }
}
