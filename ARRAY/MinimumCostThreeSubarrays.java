public class MinimumCostThreeSubarrays{

    public static int minimumCost(int[] nums) {
        int n = nums.length;

        // Suffix minimum array
        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        int ans = Integer.MAX_VALUE;

        // Choose start of 2nd subarray
        for (int i = 1; i <= n - 2; i++) {
            int cost = nums[0] + nums[i] + suffixMin[i + 1];
            ans = Math.min(ans, cost);
        }

        return ans;
    }

    public static void main(String[] args) {
        // Input already defined
        int[] nums = {5, 2, 3, 1, 4};

        int result = minimumCost(nums);

        // Output
        System.out.println("Minimum possible cost: " + result);
    }
}
