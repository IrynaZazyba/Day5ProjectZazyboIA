package by.javatr.task3.service;

import by.javatr.task1.scanner.DataScanner;
import by.javatr.task3.dao.factory.DAOFactory;
import by.javatr.task3.exception.DAOException;
import by.javatr.task3.exception.FileServiceReciverException;
import by.javatr.task3.exception.NullTextException;
import by.javatr.task3.validator.Validator;

public class DataFileServiceReceiver {

    public static String getDataFromFile() throws FileServiceReciverException, NullTextException {

        String str;
        try {
            str = (String) DAOFactory.getInstance().getFileDAO().read();
            if (Validator.isStringEmpty(str)) {
                throw new NullTextException("No text from file to process.");
            }
        } catch (DAOException ex) {
            throw new FileServiceReciverException();
        }

        return str;
    }

    public static String getDataFromConsole() throws NullTextException {

        String str = DataScanner.enterStringFromConsole();
        if (Validator.isStringEmpty(str)) {
            throw new NullTextException("No text from console to process.");
        } else {
           return str;

        }
    }


}

