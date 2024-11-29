package baseball.service;

import baseball.domain.GameResults;

public class ResultService {
    private final GameResults results;

    public ResultService(GameResults results) {
        this.results = results;
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
}
