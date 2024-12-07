package racingcar.model;

public class Car {
    private static final int NAME_LIMIT_LENGTH = 5;
    private static final int MOVE_OFFSET = 1;

    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
        checkUnderNameLimitLength(name);
    }

    private void checkUnderNameLimitLength(String name) {
        if (name.length() > NAME_LIMIT_LENGTH) {
            throw new IllegalArgumentException("[Error] 이름은 5자 이하여야 합니다.");
        }
    }

    public void moveForward() {
        this.position = position + MOVE_OFFSET;
    }

    public int getPosition() {
        return position;
    }
}
