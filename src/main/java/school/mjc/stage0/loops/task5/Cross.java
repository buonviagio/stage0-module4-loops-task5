package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength % 2 == 0) {
            sideLength++;
        }
        if (sideLength < 0) {
            sideLength *= -1;
        }
        int middle = (sideLength - (sideLength / 2));
        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {
                if (middle == i) {
                    System.out.print(8);
                } else if (middle != j) {
                    System.out.print(" ");
                } else if (middle == j) {
                    System.out.print(8);
                }
            }
            System.out.println();
        }
    }
}
