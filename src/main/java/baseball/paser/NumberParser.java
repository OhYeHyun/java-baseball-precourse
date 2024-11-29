package baseball.paser;

import java.util.Arrays;
import java.util.List;

public class NumberParser {

    public static List<Integer> parseUserNumber(String userNumber) {
        return Arrays.stream(userNumber.split(""))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toList();
    }

    public static int parseContinueNumber(String continueNumber) {
        return Integer.parseInt(continueNumber);
    }
}
