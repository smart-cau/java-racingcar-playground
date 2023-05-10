package racingCar.domain.car;

@FunctionalInterface
public interface MoveStrategy {
    boolean isMovable();
}
