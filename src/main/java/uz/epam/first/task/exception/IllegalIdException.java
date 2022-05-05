package uz.epam.first.task.exception;

public class IllegalIdException extends Exception {

    public IllegalIdException() {
        super();
    }

    public IllegalIdException(String message) {
        super(message);
    }

    public IllegalIdException(String message, Throwable cause) {
        super(message, cause);
    }
}
