package by.javatr.task1.exception;

import by.javatr.task3.exception.DAOException;

public class FileServiceReceiverException extends DAOException{


    public FileServiceReceiverException() {
    }

    public FileServiceReceiverException(String message) {
        super(message);
    }

    public FileServiceReceiverException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileServiceReceiverException(Throwable cause) {
        super(cause);
    }
}
