package by.javatr.task1.runner;

import by.javatr.task1.exception.*;
import by.javatr.task1.service.DataServiceReseiver;
import by.javatr.task1.util.Array;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Сколько чисел вы хотите ввести?");
        try {
            int count = DataServiceReseiver.getPositiveIntFromConsole();

            System.out.println("Вводите числа нажимая enter: ");
            Array arrayFromConsole = DataServiceReseiver.getArrayFromConsole(count);

            Array arrayRandomNumber = DataServiceReseiver.generateRandomArray();

            Array arrayFromFile = (Array) DataServiceReseiver.getArrayFromFile();

            System.out.println("Данные из консоли: ");
            PrintArray.printArray(arrayFromConsole);

            System.out.println("Сгенерированные данные: ");
            PrintArray.printArray(arrayRandomNumber);

            System.out.println("Данные из файла: ");
            PrintArray.printArray(arrayFromFile);



        } catch ( NotPositiveNumber|NullDataException | FileServiceReceiverException e) {
            System.out.println(e.getMessage());
        }

    }
}
