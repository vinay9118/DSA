
public class Linked_List_Cycle2 {

    public class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void add(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void Print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static ListNode head;
    public static ListNode tail;
    public static int size;

    public static ListNode isCycle() {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { //cycle exist
                ListNode ptr = head;
                while (ptr != slow) {
                    slow = slow.next;
                    ptr = ptr.next;
                }
                return ptr;
            }

        }
        return null;

    }

    public static void main(String[] args) {
        Linked_List_Cycle2 ll = new Linked_List_Cycle2();
        for (int i = 1; i < 6; i++) {
            ll.add(i);
        }
        tail.next = head.next;
        ListNode ans = isCycle();
        System.out.println(ans.val);

    }

}
