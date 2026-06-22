
import java.util.*;

public class Max_Length_Chain_Pair {

    public static void main(String[] args) {
        int[][] arr = {
            {5, 24}, {39, 60},
            {5, 28}, {27, 40}, {50, 90}
        };

        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));
        int end = arr[0][1];
        int ans = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] > end) {
                ans++;
                end = arr[i][1];
            }
        }
        System.out.println("Final Answer:"+ans);
    }
}
