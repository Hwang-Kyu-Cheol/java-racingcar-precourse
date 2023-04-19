package racingcar.utils;

public class Validator {

    /**
     * 부가 기능 : 자동차 이름 입력 유효성을 검증하는 기능
     * 조건 : 자동차 이름 길이 1이상 5이하
     * @param input
     * @throws IllegalArgumentException
     */
    public static void validateCarNames(String input) throws IllegalArgumentException {
        if (input.endsWith(",")) {
            throw new IllegalArgumentException("에러 메시지");
        }
        String[] carNames = input.split(",");
        for (String carName : carNames) {
            validateCarName(carName);
        }
    }

    /** 비즈니스 로직 **/
    private static void validateCarName(String name) {
        if (name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException("에러 메시지");
        }
    }
}
