package racingcar.controller;

import racingcar.model.Cars;
import racingcar.view.InputView;

public class Controller {
    private static final InputView inputView = new InputView();

    public void playGame(){
        String carNames = inputView.inputCarNames();
        Cars cars = new Cars(carNames);
        int trialCount = inputView.inputTrialCount();
    }
}
