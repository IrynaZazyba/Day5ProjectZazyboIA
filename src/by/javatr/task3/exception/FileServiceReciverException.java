package by.javatr.task3.exception;

public class FileServiceReciverException extends DAOException{


    public FileServiceReciverException() {
    }

    public FileServiceReciverException(String message) {
        super(message);
    }

    public FileServiceReciverException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileServiceReciverException(Throwable cause) {
        super(cause);
    }
}
