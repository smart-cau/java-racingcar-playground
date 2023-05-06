package racingCars.domain;

public class Car {

    private final String name;
    private int distance;

	public Car(String name) throws IllegalArgumentException {
        if (name.length() > 5) throw new IllegalArgumentException();
        this.name = name;
        this.distance = 0;
	}

    public String getCarName() {
        return this.name;
    }

	public int move(int random) {
        if (moveCondition(random)) increaseDistance();
		return this.distance;
	}

    private int increaseDistance() {
        return this.distance++;
    }

    private boolean moveCondition(int random) {
        return random >= 4;
    }
    
}
