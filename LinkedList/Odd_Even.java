// Leetcode 
public class Odd_Even {

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

    public static void oddEvenList1(ListNode head) {

        ListNode start = head;
        ListNode fast = head;

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        while (start != null) {

            ListNode temp = new ListNode(start.val);
            dummy.next = temp;
            dummy = dummy.next;
            start = start.next.next;
        }
        while (fast != null) {
            fast = fast.next;
            ListNode temp = new ListNode(fast.val);
            dummy.next = temp;
            dummy = dummy.next;
            fast = fast.next;
        }
        print(ans.next);
    }

    public static void OddEvenList(ListNode head){
        ListNode oddh=head;

        ListNode evenh=head.next;
        ListNode evenstart=evenh;

        while(evenh!=null && evenh.next!=null){
            oddh.next=oddh.next.next;
            evenh.next=evenh.next.next;

            oddh=oddh.next;
            evenh=evenh.next;
        }
        oddh.next=evenstart;
        print(head);
   }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode head1 = new ListNode(3);
        ListNode head2 = new ListNode(4);
        ListNode head3 = new ListNode(5);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        print(head);
        OddEvenList(head);
    }
}
