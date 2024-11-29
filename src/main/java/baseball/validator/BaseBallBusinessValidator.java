package baseball.validator;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BaseBallBusinessValidator {

    public static void validateUserNumber(String userNumber) {
        userNumberLength(userNumber);
        userNumberRange(userNumber);
        userNumberUnique(userNumber);
    }

    public static void validateContinueNumber(String continueNumber) {
        continueNumberExactly(continueNumber);
    }

    private static void userNumberLength(String userNumber) {
        if (userNumber.length() != 3) {
            throw new IllegalArgumentException("[ERROR] 3자리 숫자로 입력해 주세요.");
        }
    }

    private static void userNumberRange(String userNumber) {
        Arrays.stream(userNumber.split("")).forEach(num -> {
            int number = Integer.parseInt(num);
            if (number < 1 || number > 9) {
                throw new IllegalArgumentException("[ERROR] 1 ~ 9 사이의 숫자로 입력해 주세요.");
            }
        });
    }

    private static void userNumberUnique(String userNumber) {
        int size = Arrays.stream(userNumber.split("")).collect(Collectors.toSet()).size();
        if (size != 3) {
            throw new IllegalArgumentException("[ERROR] 서로 다른 숫자로 입력해 주세요.");
        }
    }

    private static void continueNumberExactly(String continueNumber) {
        int number = Integer.parseInt(continueNumber);
        if (number != 1 && number != 2) {
            throw new IllegalArgumentException("[ERROR] 1 또는 2로 입력해 주세요");
        }
    }
}
