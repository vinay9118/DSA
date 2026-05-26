
import java.util.*;

public class Deque1 {

    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(6);
        d.addFirst(3);
        d.addLast(5);
        d.addFirst(6);
        System.out.print(d);

        d.remove();
        System.out.print(d);

    }
}
