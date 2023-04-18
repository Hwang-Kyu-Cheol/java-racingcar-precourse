package racingcar.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.repository.CarRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    CarRepository carRepository = new CarRepository();
    CarService carService = new CarService(carRepository);

    @Test
    @DisplayName("문자열 리스트로 전달된 차 이름은 차가 생성되어 저장소에 저장됩니다.")
    void saveCars() {
        //given
        List<String> names = new ArrayList<>(Arrays.asList("car1", "car2"));

        //when
        carService.saveCars(names);

        //then
        List<Car> cars = carRepository.findAll();
        cars.sort((car1, car2) -> car1.getName().compareTo(car2.getName()));
        assertThat(cars.size()).isEqualTo(2);
        assertThat(cars.get(0).getName()).isEqualTo("car1");
        assertThat(cars.get(1).getName()).isEqualTo("car2");
    }
}