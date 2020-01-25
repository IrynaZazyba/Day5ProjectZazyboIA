package by.javatr.task2.comparator.impl;

import by.javatr.task2.comparator.ComparatorArray;
import by.javatr.task2.service.ArrayService;

public class SortBySumElement  implements ComparatorArray {

    @Override
    public int compareTo(int[] arrFirst, int[] arrSecond) {

        int sumFirst=ArrayService.sumOfElement(arrFirst);
        int sumSecond=ArrayService.sumOfElement(arrSecond);

        return Integer.compare(sumFirst,sumSecond);
    }
}
