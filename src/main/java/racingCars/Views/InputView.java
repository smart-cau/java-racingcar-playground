package racingCars.Views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String printAndGetStringValue(String message) throws IOException {
        System.out.println(message);
        return br.readLine();
    }
}
