package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GameResults {
    private static final GameResults instance = new GameResults();
    private static final List<GameResultType> gameResults = new ArrayList<>();

    private GameResults() {}

    public static GameResults getInstance() {
        return instance;
    }

    public void addResult(GameResultType resultType) {
        gameResults.add(resultType);
    }

    public void increase(String name) {
        GameResultType resultType = findResultType(name);
        resultType.increase();
    }

    public void reset() {
        gameResults.forEach(GameResultType::reset);
    }

    public boolean guessAll() {
        GameResultType resultType = findResultType("스트라이크");
        return resultType.getAmount() == 3;
    }

    private GameResultType findResultType(String name) {
        return gameResults.stream().filter(type ->  Objects.equals(type.getName(), name)).findFirst().get();
    }
}
