package by.javatr.task2.comparator.impl;

import by.javatr.task2.comparator.ComparatorArray;
import by.javatr.task2.exception.EmptyArrayException;
import by.javatr.task2.service.ArrayService;

public class SortByMinElement implements ComparatorArray {

    @Override
    public int compareTo(int[] arrFirst, int[] arrSecond) throws EmptyArrayException {

        int minFirst=ArrayService.minValue(arrFirst);
        int minSecond=ArrayService.minValue(arrSecond);

        return Integer.compare(minFirst,minSecond);
    }
}
