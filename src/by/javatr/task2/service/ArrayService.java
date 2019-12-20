package by.javatr.task2.service;

import by.javatr.task2.exception.EmptyArrayException;
import by.javatr.task2.exception.EmptyMatrixException;
import by.javatr.task2.validator.Validator;

public class ArrayService {


    public static void bubbleSortInOrderOfDecreasingSumOfRowsElement(int[][] array) throws EmptyMatrixException {

        if (Validator.isMatrixEmpty(array)) {
            throw new EmptyMatrixException("Empty matrix");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (sumOfElement(array[j]) > sumOfElement(array[j + 1])) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void bubbleSortInOrderOfIncreasingSumOfRowsElement(int[][] array) throws EmptyMatrixException{
        if (Validator.isMatrixEmpty(array)) {
            throw new EmptyMatrixException("Empty matrix");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (sumOfElement(array[j]) < sumOfElement(array[j + 1])) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void bubbleSortInOrderOfDecreasingMaxRowsElement(int[][] array) throws EmptyMatrixException, EmptyArrayException {
        if (Validator.isMatrixEmpty(array)) {
            throw new EmptyMatrixException("Empty matrix");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (maxValue(array[j]) > maxValue(array[j + 1])) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void bubbleSortInOrderOfIncreasingMaxRowsElement(int[][] array) throws EmptyMatrixException, EmptyArrayException {
        if (Validator.isMatrixEmpty(array)) {
            throw new EmptyMatrixException("Empty matrix");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (maxValue(array[j]) < maxValue(array[j + 1])) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void bubbleSortInOrderOfDecreasingMinRowsElement(int[][] array) throws EmptyMatrixException, EmptyArrayException {
        if (Validator.isMatrixEmpty(array)) {
            throw new EmptyMatrixException("Empty matrix");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (minValue(array[j]) > minValue(array[j + 1])) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void bubbleSortInOrderOfIncreasingMinRowsElement(int[][] array) throws EmptyMatrixException, EmptyArrayException {
        if (Validator.isMatrixEmpty(array)) {
            throw new EmptyMatrixException("Empty matrix");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (minValue(array[j]) < minValue(array[j + 1])) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static int sumOfElement(int[] array) {
        int sumOfElement = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfElement += array[i];
        }
        return sumOfElement;
    }

    private static void swap(int[][] array, int firstElem, int secondElem) throws EmptyMatrixException{
        if (Validator.isMatrixEmpty(array)) {
            throw new EmptyMatrixException("Empty matrix");
        }
        int[] temp = array[firstElem];
        array[firstElem] = array[secondElem];
        array[secondElem] = temp;
    }

    private static int maxValue(int[] array) throws EmptyArrayException {
        if(Validator.isArrayEmpty(array)){
            throw  new EmptyArrayException("Array is empty");
        }
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            }
        }
        return array[indexMax];
    }

    private static int minValue(int[] array) throws EmptyArrayException{
        if(Validator.isArrayEmpty(array)){
            throw  new EmptyArrayException("Array have to be not empty");
        }
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }
        return array[indexMin];
    }

}

