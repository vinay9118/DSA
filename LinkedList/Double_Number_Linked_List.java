//Leetcode 2816

public class Double_Number_Linked_List {

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

    public static ListNode reverse(ListNode temp) {

        ListNode prev = null;
        ListNode curr = temp;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        return prev;
    }

    public static ListNode doubleIt(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode ptr1 = head;
        ListNode ptr = reverse(ptr1);
        int carry = 0;
        ListNode ans = dummy;
        print(ptr);
        while (ptr != null) {
            int sum = ptr.val + ptr.val + carry;
            carry = sum / 10;
            int d = sum % 10;
            ListNode temp = new ListNode(d);
            dummy.next = temp;
            dummy = dummy.next;
            ptr = ptr.next;
        }
        if (carry > 0) {
            ListNode temp = new ListNode(carry);
            dummy.next = temp;
        }

        return (reverse(ans.next));
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(6);
        ListNode head2 = new ListNode(4);
        ListNode head3 = new ListNode(8);
        head1.next = head2;
        head2.next = head3;
        ListNode ans=doubleIt(head1);
        print(ans);
    }
}
