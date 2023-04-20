package racingcar.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ResolverTest {

    @Test
    @DisplayName("자동차 이름을 ',' 단위로 나누어서 리스트로 반환합니다.")
    void resolveCarNames() {
        //given
        String input = "pobi,woni,jun,  ";

        //when
        List<String> carNames = Resolver.resolveCarNames(input);

        //then
        List<String> answer = Arrays.asList("pobi", "woni", "jun", "  ");
        assertThat(carNames.size()).isEqualTo(4);
        assertThat(carNames).containsAll(answer);
    }

    @Test
    @DisplayName("시도 횟수를 정수로 변환하여 반환합니다.")
    void resolveCount() {
        //given
        String input = "5";

        //when
        int count = Resolver.resolveCount(input);

        //then
        assertThat(count).isEqualTo(5);
    }
}