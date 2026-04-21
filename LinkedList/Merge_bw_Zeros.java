/*leetcode 2181 Popular question */
public class Merge_bw_Zeros {

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

    public static ListNode merge_bw_Zeros(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode ans=dummy;
        ListNode ptr = head.next;
        int sum = 0;
        while (ptr != null) {
            if (ptr.val != 0) {
                sum += ptr.val;
            } else {
                ListNode temp = new ListNode(sum);
                dummy.next = temp;
                dummy = dummy.next;
                sum = 0;
            }
            ptr = ptr.next;
        }
        return ans.next;
    }

    public static void main(String[] args) {
        ListNode head2 = new ListNode(0);
        ListNode temp3 = new ListNode(2);
        ListNode temp4 = new ListNode(0);
        ListNode temp5 = new ListNode(4);
        ListNode temp6 = new ListNode(5);
        ListNode temp7 = new ListNode(0);
        head2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;
        temp5.next = temp6;
        temp6.next = temp7;
        print(merge_bw_Zeros(head2));
    }
}
