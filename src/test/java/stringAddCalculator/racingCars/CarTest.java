package stringAddCalculator.racingCars;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import racingCars.domain.Car;

public class CarTest {
    Car car;
    String CAR_NAME = "Ford";

    @BeforeEach
    void setup() {
        car = new Car(CAR_NAME);
    }

    @Test
    void getCarName_test() {
        String carName = car.getCarName();
        assertThat(carName).isEqualTo(CAR_NAME);
    }

    @Test
    void illegalCarName_test() {
        assertThatThrownBy(() -> new Car("Too long car name"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void move_test() {
        String distance = car.move(5);
        assertThat(distance.equals("-")).isTrue();
    }
}
