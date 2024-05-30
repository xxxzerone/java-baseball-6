package baseball.util;

import baseball.domain.Number;

import java.util.Arrays;
import java.util.List;

public class ParseNumber {

    public static int parseNumber(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }
    }

    public static List<Number> toList(String[] split) {
        return Arrays.stream(split)
                .distinct()
                .mapToInt(Integer::parseInt)
                .mapToObj(Number::new)
                .toList();
    }
}
