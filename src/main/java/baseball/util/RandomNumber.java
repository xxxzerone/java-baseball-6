package baseball.util;

import baseball.domain.Number;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomNumber {

    public static List<Number> generateComputer() {
        List<Number> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() < 3) {
            Number randomNumber = new Number(generate());
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return randomNumbers;
    }

    private static int generate() {
        return Randoms.pickNumberInRange(1, 9);
    }
}
