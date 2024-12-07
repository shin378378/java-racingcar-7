package racingcar.view;

import racingcar.model.Car;

import java.util.Arrays;
import java.util.List;

public class OutputView {
    public void outputTrialResult(){
        System.out.println("실행결과");
    }

    public void outputOneRoundTrialResult(List<Car> racingCars){
        racingCars.stream()
                .map(racingCar -> racingCar.getPosition()+" : "+"-".repeat(racingCar.getPosition()))
                .forEach(System.out::println);
    }
}
