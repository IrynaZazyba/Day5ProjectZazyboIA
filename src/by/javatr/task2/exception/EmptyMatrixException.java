package by.javatr.task2.exception;

public class EmptyMatrixException extends Exception{

    public EmptyMatrixException() {
    }

    public EmptyMatrixException(String message) {
        super(message);
    }

    public EmptyMatrixException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyMatrixException(Throwable cause) {
        super(cause);
    }
}
