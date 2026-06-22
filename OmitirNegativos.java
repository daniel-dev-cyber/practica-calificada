
public class OmitirNegativos {
    public static void main(String[] args) {
        int[] nums = {5, -2, 8, -1};

        for (int n : nums) {
            if (n < 0) continue;
            System.out.println(n);
        }
    }
}
