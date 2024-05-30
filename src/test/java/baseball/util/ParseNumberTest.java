package baseball.util;

import baseball.domain.Number;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ParseNumberTest {

    @Test
    @DisplayName("문자열배열 List<Number> 변환")
    void toList() {
        List<Number> numbers = List.of(new Number(1), new Number(2), new Number(3));

        assertThat(ParseNumber.toList(new String[]{"1", "2", "3"})).isEqualTo(numbers);
    }

    @Test
    @DisplayName("리스트에 중복 수 확인")
    void duplicated() {
        assertThat(ParseNumber.toList(new String[]{"1", "1", "1"}).size()).isEqualTo(1);
        assertThat(ParseNumber.toList(new String[]{"1", "2", "2"}).size()).isEqualTo(2);
    }
}