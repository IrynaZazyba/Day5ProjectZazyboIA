package by.javatr.task1.service;

import by.javatr.task1.exception.DAOException;
import by.javatr.task1.exception.FileServiceReceiverException;
import by.javatr.task1.exception.NotPositiveNumber;
import by.javatr.task1.exception.NullDataException;
import by.javatr.task1.factory.DAOFactory;
import by.javatr.task1.scanner.DataScanner;
import by.javatr.task1.util.Array;


public class DataServiceReseiver {

    public static Array generateRandomArray() {

        Array arrayRandomNumber = new Array();

        for (int k = 0; k < 7; k++) {
            arrayRandomNumber.addElement((int) Math.round(Math.random() * 300) - 150);
        }
        return arrayRandomNumber;
    }

    public static Array getArrayFromConsole(int count) throws NullDataException {

        Array arrayFromConsole = new Array();
        int i = 0;
        while (i < count) {
            int a;
            a = DataScanner.enterIntFromConsole();
            arrayFromConsole.addElement(a);
            i++;
        }

        if (arrayFromConsole.getLength() == 0) {
            throw new NullDataException("Array is empty.");
        } else {
            return arrayFromConsole;
        }
    }

    public static int getPositiveIntFromConsole() throws NotPositiveNumber {

        int count = DataScanner.enterIntFromConsole();
        if (count <= 0) {
            throw new NotPositiveNumber("Number have to be positive.");
        }
        return count;
    }

    public static Array getArrayFromFile() throws FileServiceReceiverException,NullDataException{

        Array array;
        try {
            array= (Array)DAOFactory.getInstance().getFileArrayDao().read();
            if (array.getLength() ==0) {
                throw new NullDataException("No text from file to process.");
            }
        } catch (DAOException ex) {
            throw new FileServiceReceiverException();
        }

        return array;

    }

}
