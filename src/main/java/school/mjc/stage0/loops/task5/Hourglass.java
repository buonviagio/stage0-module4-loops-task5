package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int k = height;

        for (int i = 1; i <= height / 2; i++) {

            for (int o = 1; o < i; o++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= k; j++) {
                System.out.print(8);

            }
            k -= 2;
            System.out.println();

            if (k == 1) {
                for (int u = 1; u <= height / 2 + 1; u++) {
                    if (u == height / 2 + 1) {
                        System.out.print(8);
                        System.out.println();
                        break;
                    }
                    System.out.print(" ");
                }
            }
        }

        for (int i = 1; i <= height / 2; i++) {

            for (int o = i; o < height / 2; o++) {
                System.out.print(" ");
            }
            k += 2;
            for (int j = 1; j <= k; j++) {
                System.out.print(8);

            }
            System.out.println();

        }
    }

}
