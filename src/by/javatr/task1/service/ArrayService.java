package by.javatr.task1.service;

import by.javatr.task1.exception.EmptyArrayException;
import by.javatr.task1.util.Array;
import by.javatr.task1.exception.NoSuchIndexException;
import by.javatr.task1.validator.Validator;

public class ArrayService {


    public static Array bubbleSort(Array arr) throws NoSuchIndexException,EmptyArrayException {

        if(Validator.isArrayNull(arr)){
            throw new EmptyArrayException("Array is empty.");
        }
        for (int i = 0; i < arr.getLength(); i++) {
            for (int j = 0; j < arr.getLength() - i - 1; j++) {
                if (arr.getElement(j) > arr.getElement(j + 1)) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }


    public static Array insertSort(Array array) throws NoSuchIndexException,EmptyArrayException {

        if(Validator.isArrayNull(array)){
            throw new EmptyArrayException("Array is empty.");
        }
        for (int i = 1; i < array.getLength(); i++) {
            int current = array.getElement(i);
            int j = i - 1;
            while (j >= 0 && current < array.getElement(j)) {
                array.replaceElement(j + 1, array.getElement(j));
                j--;
            }
            array.replaceElement(j + 1, current);
        }
        return array;
    }


    private static int partition(Array arr, int start, int end) throws NoSuchIndexException,EmptyArrayException {

        int marker = start;
        for (int i = start; i <= end; i++) {
            if (arr.getElement(i) <= arr.getElement(end)) {
              swap(arr,marker,i);
                marker += 1;
            }
        }
        return marker - 1;
    }

    public static void quickSort(Array arr, int start, int end) throws NoSuchIndexException, EmptyArrayException {
        if(Validator.isArrayNull(arr)){
            throw new EmptyArrayException("Array is empty.");
        }
        if (start >= end) {
            return;
        }
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);


    }

    public static int binarySearch(Array array, int elementSearch)throws NoSuchIndexException {

        int firstIndex = 0;
        int lastIndex = array.getLength() - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array.getElement(middleIndex) == elementSearch) {
                return middleIndex;
            } else if (array.getElement(middleIndex) > elementSearch) {
                lastIndex = middleIndex - 1;
            } else if (array.getElement(middleIndex) < elementSearch) {
                firstIndex = middleIndex + 1;
            }
        }
        return -1;
    }


    public static void swap(Array array, int firstElem, int secondElem) throws NoSuchIndexException,EmptyArrayException {
        if(Validator.isArrayNull(array)){
            throw new EmptyArrayException("Array is empty.");
        }
        int temp = array.getElement(firstElem);
        array.replaceElement(firstElem, array.getElement(secondElem));
        array.replaceElement(secondElem, temp);
    }

    public static int maxValue(Array array) throws NoSuchIndexException,EmptyArrayException {
        if(Validator.isArrayNull(array)){
            throw new EmptyArrayException("Array is empty.");
        }
        int indexMax = 0;
        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElement(i) > array.getElement(indexMax)) {
                indexMax = i;
            }
        }
        return array.getElement(indexMax);
    }

    public static int minValue(Array array) throws NoSuchIndexException,EmptyArrayException {

        if(Validator.isArrayNull(array)){
            throw new EmptyArrayException("Array don't have to be empty.");
        }

        int indexMin = 0;
        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElement(i) < array.getElement(indexMin)) {
                indexMin = i;
            }
        }
        return array.getElement(indexMin);
    }

    public static Array getAllPrimeNumber(Array array) throws NoSuchIndexException, EmptyArrayException{
        if(Validator.isArrayNull(array)){
            throw new EmptyArrayException("Array is empty.");
        }

        Array primeNumbers = new Array();
        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElement(i) <= 1) {
                continue;
            }

            boolean isPrime = true;
            for (int j = 2; j < array.getElement(i); j++) {
                if (array.getElement(i) % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (!primeNumbers.isContains(array.getElement(i))) {
                    primeNumbers.addElement(array.getElement(i));
                }
            }

        }
        return primeNumbers;
    }


    public static Array getFibbonacciNumbersFromArray(Array array) throws NoSuchIndexException,EmptyArrayException {
        if(Validator.isArrayNull(array)){
            throw new EmptyArrayException("Array is empty.");
        }

        Array fibbonacciNumber = new Array();

        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElement(i) == 1) {
                if (!fibbonacciNumber.isContains(array.getElement(i))) {
                    fibbonacciNumber.addElement(array.getElement(i));
                }
            } else {
                int num1 = 1;
                int num2 = 1;
                int sum = 0;
                int maxValue = maxValue(array);
                for (int j = 0; j < maxValue; j++) {
                    sum = num1 + num2;
                    num1 = num2;
                    num2 = sum;
                    if (array.getElement(i) == sum) {
                        if (!fibbonacciNumber.isContains((array.getElement(i)))) {
                            fibbonacciNumber.addElement(array.getElement(i));
                            break;
                        }
                    }
                }
            }
        }
        return fibbonacciNumber;
    }


    public static Array getThreeDigitNumberWithUniqueDigit(Array array) throws NoSuchIndexException,EmptyArrayException {
        if(Validator.isArrayNull(array)){
            throw new EmptyArrayException("Array is empty.");
        }
        Array a = new Array();
        for (int i = 0; i < array.getLength(); i++) {
            Array arrayFromNumber = getArrayFromNumber(array.getElement(i));
            if (arrayFromNumber.getLength() == 3) {

                int count = 0;
                for (int j = 0; j < arrayFromNumber.getLength(); j++) {
                    for (int k = j + 1; k < arrayFromNumber.getLength(); k++) {
                        if (arrayFromNumber.getElement(j) == arrayFromNumber.getElement(k)) {
                            count++;
                        }
                    }
                }
                if (count == 0) {
                    if (!a.isContains(array.getElement(i))) {
                        a.addElement(array.getElement(i));
                    }
                }

            }
        }

        return a;
    }


    private static int getCountsOfDigits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    private static Array getArrayFromNumber(int num) {

        Array a = new Array();

        while (num != 0) {
            a.addElement(num % 10);
            num /= 10;
        }
        return a;
    }


}

