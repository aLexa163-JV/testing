package pro.sry.testing.exception;

public class DivisionByZeroException extends IllegalArgumentException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
