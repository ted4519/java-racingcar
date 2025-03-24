package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String[] carNames = getCarNames();

        // 시도할 회수를 입력받음
        int attempts = getNumberOfAttempts();

    }

    // 경주할 자동차 이름을 입력받고, 쉼표로 구분된 이름들을 배열로 반환하는 메서드
    public static String[] getCarNames() {
        System.out.print("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분): ");
        String names = Console.readLine();

        // 쉼표로 나누어 이름을 배열로 반환
        return names.split(",");
    }

    // 시도할 회수를 입력받아 반환하는 메서드
    public static int getNumberOfAttempts() {
        System.out.print("시도할 회수는 몇 회인가요? ");
        String num = Console.readLine();

        // 입력받은 문자열을 정수로 변환하여 반환
        return Integer.parseInt(num);
    }
}
