package by.javatr.task2.runner;

import by.javatr.task2.exception.EmptyArrayException;
import by.javatr.task2.exception.EmptyMatrixException;
import by.javatr.task2.service.ArrayService;
import by.javatr.task2.printer.PrintArray;

public class Runner {
    public static void main(String[] args) {

        int[][] juggedArray = new int[][]{{17, 57, 9, 78, 6},
                {7, 75, 11, 84, 96, 73, 57},
                {19, 56, 84, 37, 64, 85, 97, 24, 17},
                {1, 7, 9, 12, 19},
                {3, 7, 91},
                {97, 17, 63, 57, 98}};


        try {
            System.out.println("\nВозрастание сумм элементов:");
            ArrayService.bubbleSortInOrderOfDecreasingSumOfRowsElement(juggedArray);
            PrintArray.printMatrix(juggedArray);

            System.out.println("\nУбывание сумм элементов:");
            ArrayService.bubbleSortInOrderOfIncreasingSumOfRowsElement(juggedArray);
            PrintArray.printMatrix(juggedArray);

            System.out.println("\nВозрастание максимальных элементов:");
            ArrayService.bubbleSortInOrderOfDecreasingMaxRowsElement(juggedArray);
            PrintArray.printMatrix(juggedArray);

            System.out.println("\nУбывание максимальных элементов:");
            ArrayService.bubbleSortInOrderOfIncreasingMaxRowsElement(juggedArray);
            PrintArray.printMatrix(juggedArray);

            System.out.println("\nВозрастание минимальных элементов:");
            ArrayService.bubbleSortInOrderOfDecreasingMinRowsElement(juggedArray);
            PrintArray.printMatrix(juggedArray);

            System.out.println("\nУбывание минимальных элементов:");
            ArrayService.bubbleSortInOrderOfIncreasingMinRowsElement(juggedArray);
            PrintArray.printMatrix(juggedArray);

        } catch (EmptyArrayException | EmptyMatrixException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
