import java.util.Scanner;

public class SqrtDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            System.out.println("Square root: " + Math.sqrt(num));
        } catch (ArithmeticException e) {
            System.out.println("Cannot find square root of negative number");
        }
        sc.close();
    }
}
