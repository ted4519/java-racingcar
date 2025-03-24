package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String[] carNames = getCarNames();
        int[] distance = new int [carNames.length];
        // 시도할 회수를 입력받음
        int attempts = getNumberOfAttempts();

        racing(distance,attempts,carNames);

    }

    // 경주할 자동차 이름을 입력받고, 쉼표로 구분된 이름들을 배열로 반환하는 메서드
    public static String[] getCarNames() {
        System.out.print("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분): ");
        String names = Console.readLine();

        // 쉼표로 나누어 이름을 배열로 반환
        return names.split(",");
    }

    // 시도할 횟수를 입력받아 반환하는 메서드
    public static int getNumberOfAttempts() {
        System.out.print("시도할 회수는 몇 회인가요? ");
        String num = Console.readLine();

        // 입력받은 문자열을 정수로 변환하여 반환
        return Integer.parseInt(num);
    }

    public static void racing(int[] distance,int num, String[] carNames) {
        for (int i = 0; i < carNames.length; i++) {
            distance[i] = 0;
        }

        System.out.println("\n실행 결과\n");

        for (int i = 0; i < num; i++) {
            gogo(distance);
            printDist(carNames, distance);
            System.out.println();
        }
    }

    public static void gogo(int[] distance) {
        for (int i = 0; i < distance.length; i++) {
            distance[i] = distance[i] + move();
        }
    }

    public static int move() {
        int m=0;
        if(Randoms.pickNumberInRange(0,9) >= 4) m=1;
        return m;
    }

    public static void printDist(String[] carNames, int[] distance) {
        for (int i = 0; i < carNames.length; i++) {
            System.out.print(carNames[i] + ":");
            for (int j = 0; j < distance[i]; j++) {
                System.out.print("-");
            }
            System.out.print("\n");
        }
    }



}
