//LeetCode 83

public class Remove_Duplicate_Linked {

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

    public static ListNode removeDuplicate(ListNode head) {
            if(head==null || head.next==null){
                return head;
            }
            ListNode dummy=new ListNode(head.val);
            ListNode ans=dummy;
            ListNode ptr=head;
            while(ptr!=null){

                if(dummy.val!=ptr.val){
                    dummy.next=new ListNode(ptr.val);
                    dummy=dummy.next;
                    ptr=ptr.next;
                }
                ptr=ptr.next;
            }
            print(ans);
            return ans;
    }

    public static void main(String[] args) {
        //create First List
        ListNode head1 = new ListNode(1);
        ListNode temp1 = new ListNode(2);
        ListNode temp2 = new ListNode(2);
        head1.next = temp1;
        temp1.next = temp2;
        //print List
        print(head1);
        //remove Duplicate node
        removeDuplicate(head1);
    }
}
