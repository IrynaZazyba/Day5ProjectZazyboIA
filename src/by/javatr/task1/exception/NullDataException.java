package by.javatr.task1.exception;

public class NullDataException extends Exception{

    public NullDataException() {
    }

    public NullDataException(String message) {
        super(message);
    }

    public NullDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullDataException(Throwable cause) {
        super(cause);
    }
}
