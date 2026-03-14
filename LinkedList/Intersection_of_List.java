//Leetcode 160
public class Intersection_of_List {

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

    public static int size(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static ListNode Intersection(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;

        int size1 = size(ptr1);
        int size2 = size(ptr2);

        int diff = size1 - size2;

        if (diff > 0) {// list1 is greater than list2
            while (diff != 0) {
                ptr1 = ptr1.next;
                diff--;
            }

        } else {//list2 is greater than list1
            while (diff != 0) {
                ptr2 = ptr2.next;
                diff++;
            }
        }
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;

    }

    public static void main(String[] args) {
        //create First 
        ListNode head1 = new ListNode(1);
        ListNode temp1 = new ListNode(2);
        head1.next = temp1;
        //create Second List
        ListNode head2 = new ListNode(2);
        ListNode temp3 = new ListNode(2);
        ListNode temp4 = new ListNode(4);
        head2.next = temp3;
        temp3.next = temp4;
        //create Third List
        ListNode t3 = new ListNode(3);
        ListNode t4 = new ListNode(4);
        ListNode t5 = new ListNode(5);
        t3.next = t4;
        t4.next = t5;
        //Combine list
        temp1.next = t3;
        temp4.next = t3;
        print(head1);
        print(head2);
        ListNode ans = Intersection(head1, head2);
        print(ans);
    }
}
