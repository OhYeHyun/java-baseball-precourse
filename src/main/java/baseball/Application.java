package baseball;

import baseball.controller.BaseBallController;
import baseball.domain.GameResults;
import baseball.initializer.GameInitializer;
import baseball.service.NumberService;
import baseball.service.ResultService;

public class Application {
    public static void main(String[] args) {
        GameResults gameResults = GameResults.getInstance();
        GameInitializer initializer = new GameInitializer(gameResults);
        NumberService numberService = new NumberService();
        ResultService resultService = new ResultService(gameResults);

        BaseBallController controller = new BaseBallController(initializer, numberService, resultService);
        controller.run();
    }
}
