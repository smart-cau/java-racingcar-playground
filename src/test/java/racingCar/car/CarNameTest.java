package racingCar.car;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.jupiter.api.Test;

import racingCar.domain.car.CarName;
public class CarNameTest {
    @Test
    void getCarname_test() {
        String NAME = "Ford";
        CarName carName = new CarName(NAME);

        assertThat(carName.getValue()).isEqualTo(NAME);
    }

    @Test
    void illegalArgument_empty_name_test() {
        assertThatThrownBy(() -> new CarName(""))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void illegalArgument_long_name_test() {
        assertThatThrownBy(() -> new CarName("too long name"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
