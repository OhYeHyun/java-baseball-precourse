package baseball.service;

import java.util.List;

public class MatchService {
    private final List<Integer> computerNumber;
    private final ResultService resultService;

    public MatchService(List<Integer> computerNumber, ResultService resultService) {
        this.computerNumber = computerNumber;
        this.resultService = resultService;
    }

    public void compare(List<Integer> userNumber) {
        int nothingCount = 0;
        for (int i = 0; i < userNumber.size(); i++) {
            int curNum = userNumber.get(i);
            if (computerNumber.contains(curNum)) {
                if (computerNumber.indexOf(curNum) == i) {
                    resultService.strike();
                }
                if (computerNumber.indexOf(curNum) != i) {
                    resultService.ball();
                }
            }
            nothingCount++;
        }
        if (nothingCount == 3) {
            resultService.nothing();
        }
    }
}
