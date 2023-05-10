package racingCar.domain.car;

public class CarName {

    private final String name;

    public CarName(String name) {
        nameValidation(name);
        this.name = name;
    }

    public String getValue() {
        return this.name;
    }
    
    private void nameValidation(String name) {
        if (name.isEmpty()) throw new IllegalArgumentException();
        if (name.length() > 5) throw new IllegalArgumentException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarName position = (CarName) o;
        return this.name == position.getValue();
    }
}
