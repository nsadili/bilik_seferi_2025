public class StackUnderflowException extends RuntimeException {
    public StackUnderflowException() {

    }

    public StackUnderflowException(String message) {
        super(message);
    }

    public StackUnderflowException(Throwable cause) {
        super(cause);
    }

    public StackUnderflowException(String message, Throwable cause) {
        super(message, cause);
    }
}
