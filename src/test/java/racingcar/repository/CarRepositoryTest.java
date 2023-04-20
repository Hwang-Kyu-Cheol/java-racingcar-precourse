package racingcar.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarRepositoryTest {

    CarRepository repository = new CarRepository();

    @BeforeEach
    void beforeEach() {
        repository.clear();
    }

    @Test
    @DisplayName("저장소에 정상적으로 저장됩니다.")
    void save() {
        //given
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");

        //when
        repository.save(car1);
        repository.save(car2);

        //then
        List<Car> cars = repository.findAll();
        assertThat(cars.size()).isEqualTo(2);
        assertThat(cars).containsAll(Arrays.asList(car1, car2));
    }

    @Test
    @DisplayName("findAll은 저장소의 List를 변경할 수 없습니다.")
    void findAll() {
        //given
        Car car = new Car("car1");

        //when
        repository.save(car);
        List<Car> cars1 = repository.findAll();
        cars1.clear();

        //then
        List<Car> cars2 = repository.findAll();
        assertThat(cars2.size()).isEqualTo(1);
        assertThat(cars2).contains(car);
    }
}