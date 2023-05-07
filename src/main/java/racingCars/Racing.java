package racingCars;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import racingCars.Views.InputView;
import racingCars.Views.ResultView;
import racingCars.domain.Car;
import racingCars.domain.Cars;
import racingCars.utils.Utils;

public class Racing {
    public static void main(String[] args) throws IOException {
        String carNames = InputView
                .printAndGetStringValue("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String repeatNoString = InputView
                .printAndGetStringValue("시도할 회수는 몇회인가요?");

        System.out.println("\n실행결과");

        int repeatNo = Integer.parseInt(repeatNoString);
        int carsNo = carNames.split(",").length;

        Cars cars = new Cars(carNames);
        List<Car> movedCars = new ArrayList<>();

        for (int repeat = 0; repeat < repeatNo; repeat++) {
            List<Integer> randomNos = Utils.getRandomNos(carsNo);
            movedCars = cars.moveAll(randomNos);

            ResultView.racingProcess(movedCars);
        }

        List<Car> winners = cars.getWinners(movedCars);

        ResultView.printWinners(winners);
    }
}
