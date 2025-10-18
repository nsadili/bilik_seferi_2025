import java.util.List;

public class StackOverflowException extends RuntimeException {
    public StackOverflowException() {
        super();
    }

    public StackOverflowException(String message) {
        super(message);
    }

    public StackOverflowException(Throwable cause) {
        super(cause);
    }

    public StackOverflowException(String message, Throwable cause) {
        super(message, cause);
    }
}
