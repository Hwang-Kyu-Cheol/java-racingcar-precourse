package racingcar.utils;

import java.util.Arrays;
import java.util.List;

/**
 * 문자열을 필요한 타입에 맞게 변환하는 Class
 */
public class Resolver {

    /**
     * 자동차 이름들을 자동차 이름이 분리되서 담긴 리스트로 변환하는 기능
     * @param input
     * @return List<String>
     */
    public static List<String> resolveCarNames(String input) {
        return Arrays.asList(input.split(","));
    }

    /**
     * 이동하는 횟수를 int로 변환하는 기능
     * @param input
     * @return int
     */
    public static int resolveCount(String input) {
        return Integer.parseInt(input);
    }
}
