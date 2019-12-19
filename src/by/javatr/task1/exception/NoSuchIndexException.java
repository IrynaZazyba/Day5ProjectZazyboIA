package by.javatr.task1.exception;

public class NoSuchIndexException  extends Exception{

    public NoSuchIndexException() {
    }

    public NoSuchIndexException(String message) {
        super(message);
    }

    public NoSuchIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchIndexException(Throwable cause) {
        super(cause);
    }
}
