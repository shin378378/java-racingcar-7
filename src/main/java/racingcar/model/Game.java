package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;
import java.util.List;

public class Game {
    private static final int MOVABLE_NUMBER_STANDARD = 4;

    public void playOneGround(List<Car> racingCars){
        for (Car car : racingCars) {
            if(checkMovable()){
                car.moveForward();
            }
        }
    }

    private boolean checkMovable() {
        int randomNumber = createRandomNumber();
        return randomNumber >= MOVABLE_NUMBER_STANDARD;
    }

    private int createRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    public List<Car> decideWinningCars(List<Car> racingCars){
        racingCars.stream()
                .max(getPosition())
                .stream().toList();
    }
}
