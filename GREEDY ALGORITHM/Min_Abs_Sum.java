
import java.util.*;

public class Min_Abs_Sum {

    public static void main(String[] args) {
        int[] arr1 = {1, 20, 3};
        int[] arr2 = {3, 2, 1};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int diff = 0;
        for (int i = 0; i < arr1.length; i++) {
             diff+=Math.abs(arr1[i]-arr2[i]);
        }
        System.out.println(diff);
    }
}
