class CustomNullPointerException extends Exception {
    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class Test {
    public static void main(String[] args) throws CustomNullPointerException {
        String str = null;
        if (str == null)
            throw new CustomNullPointerException("Custom Null Pointer Exception");
    }
}
