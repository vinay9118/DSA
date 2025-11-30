
public class Minimum_sum_divK {

    public static int minOperations(int[] nums, int k) {
        long s = 0;
        for (int x : nums) {
            s += x;
        }
        return (int) (s % k);
    }

    public static void main(String[] args) {
        int[] arr = {3, 9, 7};
        int k = 5;
        System.out.println(minOperations(arr, k));
    }
}
