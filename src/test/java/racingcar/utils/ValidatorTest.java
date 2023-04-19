package racingcar.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    /**
     * 차 이름 조건 : 길이 1이상 5이하
     */
    @Test
    @DisplayName("차 이름의 길이가 1 미만일 경우, IllegalArgumentException이 발생합니다.")
    void validateCarNames_lessThan1() {
        //given
        String input = "car,,car1";

        //then
        assertThatThrownBy(() -> Validator.validateCarNames(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("차 이름의 길이가 5 초과일 경우, IllegalArgumentException이 발생합니다.")
    void validateCarNames_greaterThan5() {
        //given
        String input = "car1,123,car123";

        //then
        assertThatThrownBy(() -> Validator.validateCarNames(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("문자열 끝에 ,가 있는 경우, IllegalArgumentException이 발생합니다.")
    void validateCarNames_endsWithComma() {
        //given
        String input = "car1,123,car12,";

        //then
        assertThatThrownBy(() -> Validator.validateCarNames(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("차 이름은 공백일 수 있습니다.")
    void validateCarNames_containsBlank() {
        //given
        String input = "  ,car1 ,123,car12";

        //then
        assertDoesNotThrow(() -> Validator.validateCarNames(input));
    }
}