package racingCar.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String getCarNames() throws IOException {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = br.readLine();
        return carNames;
    }

    public static int getRepeatNo() throws IOException {
        System.out.println("시도할 회수는 몇회인가요?");
        int repeatNo = Integer.parseInt(br.readLine());
        return repeatNo;
    }
}
