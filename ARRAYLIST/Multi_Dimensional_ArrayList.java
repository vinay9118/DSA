
import java.util.ArrayList;

public class Multi_Dimensional_ArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            arr1.add(i * 1);
            arr2.add(i * 2);
            arr3.add(i * 3);
        }
        mainList.add(arr1);
        mainList.add(arr2);
        mainList.add(arr3);
        //Traverse the list
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
