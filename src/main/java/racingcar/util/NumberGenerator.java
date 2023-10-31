package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class NumberGenerator {

    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;

    public int generateRandomNumber() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }
}