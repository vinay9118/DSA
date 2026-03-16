//LeetCode 21
public class Merge_Two_SortedList {

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
        System.out.println("null");
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val < ptr2.val) {
                dummy.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                dummy.next = ptr2;
                ptr2 = ptr2.next;
            }
            dummy = dummy.next;

        }
        if (ptr1 == null) {
            dummy.next = ptr1;
        } else {
            dummy.next = ptr2;
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
        ListNode result = merge(head1, head2);
        //after the merge print list
        print(result);
    }
}
