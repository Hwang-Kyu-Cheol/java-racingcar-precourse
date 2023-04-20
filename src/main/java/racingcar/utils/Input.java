package racingcar.utils;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Input {

    public static List<String> getCarNames() {
        while (true) {
            String input = Console.readLine();
            try {
                Validator.validateCarNames(input);
            } catch (IllegalArgumentException e) {
                Output.displayError(e);
                continue;
            }
            return Resolver.resolveCarNames(input);
        }
    }

    public static int getCount() {
        while (true) {
            String input = Console.readLine();
            try {
                Validator.validateCount(input);
            } catch (IllegalArgumentException e) {
                Output.displayError(e);
                continue;
            }
            return Resolver.resolveCount(input);
        }
    }
}
