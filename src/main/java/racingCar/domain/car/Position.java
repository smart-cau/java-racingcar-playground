package racingCar.domain.car;

public class Position {

    private final int position;

    public Position() {
        this.position = 0;
    }

    public Position(int position) {
        if (position < 0) throw new IllegalArgumentException("value of position should be greater than zero");
        this.position = position;
    }

    public Position move() {
        return new Position(this.position + 1);
    }

    public int getValue() {
        return this.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;
        return this.position == position.getValue();
    }

}
