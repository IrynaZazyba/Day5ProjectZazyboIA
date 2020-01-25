package by.javatr.task2.runner;

import by.javatr.task2.exception.EmptyArrayException;
import by.javatr.task2.exception.EmptyMatrixException;
import by.javatr.task2.service.ArrayService;
import by.javatr.task2.printer.PrintArray;
import by.javatr.task2.util.SortJaggedArray;
import by.javatr.task2.util.impl.SortJaggedArrayImpl;

public class Runner {
    public static void main(String[] args) {

        int[][] juggedArray = new int[][]{{18, 57, 9, 78, 6},
                {7, 75, 11, 84, 96, 73, 57},
                {19, 56, 84, 37, 64, 85, 97, 24, 21},
                {1, 7, 9, 12, 19},
                {3, 7, 91},
                {97, 17, 63, 57, 98}};

        SortJaggedArray sortJaggedArray = new SortJaggedArrayImpl();


        System.out.println("\nВозрастание сумм элементов:");
        try {
            sortJaggedArray.bubbleSortAscendingSum(juggedArray);

            PrintArray.printMatrix(juggedArray);

            System.out.println("\nУбывание сумм элементов:");
            sortJaggedArray.bubbleSortDescendingSum(juggedArray);
            PrintArray.printMatrix(juggedArray);

            System.out.println("\nВозрастание максимальных элементов:");
            sortJaggedArray.bubbleSortAscendingMaxElement(juggedArray);
            PrintArray.printMatrix(juggedArray);

            System.out.println("\nУбывание максимальных элементов:");
            sortJaggedArray.bubbleSortDescendingMaxElement(juggedArray);
            PrintArray.printMatrix(juggedArray);

            System.out.println("\nВозрастание минимальных элементов:");
            sortJaggedArray.bubbleSortAscendingMinElement(juggedArray);
            PrintArray.printMatrix(juggedArray);

            System.out.println("\nУбывание минимальных элементов:");
            sortJaggedArray.bubbleSortDescendingMinElement(juggedArray);
            PrintArray.printMatrix(juggedArray);

        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
    }
}
