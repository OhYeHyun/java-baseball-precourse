package baseball.service;

import baseball.validator.BaseBallBusinessValidator;

public class ContinueService {

    public static boolean toContinue(int answer) {
        BaseBallBusinessValidator.validateContinueNumber(answer);
        if (answer == 1) {
            return true;
        }
        return false;
    }
}
