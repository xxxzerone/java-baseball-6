package baseball.util;

import java.util.regex.Pattern;

public class Validation {

    private static final Pattern PLAY_RANGE_NUMBER = Pattern.compile("[1-9]{3}");
    private static final Pattern CONTINUE_RANGE_NUMBER = Pattern.compile("[1|2]");

    public static boolean isThreeNumber(String value) {
        return PLAY_RANGE_NUMBER.matcher(value).find();
    }

    public static boolean isContinueNumber(String value) {
        return CONTINUE_RANGE_NUMBER.matcher(value).find();
    }
}
