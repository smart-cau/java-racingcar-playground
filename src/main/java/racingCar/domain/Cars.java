package racingCar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import racingCar.domain.car.Car;
import racingCar.domain.car.MoveStrategy;

public class Cars {
    private final List<Car> cars;

    public Cars(String carNames) {
        if (carNames.isEmpty())
            throw new IllegalArgumentException();

        cars = mapStringToCars(carNames);
    }

    public Cars(List<Car> defaultCars) {
        this.cars = defaultCars;
    }

    private List<Car> mapStringToCars(String carNames) {
        List<Car> mappedCars = new ArrayList<>();

        for (String carName : carNames.split(",")) {
            mappedCars.add(new Car(carName));
        }

        return mappedCars;
    }

    public List<Car> moveAll(MoveStrategy moveStrategy) {
        cars.forEach((car) -> {
            car.move(moveStrategy);
        });
        return this.cars;
    }

    public String getWinners() {
        int maxPositionValue = this.cars
                .stream()
                .max((a, b) -> Integer.compare(a.getPosition().getValue(), b.getPosition().getValue()))
                .get()
                .getPosition()
                .getValue();

        String[] filteredWinners = this.cars
                .stream()
                .filter((car) -> car.getPosition().getValue() == maxPositionValue)
                .map((car) -> car.getCarName().getValue())
                .toArray(String[]::new);

        String winners = Stream.of(filteredWinners)
                .collect(Collectors.joining(","));

        return winners;
    }
}
