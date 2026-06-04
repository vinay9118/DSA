
import java.util.ArrayList;

public class Pair_Sum2 {

    public static void print(int start, int end) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(start);
        list1.add(end);
        System.out.println(list1);
    }

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        int n = list.size();
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int start = bp + 1;
        int end = bp;
        while (start != end) {
            int sum = list.get(start) + list.get(end);
            if (sum == target) {
                print(start, end);
                return true;

            } else if (sum < target) {
                start = (start + 1) % n;
            } else {
                end = (end + n - 1) % n;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println("target:"+target+"   list  "+list);
        System.out.println(pairSum(list, target));
    }
}
