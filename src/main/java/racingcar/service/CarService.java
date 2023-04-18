package racingcar.service;

import racingcar.domain.Car;
import racingcar.repository.CarRepository;

import java.util.List;

public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void saveCars(List<String> names) {
        names.stream()
                .forEach(name -> {
                    Car car = new Car(name);
                    carRepository.save(car);
                });
    }
}
