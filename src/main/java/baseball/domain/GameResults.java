package baseball.domain;

import java.util.ArrayList;
import java.util.List;

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

    public void setResult(GameResultType resultType, int amount) {
        resultType.setAmount(amount);
    }
}
