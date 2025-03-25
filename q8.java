class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new CustomCheckedException("Custom checked exception");
        } catch (CustomCheckedException e) {
            System.out.println(e.getMessage());
        }
    }
}
