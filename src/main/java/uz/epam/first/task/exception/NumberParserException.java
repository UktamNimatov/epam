package uz.epam.first.task.exception;

public class NumberParserException extends Exception{
    public NumberParserException() {
        super();
    }

    public NumberParserException(String message) {
        super(message);
    }

    public NumberParserException(String message, Throwable cause) {
        super(message, cause);
    }
}
