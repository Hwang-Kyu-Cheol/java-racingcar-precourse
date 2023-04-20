package racingcar.utils;

import racingcar.constant.ErrorMessage;

public class Validator {

    /**
     * 부가 기능 : 자동차 이름 입력 유효성을 검증하는 기능
     * 조건 : 자동차 이름 길이 1이상 5이하
     * @param input
     * @throws IllegalArgumentException
     */
    public static void validateCarNames(String input) throws IllegalArgumentException {
        if (input.endsWith(",")) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_CAR_NAMES);
        }
        String[] carNames = input.split(",");
        for (String carName : carNames) {
            validateCarName(carName);
        }
    }

    /**
     * 부가 기능 : 이동하는 횟수 입력 유효성을 검증하는 기능
     * 조건 : 정수로 번경 가능한 문자열
     * @param input
     * @throws IllegalArgumentException
     */
    public static void validateCount(String input) throws IllegalArgumentException {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_COUNT);
        }
    }

    /** 비즈니스 로직 **/
    private static void validateCarName(String name) {
        if (name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_CAR_NAMES);
        }
    }
}
