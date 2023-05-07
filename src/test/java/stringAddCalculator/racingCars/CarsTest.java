package stringAddCalculator.racingCars;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import racingCars.domain.Car;
import racingCars.domain.Cars;

public class CarsTest {
    Cars cars;
    String CAR_NAMES = "Benz,Ford,Kia";
    int TRY_NO = 5;

    @BeforeEach
    void setup() {
        cars = new Cars(CAR_NAMES);
    }

    @Test
    void moveAll_test1() {
        List<Car> movedCars = cars.moveAll(new ArrayList<>(List.of(4, 5, 6)));
        movedCars.forEach((car) -> {
            assertThat(car.getDistanceLength()).isEqualTo(1);
        });
    }

    @Test
    void moveAll_test0() {
        List<Car> movedCars = cars.moveAll(new ArrayList<>(List.of(4, 0, 0)));

        assertThat(movedCars.get(0).getDistanceLength()).isEqualTo(1);
        assertThat(movedCars.get(1).getDistanceLength()).isEqualTo(0);
        assertThat(movedCars.get(2).getDistanceLength()).isEqualTo(0);
    }

    @Test
    void moveAll_illegalArgumentException_test() {
        assertThatThrownBy(() -> cars.moveAll(new ArrayList<>(List.of(4, 0))))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void getWinners_one_winner_test() {
        List<Car> result = cars.moveAll(new ArrayList<>(List.of(4, 0, 0)));
        List<Car> winners = cars.getWinners(result);

        assertThat(winners.size()).isEqualTo(1);
        assertThat(winners.get(0).getCarName()).isEqualTo("Benz");
    }

    @Test
    void getWinners_two_winners_test() {
        List<Car> result = cars.moveAll(new ArrayList<>(List.of(4, 4, 0)));
        List<Car> winners = cars.getWinners(result);

        assertThat(winners.size()).isEqualTo(2);
        assertThat(winners.get(0).getCarName()).isEqualTo("Benz");
        assertThat(winners.get(1).getCarName()).isEqualTo("Ford");
    }
}
