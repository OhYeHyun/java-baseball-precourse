package baseball.controller;

import baseball.initializer.GameInitializer;
import baseball.paser.NumberParser;
import baseball.service.ContinueService;
import baseball.service.MatchService;
import baseball.service.NumberService;
import baseball.service.ResultService;
import baseball.view.BaseBallInputView;
import baseball.view.BaseBallOutputView;
import java.util.List;

public class BaseBallController {
    private final GameInitializer initializer;
    private final NumberService numberService;
    private MatchService matchService;
    private final ResultService resultService;

    public BaseBallController(GameInitializer initializer, NumberService numberService, ResultService resultService) {
        this.initializer = initializer;
        this.numberService = numberService;
        this.resultService = resultService;
    }

    public void run() {
        processInitialize();

        boolean playing = true;
        while (playing) {
            processStart();
            processGuessing();
            playing = processContinue();
        }
    }

    private void processInitialize() {
        initializer.initialize();
        BaseBallOutputView.instructionStart();
    }

    private void processStart() {
        numberService.generateComputerNumber();
        matchService = new MatchService(numberService.getComputerNumber(), resultService);
    }

    private void processGuessing() {
        while (!resultService.guessAll()) {
            numberService.generateUserNumber(getUserNumber());
            matchService.compare(numberService.getUserNumber());

            BaseBallOutputView.displayResult(resultService.getGameResults());
        }
        resultService.reset();
    }

    private boolean processContinue() {
        return ContinueService.toContinue(getContinueNumber());
    }

    private List<Integer> getUserNumber() {
        BaseBallOutputView.InstructionUserNumber();
        return NumberParser.parseUserNumber(BaseBallInputView.getNumber());
    }

    private int getContinueNumber() {
        BaseBallOutputView.instructionGuessAll();
        return NumberParser.parseContinueNumber(BaseBallInputView.getNumber());
    }
}
