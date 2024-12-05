package racingcar.view;

import racingcar.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {

    public void outputAttemptResultMessage() {
        System.out.println("실행 결과");
    }

    public void outputOneRoundResult(List<Car> racingCars) {
        racingCars.stream()
                .map(racingCar -> racingCar.getName() + " : " + "-".repeat(racingCar.getPosition()))
                .forEach(System.out::println);
        System.out.println();
    }

    public void outputWinningCars(List<Car> winningCars) {
        String winners = winningCars.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
        System.out.println("최종 우승자 : " + winners);
    }
}
