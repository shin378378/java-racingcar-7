package racingcar.model;

public class Car {
    private static final int NAME_LIMIT_LENGTH = 5;
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    private void checkUnderNameLimitLength(String name){
        if(name.length()>NAME_LIMIT_LENGTH){
            throw new IllegalArgumentException("[Error] 이름은 5자 이하여야 합니다.");
        }
    }
}
