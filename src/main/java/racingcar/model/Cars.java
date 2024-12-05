package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    protected List<Car> racingCars = new ArrayList<>();

    public Cars() {
    }

    public Cars(String carNames) {
        List<String> names = splitName(carNames);
        for (String name : names) {
            racingCars.add(new Car(name));
        }
    }

    private List<String> splitName(String carNames){
        List<String> names = Arrays.stream(carNames.split(","))
                .map(String::trim)
                .toList();
        return names;
    }
}
