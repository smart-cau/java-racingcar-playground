package racingCars.domain;

public class Car {

    private final String name;
    private String distance;

	public Car(String name) throws IllegalArgumentException {
        if (name.length() > 5) throw new IllegalArgumentException();
        this.name = name;
        this.distance = "";
	}

    public String getCarName() {
        return this.name;
    }

    public String getDistance() {
        return this.distance;
    }

    public int getDistanceLength() {
        return this.distance.length();
    }

	public String move(int random) {
        if (moveCondition(random)) increaseDistance();
		return this.distance;
	}

    private void increaseDistance() {
        this.distance = new StringBuilder(distance).append("-").toString();
    }

    private boolean moveCondition(int random) {
        return random >= 4;
    }
    
}
