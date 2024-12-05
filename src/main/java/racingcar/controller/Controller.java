package racingcar.controller;

import racingcar.model.Cars;
import racingcar.view.InputView;

public class Controller {
    private static final InputView inputView = new InputView();

    public void makeCars(){
        String carNames = inputView.inputCarNames();
        Cars cars = new Cars(carNames);
    }
}
