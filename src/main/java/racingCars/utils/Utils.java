package racingCars.utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<Integer> getRandomNos(int carsNo) {
        List<Integer> randomNos = new ArrayList<>();
        for (int i = 0; i < carsNo; i++) {
            randomNos.add((int) (Math.random() * 10));
        }
        return randomNos;
    }
}
