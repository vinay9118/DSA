//leetcode Question 23 
import java.util.PriorityQueue;

public class Merge_K_Sort_List {

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void print(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        } else if (lists.length == 1) {
            return lists[0];
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (int i = 0; i < lists.length; i++) {
            ListNode temphead = lists[i];

            while (temphead != null) {
                pq.add(temphead);
                temphead = temphead.next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        while (pq.size() > 0) {
            ListNode node = pq.remove();
            dummy.next = node;
            dummy = dummy.next;
        }
        dummy.next = null;
        return ans.next;
    }

    public static void main(String[] args) {
        ListNode[] arr = new ListNode[3];

        arr[0] = new ListNode(1);
        arr[0].next = new ListNode(2);
        arr[0].next.next = new ListNode(2);

        arr[1] = new ListNode(1);
        arr[1].next = new ListNode(1);

        arr[2] = new ListNode(3);
        arr[2].next = new ListNode(5);
        arr[2].next.next = new ListNode(7);

        print(mergeKLists(arr));

    }
}
