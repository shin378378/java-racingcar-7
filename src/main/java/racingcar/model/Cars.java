package racingcar.model;

import java.util.Arrays;
import java.util.List;

public class Cars {
    private List<Car> racingCars;

    public Cars(String carNames) {
        this.racingCars = createCar(carNames);
    }

    private List<Car> createCar(String carNames){
        List<Car> racingCars = Arrays.stream(carNames.split(","))
                .map(String::trim)
                .map(Car::new)
                .toList();
        return racingCars;
    }
}
