
public class Swap_Node {

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void print(ListNode temp) {
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void swapNode(ListNode head, int val1, int val2) {
        ListNode dummy = head;
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while (ptr1.next != null && ptr2.next != null) {
            if (ptr1.val != val1) {
                ptr1 = ptr1.next;
            }
            if (ptr2.val != val2) {
                ptr2 = ptr2.next;
            }
        }
        int temp = ptr1.val;
        ptr1.val = ptr2.val;
        ptr2.val = temp;
        print(dummy);
    }

    public static void main(String[] args) {
        ListNode head2 = new ListNode(1);
        ListNode temp3 = new ListNode(2);
        ListNode temp4 = new ListNode(4);
        head2.next = temp3;
        temp3.next = temp4;
        print(head2);
        swapNode(head2,1,4);
    }
}
