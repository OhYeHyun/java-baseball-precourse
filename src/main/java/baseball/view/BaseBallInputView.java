package baseball.view;

import baseball.validator.BaseBallFormatValidator;
import camp.nextstep.edu.missionutils.Console;

public class BaseBallInputView {

    private static String getInput() {
        return Console.readLine();
    }

    public static String getNumber() {
        String number = getInput();
        BaseBallFormatValidator.validateNumber(number);

        return number;
    }
}
