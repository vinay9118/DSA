import java.util.*;

public class CountPartition {

    public static int countPartitions(int[] nums) {
        int n = nums.length;
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        if (total % 2 != 0) {
            return 0;
        }

        return n - 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4}; // Already defined input
        int result = countPartitions(nums);
        System.out.println(result);
    }
}
