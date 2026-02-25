//leetcode 2095

public class Delete_Node {

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

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static ListNode deleteMiddle(ListNode head) {

        ListNode start = head;
        ListNode fast = head;
        ListNode ptr = start;
        while (fast != null && fast.next != null) {
            ptr = start;
            start = start.next;
            fast = fast.next.next;
        }
        ptr.next = ptr.next.next;
        return head;
        // print(head);
    }

    public static void main(String[] args) {
        ListNode head2 = new ListNode(1);
        ListNode temp3 = new ListNode(2);
        ListNode temp4 = new ListNode(4);
        head2.next = temp3;
        temp3.next = temp4;
        print(head2);
        // deleteNode(temp3);
        // print(head2);
        print(deleteMiddle(head2));
    }
}
