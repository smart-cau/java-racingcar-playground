package racingCars.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(String carNames) {
        cars = new ArrayList<>();
        for (String carName : carNames.split(",")) {
            cars.add(new Car(carName));
        }
    }

    public List<Car> moveAll(List<Integer> randomNos) {
        if (cars.size() != randomNos.size()) throw new IllegalArgumentException();

        for (int i = 0; i < cars.size(); i++) {
            cars.get(i)
                .move(randomNos.get(i));
        }
        return cars;
    }

    public List<Car> getWinners(List<Car> result) {
        int maxDistance = result.stream()
                .max((a, b) -> Integer.compare(a.getDistanceLength(), b.getDistanceLength()))
                .get()
                .getDistanceLength();

        List<Car> winners = new ArrayList<>();

        result.forEach((car) -> {
            if (car.getDistanceLength() >= maxDistance) {
                winners.add(car);
            }
        });
        return winners;
    }

}
