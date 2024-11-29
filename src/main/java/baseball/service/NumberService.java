package baseball.service;

import baseball.domain.NumberGenerator;
import java.util.Collections;
import java.util.List;

public class NumberService {
    private List<Integer> computerNumber;
    private List<Integer> userNumber;

    public void generateComputerNumber() {
        computerNumber = NumberGenerator.numberGenerate(3);
    }

    public void generateUserNumber(String number) {
        number.chars().forEach(num -> userNumber.add(num));
    }

    public List<Integer> getComputerNumber() {
        return Collections.unmodifiableList(computerNumber);
    }

    public List<Integer> getUserNumber() {
        return Collections.unmodifiableList(userNumber);
    }}
