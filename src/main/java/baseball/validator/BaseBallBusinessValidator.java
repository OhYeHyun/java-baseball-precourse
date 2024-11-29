package baseball.validator;

import java.util.HashSet;
import java.util.List;

public class BaseBallBusinessValidator {

    public static void validateUserNumber(List<Integer> userNumber) {
        userNumberLength(userNumber);
        userNumberRange(userNumber);
        userNumberUnique(userNumber);
    }

    public static void validateContinueNumber(int continueNumber) {
        continueNumberExactly(continueNumber);
    }

    private static void userNumberLength(List<Integer> userNumber) {
        if (userNumber.size() != 3) {
            throw new IllegalArgumentException("[ERROR] 3자리 숫자로 입력해 주세요.");
        }
    }

    private static void userNumberRange(List<Integer> userNumber) {
        userNumber.forEach(num -> {
            if (num < 1 || num > 9) {
                throw new IllegalArgumentException("[ERROR] 1 ~ 9 사이의 숫자로 입력해 주세요.");
            }
        });
    }

    private static void userNumberUnique(List<Integer> userNumber) {
        int size = new HashSet<>(userNumber).size();
        if (size != 3) {
            throw new IllegalArgumentException("[ERROR] 서로 다른 숫자로 입력해 주세요.");
        }
    }

    private static void continueNumberExactly(int continueNumber) {
        if (continueNumber != 1 && continueNumber != 2) {
            throw new IllegalArgumentException("[ERROR] 1 또는 2로 입력해 주세요");
        }
    }
}
