package by.javatr.task3.service;

public class ArrayConverterService {

    public static String[] makeArrayFromString(String array) {

        String[] str = array.trim().split("\\b");
        return str;

    }

    public static String[] makeArrayWithSymbols(String s) {

        String[] arr = s.trim().split("\\s");
        return arr;

    }

}



