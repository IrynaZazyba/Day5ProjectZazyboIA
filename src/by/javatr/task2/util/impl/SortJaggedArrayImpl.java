package by.javatr.task2.util.impl;

import by.javatr.task2.comparator.ComparatorArray;
import by.javatr.task2.comparator.impl.SortByMaxElement;
import by.javatr.task2.comparator.impl.SortByMinElement;
import by.javatr.task2.comparator.impl.SortBySumElement;
import by.javatr.task2.exception.EmptyArrayException;
import by.javatr.task2.util.SortJaggedArray;

public class SortJaggedArrayImpl implements SortJaggedArray {


    private void bubbleSortAscending(int[][] array, ComparatorArray comparatorArray) throws EmptyArrayException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (comparatorArray.compareTo(array[j], array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private void bubbleSortDescending(int[][] array, ComparatorArray comparatorArray) throws EmptyArrayException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (comparatorArray.compareTo(array[j], array[j + 1]) < 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }


    @Override
    public void bubbleSortAscendingSum(int[][] arr) throws EmptyArrayException {
        ComparatorArray comp=new SortBySumElement();
        bubbleSortAscending(arr, comp);

    }

    @Override
    public void bubbleSortDescendingSum(int[][] arr) throws EmptyArrayException {
        ComparatorArray comp=new SortBySumElement();
        bubbleSortDescending(arr, comp);

    }

    @Override
    public void bubbleSortAscendingMaxElement(int[][] arr) throws EmptyArrayException {
        ComparatorArray comp=new SortByMaxElement();
        bubbleSortAscending(arr, comp);

    }

    @Override
    public void bubbleSortDescendingMaxElement(int[][] arr) throws EmptyArrayException {
        ComparatorArray comp=new SortByMaxElement();
        bubbleSortDescending(arr, comp);

    }

    @Override
    public void bubbleSortAscendingMinElement(int[][] arr) throws EmptyArrayException {
        ComparatorArray comp=new SortByMinElement();
        bubbleSortAscending(arr, comp);
    }

    @Override
    public void bubbleSortDescendingMinElement(int[][] arr) throws EmptyArrayException {
        ComparatorArray comp=new SortByMinElement();
        bubbleSortDescending(arr, comp);

    }

    private void swap(int[][] array, int firstElem, int secondElem) {

        int[] temp = array[firstElem];
        array[firstElem] = array[secondElem];
        array[secondElem] = temp;
    }

    private int[][] reverseMatrix(int [][] arr){
        int [][] sortArr=new int[arr.length][];
        for(int i=0;i<arr.length;i++){
            sortArr[arr.length-i-1]=arr[i];
        }
        return sortArr;
    }

}
