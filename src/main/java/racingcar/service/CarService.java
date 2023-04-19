package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.repository.CarRepository;

import java.util.List;

public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    /**
     * 핵심 기능 : 자동차 정보를 저장하는 기능
     * @param names
     */
    public void saveCars(List<String> names) {
        names.forEach(name -> {
            Car car = new Car(name);
            carRepository.save(car);
        });
    }

    /**
     * 핵심 기능 : 조건에 맞게 자동차가 이동하는 기능
     */
    public void play() {
        List<Car> cars = carRepository.findAll();
        cars.forEach(car -> {
            int randomNumber = Randoms.pickNumberInRange(0, 9);
            if (canGo(randomNumber)) {
                car.go();
            }
        });
    }

    /** 비즈니스 로직 **/
    private boolean canGo(int number) {
        return number >= 4;
    }
}
