
import java.util.ArrayList;

public class Pair_Sum1 {

    public static void print(int start, int end) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(start);
        list1.add(end);
        System.out.println(list1);
    }

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int sum = list.get(start) + list.get(end);
            if (sum == target) {
                print(start,end);
                return true;

            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            list.add(i);//1 2 3 4 5 6
        }
        System.out.println(list);
        int target = 4;
        System.out.println("target:"+target+"   list  "+list);
        System.out.println(pairSum(list, target));
    }
}
