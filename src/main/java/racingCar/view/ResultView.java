package racingCar.view;

import java.util.List;

import racingCar.domain.car.Car;

public class ResultView {
    public static void printResult() {
        System.out.println();
        System.out.println("실행결과");
        
    }
    public static void printRacing(List<Car> movingCars) {
        movingCars.forEach((movingCar) -> {
            String carName = movingCar.getCarName().getValue();
            int position = movingCar.getPosition().getValue();

            System.out.println(carName + " : " + getPositionInString(position));
        });
        System.out.println();
    }

    public static void printWinners(String winners) {
        System.out.println(winners + "가 최종 우승했습니다.");
    }

    private static String getPositionInString(int position) {
        StringBuilder sb = new StringBuilder();
        for (int count = 0; count < position; count++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
