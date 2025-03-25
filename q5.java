public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc");
            try {
                int res = 10 / 0;
                System.out.println(res);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Error");
            }
        } catch (NumberFormatException e) {
            System.out.println("Number Format Error");
        }
    }
}
