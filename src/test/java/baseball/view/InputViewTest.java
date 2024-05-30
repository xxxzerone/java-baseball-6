package baseball.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InputViewTest {

    @Test
    @DisplayName("숫자 한자리씩 split")
    void split() {
        assertThat("123".split("")).isEqualTo(new String[]{"1", "2", "3"});
    }
}