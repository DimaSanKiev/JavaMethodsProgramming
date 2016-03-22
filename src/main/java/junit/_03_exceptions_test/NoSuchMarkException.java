package junit._03_exceptions_test;

public class NoSuchMarkException extends Exception {
    public NoSuchMarkException() {
    }

    public NoSuchMarkException(String message) {
        super(message);
    }
}
