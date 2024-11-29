package baseball.service;

import baseball.domain.GameResultType;
import baseball.domain.GameResults;
import java.util.List;

public class ResultService {
    private final GameResults results;

    public ResultService(GameResults results) {
        this.results = results;
    }

    public void reset() {
        results.reset();
    }

    public void strike() {
        results.increase("스트라이크");
    }

    public void ball() {
        results.increase("볼");
    }

    public void nothing() {
        results.increase("낫싱");
    }

    public boolean guessAll() {
        return results.guessAll();
    }

    public List<GameResultType> getGameResults() {
        return results.getGameResults();
    }
}
