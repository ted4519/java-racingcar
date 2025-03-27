package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Carinformation {
    public Carinformation() {
    }

    public String[] getCarNames() {
        System.out.print("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분): ");
        String carnames = Console.readLine();
        String[] eachcarnames = carnames.split(",");
        this.exceptname(eachcarnames);
        return eachcarnames;
    }

    private void exceptname(String[] carNames) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < carNames.length; ++i) {
            if (carNames[i].length() > max) {
                max = carNames[i].length();
            }

            if (carNames[i].length() < min) {
                min = carNames[i].length();
            }
        }

        if (max > 5 || min < 1 || min > max) {
            throw new IllegalArgumentException("각 자동차 이름의 길이는 1~5 범위 내로 입력하세요.");
        }
    }
}