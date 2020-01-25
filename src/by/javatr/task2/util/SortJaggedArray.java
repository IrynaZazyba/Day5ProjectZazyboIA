package by.javatr.task2.util;


import by.javatr.task2.exception.EmptyArrayException;

public interface SortJaggedArray {

    void bubbleSortAscendingSum(int[][] arr) throws EmptyArrayException;

    void bubbleSortDescendingSum(int[][] arr) throws EmptyArrayException;

    void bubbleSortAscendingMaxElement(int[][] arr) throws EmptyArrayException;

    void bubbleSortDescendingMaxElement(int[][] arr) throws EmptyArrayException;

    void bubbleSortAscendingMinElement(int[][] arr) throws EmptyArrayException;

    void bubbleSortDescendingMinElement(int[][] arr) throws EmptyArrayException;


}
