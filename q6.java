import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        try {
            System.out.println(arr[10]);  // Out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
}
