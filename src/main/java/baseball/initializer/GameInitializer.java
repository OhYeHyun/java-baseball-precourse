package baseball.initializer;

import baseball.domain.GameResultType;
import baseball.domain.GameResults;

public class GameInitializer {
    private final GameResults gameResults;

    public GameInitializer(GameResults gameResults) {
        this.gameResults = gameResults;
    }

    public void initialize() {
        gameResults.addResult(new GameResultType("볼", 0));
        gameResults.addResult(new GameResultType("스트라이크", 0));
        gameResults.addResult(new GameResultType("낫싱", 0));
    }
}
