package baseball.util;

import java.util.regex.Pattern;

public class Validation {

    private static final int NUMBER_SIZE = 3;
    private static final Pattern PLAY_RANGE_NUMBER = Pattern.compile("([1-9]+){3}");
    private static final Pattern CONTINUE_RANGE_NUMBER = Pattern.compile("[1|2]");

    public static boolean isSize(String value) {
        return value.length() == NUMBER_SIZE;
    }

    public static boolean isNumber(String value) {
        return PLAY_RANGE_NUMBER.matcher(value).find();
    }

    public static boolean isContinueNumber(String value) {
        return CONTINUE_RANGE_NUMBER.matcher(value).find();
    }
}
