//importjava.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Basic_Operation {

    public static void swap(ArrayList<Integer> list1, int idx1, int idx2) {
        int temp = list1.get(idx1);
        list1.set(idx1, list1.get(idx2));
        list1.set(idx2, temp);
        System.out.println("After Swapping:" + list1);
    }

    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <String> list2 = new ArrayList<>();
        ArrayList <Float> list3 = new ArrayList<>();

        // Operation on ArrayLists
        // 1.Add Element -> O(1)
        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.add(0);
        list1.add(-1);
        System.out.println("After Add Element in ArrayLists:" + list1);

        //  list.add(index,newvalue) -> O(n)
        list1.add(1, 20);
        System.out.println("Add Element at index and slide the element in right side" + list1);

        // 2.Get Element  --> O(1)
        System.out.println("After Get Operation:" + list1.get(2));

        // 3.Remove Element ->  O(n) list.remove(index)
        System.out.println("Element Remove:" + list1.remove(2) + "    After Remove Element ArrayList :" + list1);

        // 4.SetElement Operation  -> O(n) list.set(index,newvalue)
        list1.set(2, 90);
        System.out.println(list1);

        // Contains Element list.contains(value)  ->  O(n)
        System.out.println(list1.contains(3));

        //Size operation 
        System.out.println("Size of Array:" + list1.size());

        //Print the arraylist
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i) + " ");
        }

        //Reverse arrayList
        int max = Integer.MIN_VALUE;
        System.out.println("Reverse Number");
        for (int i = list1.size() - 1; i >= 0; i--) {
            System.out.print(list1.get(i) + " ");
            max = Math.max(max, list1.get(i));
        }

        //Max Number
        System.out.println("Maximum number:" + max);

        //Swapping
        swap(list1, 1, 3);

        //Sort the Number
        Collections.sort(list1);
        System.out.println(list1);

        //Descending Order
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("Descending Order Of ArrayList -->:  "+list1);

    }
}
