package by.javatr.task3.exception;

public class NullTextException extends Exception{

    public NullTextException() {
    }

    public NullTextException(String message) {
        super(message);
    }

    public NullTextException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullTextException(Throwable cause) {
        super(cause);
    }
}
