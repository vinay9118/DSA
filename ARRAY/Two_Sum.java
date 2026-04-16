import java.util.*;
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end < nums.length; end++) {
                if (nums[start] + nums[end] == target) {
                    System.out.println(start + " " + end); 
                    return new int[] { start, end };
                }
            }
        }
        return null;
    }
    public static void main(String[] args){
        //Input
        int[]arr={2,7,11,14};
        int target=9;
        int [] result=twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
