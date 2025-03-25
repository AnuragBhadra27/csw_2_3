public class Matrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        try {
            System.out.println(mat[2][1]);  // Out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Matrix index out of bounds");
        }
    }
}
