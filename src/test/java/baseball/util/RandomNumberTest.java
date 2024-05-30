package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNumberTest {

    @Test
    @DisplayName("컴퓨터 랜덤 수 3개 확인")
    void computerNumber_size() {
        assertThat(RandomNumber.generateComputer().size()).isEqualTo(3);
    }
}