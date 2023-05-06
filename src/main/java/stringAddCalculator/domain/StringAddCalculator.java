package stringAddCalculator.domain;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringAddCalculator {
    public static int splitAndSum(String text) throws RuntimeException {
        inputValidator(text);
        if (isNullOrEmpty(text))
            return 0;
        if (text.length() == 1)
            return Integer.parseInt(text);
        String[] tokens = mapStringToTokens(text);
        return sum(tokens);
    }

    private static boolean isNullOrEmpty(String text) {
        return text == null || text.isEmpty();
    }

    private static void inputValidator(String text) {
        if (text.length() == 1 && Integer.parseInt(text) < 0)
            throw new RuntimeException();

        String[] tokens = mapStringToTokens(text);
        
        mapTokensToIntegerStream(tokens).forEach(number -> {
            if (number < 0)
                throw new RuntimeException();
        });
    }

    private static int sum(String[] tokens) {
        return mapTokensToIntegerStream(tokens)
                .reduce(0, Integer::sum);
    }

    private static Stream<Integer> mapTokensToIntegerStream(String[] tokens) {
        return Arrays.asList(tokens)
                .stream()
                .map((token) -> Integer.parseInt(token));
    }

    private static String[] mapStringToTokens(String text) {
        String[] tokens = text.split(",|:");

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            tokens = m.group(2).split(customDelimiter);
        }

        return tokens;
    }
}