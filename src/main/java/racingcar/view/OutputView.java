package racingcar.view;

import racingcar.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public void outputTrialResult() {
        System.out.println("실행결과");
    }

    public void outputOneRoundTrialResult(List<Car> racingCars) {
        System.out.println();
        racingCars.stream()
                .map(racingCar -> racingCar.getName() + " : " + "-".repeat(racingCar.getPosition()))
                .forEach(System.out::println);
        System.out.println();
    }

    public void outputWinningRacingCars(List<Car> winningRacingCars) {
        String winningCars = winningRacingCars.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
        System.out.println("최종 우승자 : " + winningCars);
    }
}
