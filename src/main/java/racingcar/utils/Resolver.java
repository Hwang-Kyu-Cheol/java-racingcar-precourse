package racingcar.utils;

import java.util.Arrays;
import java.util.List;

public class Resolver {

    public static List<String> resolveCarNames(String input) {
        return Arrays.asList(input.split(","));
    }

    public static int resolveCount(String input) {
        return Integer.parseInt(input);
    }
}
