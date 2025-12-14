import java.util.*;

public class DifferenceOfSum { 
    public static int differenceOfSum(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        int minSum = 0;
        int maxSum = 0;

        // sum of k smallest elements
        for (int i = 0; i < k; i++) {
            minSum += nums[i];
        }

        // sum of k largest elements
        for (int i = n - k; i < n; i++) {
            maxSum += nums[i];
        }

        return Math.abs(maxSum - minSum);
    }

    public static void main(String[] args) {
        // input already defined
        int[] nums = {1, 4, 3, 2, 5};
        int k = 2;

        int result = differenceOfSum(nums, k);
        System.out.println(result);
    }
}
