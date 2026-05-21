import java.util.*;

public class Backtracking{
    public static void printSubset(int[] arr, ArrayList<Integer> ans, int i) {
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }

        ans.add(arr[i]);
        printSubset(arr, ans, i + 1);
        
        ans.remove(ans.size() - 1);
        printSubset(arr, ans, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> ans = new ArrayList<>();
        printSubset(arr, ans, 0);
    }
}