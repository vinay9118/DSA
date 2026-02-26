
//LeetCode 2
public class Add_Two_List {

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode head;
    public static ListNode tail;
    public static int size;

    public void add(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public static void print(ListNode temp) {
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println(" null ");
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        ListNode ptr1 = l1;
        ListNode ptr2 = l2;

        int carry = 0;

        while (ptr1 != null || ptr2 != null) {
            int val1 = ptr1 != null ? ptr1.val : 0;
            int val2 = ptr2 != null ? ptr2.val : 0;

            int sum = val1 + val2 + carry;
            int d = sum % 10;
            carry = sum / 10;

            ListNode temp = new ListNode(d);

            dummy.next = temp;
            dummy = dummy.next;

            ptr1 = ptr1 != null ? ptr1.next : null;
            ptr2 = ptr2 != null ? ptr2.next : null;
        }
        if (carry > 0) {
            ListNode temp = new ListNode(carry);
            dummy.next = temp;
            dummy = dummy.next;
        }
        return ans.next;
    }

    public static void main(String[] args) {
        
        //create First List
        ListNode head1 = new ListNode(1);
        ListNode temp1 = new ListNode(2);
        ListNode temp2 = new ListNode(3);
        head1.next = temp1;
        temp1.next = temp2;

        //create Second List
        ListNode head2 = new ListNode(2);
        ListNode temp3 = new ListNode(2);
        ListNode temp4 = new ListNode(4);
        head2.next = temp3;
        temp3.next = temp4;

        //print List
        print(head1);
        print(head2);

        //call function for merging
        print(addTwoNumbers(head1, head2));
    }
}
