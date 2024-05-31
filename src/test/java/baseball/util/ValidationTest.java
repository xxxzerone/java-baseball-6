package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidationTest {

    @Test
    @DisplayName("입력값 길이 성공")
    void regexr_size_success() {
        assertTrue(Validation.isSize("213"));
        assertTrue(Validation.isSize("195"));
    }

    @Test
    @DisplayName("입력값 길이 실패")
    void regexr_size_fail() {
        assertFalse(Validation.isSize("21"));
        assertFalse(Validation.isSize("1954"));
    }

    @Test
    @DisplayName("입력값 all 숫자 성공")
    void regexr_number_success() {
        assertTrue(Validation.isNumber("213"));
        assertTrue(Validation.isNumber("195"));
    }

    @Test
    @DisplayName("입력값 중 문자 or 0 실패")
    void regexr_number_fail() {
        assertFalse(Validation.isNumber("2a3"));
        assertFalse(Validation.isNumber("!95"));
        assertFalse(Validation.isNumber("49F"));
        assertFalse(Validation.isNumber("490"));
    }
}