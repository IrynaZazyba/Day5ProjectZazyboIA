package by.javatr.task2.service;

import by.javatr.task2.exception.EmptyArrayException;
import by.javatr.task2.validator.Validator;

public class ArrayService {


    public static int sumOfElement(int[] array) {
        int sumOfElement = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfElement += array[i];
        }
        return sumOfElement;
    }


    public static int maxValue(int[] array) throws EmptyArrayException {
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

    public static int minValue(int[] array) throws EmptyArrayException{
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

