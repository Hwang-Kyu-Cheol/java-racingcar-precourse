package racingcar.repository;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    private static final List<Car> cars = new ArrayList<>();

    public Car save(Car car) {
        cars.add(car);
        return car;
    }

    public List<Car> findAll() {
        return new ArrayList<>(cars);
    }

    public void clear() {
        cars.clear();
    }
}
