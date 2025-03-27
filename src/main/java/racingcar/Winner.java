package racingcar;

public class Winner {
    public Winner() {
    }

    public void printWinner(String[] carNames, int[] distance) {
        boolean result = false;
        int max = this.maxdis(distance);
        System.out.print("최종 우승자 : ");

        for(int i = 0; i < distance.length; ++i) {
            if (result && distance[i] == max) {
                System.out.print(", ");
            }

            if (distance[i] == max) {
                System.out.print(carNames[i]);
                result = true;
            }
        }

    }

    private int maxdis(int[] distance) {
        int max = 0;

        for(int i = 0; i < distance.length; ++i) {
            if (distance[i] > max) {
                max = distance[i];
            }
        }

        return max;
    }
}