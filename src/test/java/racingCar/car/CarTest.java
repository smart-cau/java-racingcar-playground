package racingCar.car;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import racingCar.domain.car.Car;
import racingCar.domain.car.CarName;
import racingCar.domain.car.MoveStrategy;
import racingCar.domain.car.Position;

public class CarTest {
    static String CAR_NAME = "Ford";
    Car car;

    @BeforeEach
    void setup() {
        car = new Car(CAR_NAME);
    }

    @Test
    void instantiate_without_position_test () {
        assertThat(car.getPosition()).isEqualTo(new Position(0));    
    }

    @Test
    void instantiate_with_position_test () {
        car = new Car(CAR_NAME, 4);
        assertThat(car.getPosition()).isEqualTo(new Position(4));    
    } 

    @Test
    void getCarname_test() {
        CarName carName = car.getCarName();

        assertThat(carName).isEqualTo(new CarName(CAR_NAME));
    }

    @Test
    void dont_move_test() {
        car.move(new MoveStrategy() {
            @Override
            public boolean isMovable() {
                return false;
            }
        });
        assertThat(car.getPosition()).isEqualTo(new Position());
    }

    @Test
    void do_move_test() {
        // move에 아래와 같은 람다식은 결국 위처럼 MoveStrategy의 isMovable이 구현되는 식으로 처리됨
        // 람다로 간단히 시킬 수 있는 이유는 MoveStrategy가 하나의 method만 가지는 @FunctionalInterface이기 때문
        car.move(() -> true);
        assertThat(car.getPosition()).isEqualTo(new Position(1));
    }
}
