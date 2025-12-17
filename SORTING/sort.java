import java.util.*;

// leetcode 75
public class sort {

    public static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else { // nums[mid] == 2
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;     // FIXED
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {2,0,2,1,1,0,1,2,0,1};
        sortColors(num);  

        System.out.println(Arrays.toString(num));
    }
}
