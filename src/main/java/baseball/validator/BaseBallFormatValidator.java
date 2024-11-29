package baseball.validator;

public class BaseBallFormatValidator {

    public static void validateNumber(String userNumber) {
        isExist(userNumber);
        isNumeric(userNumber);
    }

    private static void isExist(String userNumber) {
        if (userNumber.isBlank()) {
            throw new IllegalArgumentException("[ERROR] 공백은 허용되지 않습니다.");
        }
    }

    private static void isNumeric(String userNumber) {
        try {
            Integer.parseInt(userNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자로 입력해 주세요.");
        }
    }
}
