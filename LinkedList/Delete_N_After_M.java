

public class Delete_N_After_M {

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


    public static ListNode skipMdelete(ListNode head, int M, int N) {
        ListNode curr = head, t;
        int count;
        while (curr != null) {
            for (count = 1; count < M && curr != null; count++) {
                curr = curr.next;
            }
            if (curr == null) {
                return null;
            }
            t = curr.next;
            for (count = 0; count < N && t != null;count++) {
                ListNode temp=t;
                t=t.next;
            }
            curr.next=t;
            curr=t;
        }
        return head;
    }

    public static void main(String[] args) {
        //Create List
        ListNode head2 = new ListNode(1);
        ListNode temp3 = new ListNode(2);
        ListNode temp4 = new ListNode(3);
        ListNode temp5 = new ListNode(4);
        ListNode temp6 = new ListNode(5);
        ListNode temp7 = new ListNode(6);
        head2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;
        temp5.next = temp6;
        temp6.next = temp7;
        print(head2);
        print(skipMdelete(head2, 2, 2));
    }
}
