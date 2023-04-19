package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("go함수는 포지션을 1 증가시킵니다.")
    void go() {
        //given
        Car car = new Car("a");

        //when
        car.go();

        //then
        assertThat(car.getPosition()).isEqualTo(1);
    }
}