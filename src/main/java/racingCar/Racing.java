package racingCar;

import java.io.IOException;
import java.util.List;

import racingCar.domain.Cars;
import racingCar.domain.car.Car;
import racingCar.domain.car.MoveStrategy;
import racingCar.domain.car.RandomMoveStrategy;
import racingCar.view.InputView;
import racingCar.view.ResultView;

public class Racing {
    public static void main(String[] args) throws IOException {
        String carNames = InputView.getCarNames();
        int repeatNo = InputView.getRepeatNo();

        Cars cars = new Cars(carNames);
        MoveStrategy randomStrategy = new RandomMoveStrategy();

        ResultView.printResult();
        
        for (int repeat = 0; repeat < repeatNo; repeat++) {
            List<Car> movingCars = cars.moveAll(randomStrategy);
            ResultView.printRacing(movingCars);
        }

        String winners = cars.getWinners();
        ResultView.printWinners(winners);
    }
}
