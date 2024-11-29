package baseball.view;

import baseball.domain.GameResultType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BaseBallOutputView {

    public static void println(String text) {
        System.out.println(text);
    }

    public static void print(String text) {
        System.out.print(text);
    }

    public static void instructionStart() {
        println("숫자 야구 게임을 시작합니다.");
    }

    public static void InstructionUserNumber() {
        print("숫자를 입력해주세요 : ");
    }

    public static void displayResult(List<GameResultType> gameResults) {
        List<String> displayResult = new ArrayList<>();
        gameResults.forEach(result -> {
            if (result.getAmount() != 0) {
                if (Objects.equals(result.getName(), "낫싱")) {
                    displayResult.add(result.getName());
                }
                if (!Objects.equals(result.getName(), "낫싱")) {
                    displayResult.add(result.getAmount() + result.getName());
                }
            }
        });

        println(String.join(" ", displayResult));
    }

    public static void instructionGuessAll() {
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
