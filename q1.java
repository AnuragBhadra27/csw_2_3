public class ExtractNumbers {
    public static void main(String[] args) {
        String str = "abc123def456";
        if (str == null || str.isEmpty())
            throw new NullPointerException("String is null or empty");

        String nums = str.replaceAll("\\D", "");
        System.out.println(nums.isEmpty() ? "No numeric characters" : nums);
    }
}
