package racingcar.model;

import java.util.Arrays;
import java.util.List;

public class Cars {
    private List<Car> racingCars;

    public Cars(String carNames) {
        this.racingCars = createCar(carNames);
    }

    private List<Car> createCar(String carNames) {
        List<Car> racingCars = Arrays.stream(carNames.split(","))
                .map(String::trim)
                //.filter(name -> !name.isEmpty()) //빈 값 제거
                .peek(name -> checkNameIsEmpty(name))
                .map(Car::new)
                .toList();
        return racingCars;
    }

    private void checkNameIsEmpty(String name){
        if(name.isEmpty()){
            throw new IllegalArgumentException("[ERROR] 빈 이름이 입력되었습니다.");
        }
    }
}
