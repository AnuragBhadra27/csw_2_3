import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num = Integer.parseInt(sc.nextLine());
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid number");
        }
        sc.close();
    }
}
