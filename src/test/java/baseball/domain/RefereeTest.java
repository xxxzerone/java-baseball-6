package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RefereeTest {

    private Number n1;
    private Number n2;
    private Number n3;
    Computer computer;

    @BeforeEach
    void setUp() {
        n1 = new Number(1);
        n2 = new Number(4);
        n3 = new Number(3);
        computer = new Computer(List.of(n1, n2, n3));
    }

    @Test
    @DisplayName("3스트라이크")
    void threeStrike() {
        Player player = new Player(List.of(n1, n2, n3));

        assertThat(Referee.compare(computer, player)).isEqualTo("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    @Test
    @DisplayName("2스트라이크")
    void twoStrike() {
        Player player = new Player(List.of(n1, n2, new Number(5)));

        assertThat(Referee.compare(computer, player)).isEqualTo("2스트라이크");
    }

    @Test
    @DisplayName("2볼")
    void twoBall() {
        Player player = new Player(List.of(new Number(5), n1, n2));

        assertThat(Referee.compare(computer, player)).isEqualTo("2볼");
    }

    @Test
    @DisplayName("2볼 1스트라이크")
    void twoBall_oneStrike() {
        Player player = new Player(List.of(n1, n3, n2));

        assertThat(Referee.compare(computer, player)).isEqualTo("2볼 1스트라이크");
    }

    @Test
    @DisplayName("1볼 1스트라이크")
    void oneBall_oneStrike() {
        Player player = new Player(List.of(n3, n2, new Number(5)));

        assertThat(Referee.compare(computer, player)).isEqualTo("1볼 1스트라이크");
    }
}