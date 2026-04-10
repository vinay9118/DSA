
public class Minimum_Operation {

    public static int minimumOperations(int[] nums) {
        int ans = 0;
        for (int val : nums) {
            int n = val % 3;
            if (n != 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //INPUT
        int[] nums = {1, 2, 4, 7};
        System.out.println(minimumOperations(nums));
    }
}
