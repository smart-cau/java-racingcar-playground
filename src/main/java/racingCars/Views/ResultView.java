package racingCars.Views;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import racingCars.domain.Car;

public class ResultView {
    public static void racingProcess(List<Car> movedCars) {
        for (int i = 0; i < movedCars.size(); i++) {
            Car car = movedCars.get(i);
            System.out.println(car.getCarName() + " : " + car.getDistance());
        }
        System.out.println("");
    }

    public static void printWinners(List<Car> winners) {
        String[] winnerNames = winners.stream()
                .map((car) -> car.getCarName()).toArray(String[]::new);
        String winnerNamesString = Stream.of(winnerNames)
                .collect(Collectors.joining(","));

        System.out.println(winnerNamesString + "가 최종 우승하였습니다.");
    }
}
