package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Game {
    private static final int MOVABLE_NUMBER_STANDARD = 4;

    public void playOneGround(List){

    }

    private boolean checkMovable() {
        int randomNumber = createRandomNumber();
        return randomNumber >= MOVABLE_NUMBER_STANDARD;
    }

    private int createRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
