package racingCar.domain.car;

public class Car {
    private final CarName carName;
    private Position position;

    public Car(String carNameString) {
        this.carName = new CarName(carNameString);
        this.position = new Position(0);
    }

    public Car(String carNameString, int position) {
        this.carName = new CarName(carNameString);
        this.position = new Position(position);
    }

    public CarName getCarName() {
        return this.carName;
    }

    public Position getPosition() {
        return this.position;
    }

    public void move(MoveStrategy movableStrategy) {
        if (movableStrategy.isMovable())
            this.position = position.move();
    }
}
