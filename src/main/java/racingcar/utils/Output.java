package racingcar.utils;

import racingcar.domain.Car;

import java.util.List;

/**
 * 화면에 출력되는 메시지를 만드는 기능
 */
public class Output {

    public static void enterCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void enterCount() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void displayMatchingResult() {
        System.out.println();
        System.out.println("실행 결과");
    }

    public static void displayCars(List<Car> cars) {
        cars.forEach(car -> {
            displayCar(car);
        });
        System.out.println();
    }

    public static void displayWinners(List<Car> cars) {
        String output = "최종 우승자 : " + cars.get(0).getName();
        for (int i = 1; i < cars.size(); i++) {
            output += (", "  + cars.get(i).getName());
        }
        System.out.println(output);
    }

    public static void displayError(IllegalArgumentException e) {
        System.out.println("[ERROR] " + e.getMessage());
    }

    private static void displayCar(Car car) {
        String output = car.getName() + " : " + makePositionToString(car.getPosition());
        System.out.println(output);
    }

    private static String makePositionToString(int position) {
        String output = "";
        while (position-- > 0) {
            output += "-";
        }
        return output;
    }
}
