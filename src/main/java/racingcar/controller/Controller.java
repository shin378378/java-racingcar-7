package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Game;
import racingcar.model.WinningCars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class Controller {
    private static final InputView inputView = new InputView();
    private static final OutputView outputView = new OutputView();
    private static final Game game = new Game();

    public void playGame(){
        String carNames = inputView.inputCarNames();
        Cars cars = new Cars(carNames);
        int attemptCount = Integer.parseInt(inputView.inputAttemptCount());
        List<Car> racingCars = cars.getRacingCars();
        playGameAttemptCountRound(racingCars, attemptCount);
        findWinningCars(racingCars);
    }

    public void playGameAttemptCountRound(List<Car> racingCars, int attemptCount) {
        outputView.outputAttemptResultMessage();
        for (int i = 0; i < attemptCount; i++) {
            game.playGameOneRound(racingCars);
            outputView.outputOneRoundResult(racingCars);
        }
    }

    public void findWinningCars(List<Car> racingCars){
        WinningCars winningCars = game.createWinningCars(racingCars);
        outputView.outputAttemptResultMessage();
        List<Car> winningRacingCars = winningCars.getRacingCars();
        outputView.outputWinningCars(winningRacingCars);
    }
}
