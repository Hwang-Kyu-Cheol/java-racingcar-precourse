package racingcar.utils;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

/**
 * 사용자에게 입력을 받고 입력을 처리하는 Class
 */
public class Input {

    /**
     * 사용자에게 자동차 이름들을 입력받고, 이 입력을 처리하는 기능
     * @return List<String>
     */
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

    /**
     * 사용자에게 이동하는 횟수를 입력받고, 이 입력을 처리하는 기능
     * @return int
     */
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
