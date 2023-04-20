package racingcar;

import racingcar.controller.CarController;
import racingcar.repository.CarRepository;
import racingcar.service.CarService;

public class AppConfig {
    private final CarController carController;
    private final CarService carService;
    private final CarRepository carRepository;

    public AppConfig() {
        this.carRepository = new CarRepository();
        this.carService = new CarService(carRepository);
        this.carController = new CarController(carService);
    }

    public CarController getCarController() {
        return carController;
    }

    public CarService getCarService() {
        return carService;
    }

    public CarRepository getCarRepository() {
        return carRepository;
    }
}
