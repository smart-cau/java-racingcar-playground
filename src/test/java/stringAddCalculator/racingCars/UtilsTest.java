package stringAddCalculator.racingCars;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import racingCars.utils.Utils;

public class UtilsTest {
    @Test
    void getRandomNos_test() {
        List<Integer> randomNos = Utils.getRandomNos(3);
        randomNos.forEach((number) -> {
            assertThat(0 <= number && number <= 9).isTrue();
        });
    }
}
