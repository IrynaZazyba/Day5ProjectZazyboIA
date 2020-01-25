package by.javatr.task2.comparator.impl;

import by.javatr.task2.comparator.ComparatorArray;
import by.javatr.task2.exception.EmptyArrayException;
import by.javatr.task2.service.ArrayService;

public class SortByMaxElement implements ComparatorArray {

    @Override
    public int compareTo(int[] arrFirst, int[] arrSecond) throws EmptyArrayException {

        int maxFirst=ArrayService.maxValue(arrFirst);
        int maxSecond=ArrayService.maxValue(arrSecond);

        return Integer.compare(maxFirst,maxSecond);
    }
}
