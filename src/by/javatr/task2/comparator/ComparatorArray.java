package by.javatr.task2.comparator;

import by.javatr.task2.exception.EmptyArrayException;

public interface ComparatorArray {

    int compareTo(int [] arrFirst, int [] arrSecond) throws EmptyArrayException;

}
