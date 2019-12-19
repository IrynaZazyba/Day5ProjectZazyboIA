package by.javatr.task2.printer;

public class PrintArray {

    public static void printMatrix(int[][] juggedArray) {

        for (int i = 0; i < juggedArray.length; i++) {
            for (int j = 0; j < juggedArray[i].length; j++) {
                System.out.print(juggedArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
