package by.javatr.task1.runner;

import by.javatr.task1.util.Array;

import java.util.Iterator;

public class PrintArray {

    public static void printArray(Array arr) {
        Iterator it = arr.iterator();

        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
}
