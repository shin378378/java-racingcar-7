package racingcar.model;

public class Car {
    private final static int NAME_LIMIT_LENGTH = 5;
    private final static int MOVE_OFFSET = 1;

    private int position = 0;
    private String name = null;

    public Car(String name) {
        checkNameLengthOver5(name);
        this.name = name;
    }

    private void checkNameLengthOver5(String name) {
        if (name.length() > NAME_LIMIT_LENGTH) {
            throw new IllegalArgumentException("이름 길이는 " + NAME_LIMIT_LENGTH + "자를 초과할 수 없습니다.");
        }
    }

    public void moveForward() {
        position = position + MOVE_OFFSET;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
