package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Game;
import racingcar.view.InputView;

import java.util.List;

public class Controller {
    private static final InputView inputView = new InputView();

    public void playGame(){
        String carNames = inputView.inputCarNames();
        Cars cars = new Cars(carNames);

        List<Car> racingCars = cars.getRacingCars();
        int trialCount = inputView.inputTrialCount();
        Game game = new Game();
        for (int i = 0; i < trialCount; i++) {
            game.playOneGround(racingCars);
        }
        System.out.println();
    }
}
