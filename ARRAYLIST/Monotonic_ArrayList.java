
import java.util.ArrayList;

public class Monotonic_ArrayList {

    public static boolean isMonotonic(ArrayList<Integer> list) {
        boolean flag1 = true;
        boolean flag2 = true;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {
                flag1 = false;
            }
            if (list.get(i) < list.get(i - 1)) {
                flag2 = false;
            }
        }
        return flag1 || flag2;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println(list);
        System.out.println(isMonotonic(list));
    }
}
