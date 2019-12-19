package by.javatr.task1.exception;

public class NotPositiveNumber extends Exception{

    public NotPositiveNumber() {
    }

    public NotPositiveNumber(String message) {
        super(message);
    }

    public NotPositiveNumber(String message, Throwable cause) {
        super(message, cause);
    }

    public NotPositiveNumber(Throwable cause) {
        super(cause);
    }
}
