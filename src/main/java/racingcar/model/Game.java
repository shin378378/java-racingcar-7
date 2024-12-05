package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Game {
    private static int MOVABLE_NUMBER_STANDARD = 4;

    public void playGameAttemptCountRound(List<Car> racingCars, int attemptCount) {
        for (int i = 0; i < attemptCount; i++) {
            playGameOneRound(racingCars);
        }
    }

    private void playGameOneRound(List<Car> racingCars) {
        for (Car racingCar : racingCars) {
            if (checkISMovable()) racingCar.moveForward();
        }
    }

    private boolean checkISMovable() {
        int randomNumber = extractRandomNumber();
        return randomNumber >= MOVABLE_NUMBER_STANDARD;
    }

    private int extractRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    public List<Car> decideWinningCars(List<Car> racingCars) {
        int maxPosition = decideMaxPosition(racingCars);
        List<Car> winningRacingCars = racingCars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .toList();
        return winningRacingCars;
    }

    private int decideMaxPosition(List<Car> racingCars) {
        int maxPosition = racingCars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
        return maxPosition;
    }
}
