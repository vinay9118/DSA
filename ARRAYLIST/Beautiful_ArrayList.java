
import java.util.ArrayList;

public class Beautiful_ArrayList {

    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (Integer e : list) {
                if (2 * e <= n) {
                    temp.add(e * 2);
                }
            }
            for (Integer e : list) {
                if (2 * e-1 <= n) {
                    temp.add(e * 2-1);
                }
            }
            list=temp;
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        int n = 4;
        beautifulArray(n);
    }
}
