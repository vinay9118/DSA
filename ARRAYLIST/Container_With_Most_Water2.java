
import java.util.ArrayList;
//2 Pointer Approach 

public class Container_With_Most_Water2 {

    public static int storeWater(ArrayList<Integer> list) {
        int maxWater = 0;
        int start=0;
        int end=list.size()-1;

        while(start<end){
            int ht=Math.min(list.get(start),list.get(end));
            int width=end-start;
            maxWater=Math.max(maxWater,ht*width);
            if(ht == list.get(start)){ //if(list.get(start)<list.get(end))
                start++;
            }
            else{                       //else
                end--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(2);
        System.out.println(storeWater(list));
    }
}
