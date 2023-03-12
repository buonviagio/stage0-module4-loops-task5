package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        if (sideLength < 0){
            sideLength *= -1;
        }
        for (int i = 1; i <= sideLength; i++){
            for (int j = 1; j <= sideLength; j++){
                if (i == 1){
                    System.out.print(8);
                }else if(i == sideLength){
                    System.out.print(8);
                } else if(j == 1 || j == sideLength){
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
