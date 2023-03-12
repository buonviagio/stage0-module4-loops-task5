package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            System.out.print(8);
            for (int j = 1; j <= i; j++) {
                if (i == cathetusLength){
                    System.out.print(8);
                    continue;
                }
                if(j != i) {
                    System.out.print(" ");
                } else if(i == j){
                    System.out.print(8);
                }
            }
            System.out.println();
        }
    }
}
