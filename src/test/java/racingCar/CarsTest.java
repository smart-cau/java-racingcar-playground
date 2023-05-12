package racingCar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import racingCar.domain.Cars;
import racingCar.domain.car.Car;
import racingCar.domain.car.MoveStrategy;
import racingCar.domain.car.Position;

public class CarsTest {
    Cars cars;
    static String CAR_NAMES = "Honda,Kia,Benz";

    @BeforeEach
    void setup() {
        cars = new Cars(CAR_NAMES);
    }

    @Test
    void moveAll_test() {
        List<Car> movedCars = cars.moveAll(new MoveStrategy() {
            @Override
            public boolean isMovable() {
                return true;
            }
        });

        movedCars.forEach((movedCar) -> {
            assertThat(movedCar.getPosition()).isEqualTo(new Position(1));
        });
    }

    @Test
    void getWinners_test() {
        cars = new Cars(
                Arrays.asList(new Car("Honda", 2),
                        new Car("Kia", 4), new Car("Honda", 4)));

        String winners = cars.getWinners();

        assertThat(winners.equals("Kia, Benz"));
    }
}
