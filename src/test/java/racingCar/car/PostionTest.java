package racingCar.car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import racingCar.domain.car.Position;

public class PostionTest {
    Position position;

    @BeforeEach
    void setup() {
        position = new Position();
    }

    @Test
    void move_test() {
        Position moved = position.move();

        assertThat(moved).isEqualTo(new Position(1));
        assertThat(moved.getValue()).isEqualTo(1);
    }

    @Test
    void illegalArgument_test() {
        assertThatThrownBy(() -> new Position(-1))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
