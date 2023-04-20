package racingcar.controller;

import racingcar.domain.Car;
import racingcar.service.CarService;
import racingcar.utils.Input;
import racingcar.utils.Output;

import java.util.List;

public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    public void run() {
        Output.enterCarNames();
        List<String> carNames = Input.getCarNames();
        carService.saveCars(carNames);
        Output.enterCount();
        int count = Input.getCount();
        Output.displayMatchingResult();
        while (count-- > 0) {
            List<Car> cars = carService.play();
            Output.displayCars(cars);
        }
        List<Car> winners = carService.findWinner();
        Output.displayWinners(winners);
    }
}
