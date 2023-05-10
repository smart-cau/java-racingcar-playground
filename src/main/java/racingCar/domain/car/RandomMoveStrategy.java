package racingCar.domain.car;

import java.util.Random;

public class RandomMoveStrategy implements MoveStrategy {
    private static final int MAX_BOUND = 9;
    private static final int CRITATION_NUMBER = 4;

    @Override
    public boolean isMovable() {
        Random random = new Random();
        int randomNo = random.nextInt(MAX_BOUND);
        if (randomNo >= CRITATION_NUMBER)
            return true;

        return false;
    }
}
