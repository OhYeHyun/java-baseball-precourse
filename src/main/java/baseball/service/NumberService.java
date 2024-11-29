package baseball.service;

import baseball.domain.NumberGenerator;
import baseball.validator.BaseBallBusinessValidator;
import java.util.Collections;
import java.util.List;

public class NumberService {
    private List<Integer> computerNumber;
    private List<Integer> userNumber;

    public void generateComputerNumber() {
        computerNumber = NumberGenerator.numberGenerate(3);
    }

    public void generateUserNumber(List<Integer> number) {
        BaseBallBusinessValidator.validateUserNumber(number);
        userNumber = number;
    }

    public List<Integer> getComputerNumber() {
        return Collections.unmodifiableList(computerNumber);
    }

    public List<Integer> getUserNumber() {
        return Collections.unmodifiableList(userNumber);
    }}
