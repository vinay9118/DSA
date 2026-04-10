
public class Minimum_sum_divK {

    public static int minOperations(int[] nums, int k) {
        long ans = 0;
        for (int x : nums) {
            ans += x;
        }
        return (int) (ans % k);
    }

    public static void main(String[] args) {
        //Input
        int[] arr = {3, 9, 4};
        int k = 5;
        System.out.println(minOperations(arr, k));
    }
}
