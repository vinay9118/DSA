//leetcode 19

public class Remove_Nth_Node_End {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void Print() {
        Node prev = head;
        while (prev != null) {
            System.out.print(prev.data + " -> ");
            prev = prev.next;
        }
        System.out.println("null");
    }

    public int remove(int idx) {
        int i = 1;
        idx = (size - idx + 1);
        Node prev = head;
        Node prev1 = prev;
        while (i != idx) {
            prev1 = prev;
            prev = prev.next;
            i++;
        }
        prev1.next = prev.next;
        // prev.next=null;
        int val = prev.data;
        size--;
        return val;
    }

    public void deleteNthfromEnd(int n) {
        //Calculate size
        Node prev = head;
        int sz = 0;
        while (prev != null) {
            sz++;
            prev = prev.next;
        }
        if (sz == n) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = sz - n;
        Node temp = head;
        while (i < iToFind) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode start = head;
        ListNode fast = head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        if(fast == null){
            return head.next;
        }
        while (fast.next != null) {

            start = start.next;
            fast = fast.next;
        }
        start.next = start.next.next;
        return head;
    }

    public static void main(String[] args) {
        Remove_Nth_Node_End ll = new Remove_Nth_Node_End();
        for (int i = 5; i > 0; i--) {
            ll.add(i);
        }
        ll.Print();
        // ll.remove(2);  
        ll.deleteNthfromEnd(3);
        ll.Print();
        //Create New Linked List
        ListNode head2 = new ListNode(1);
        ListNode temp3 = new ListNode(2);
        ListNode temp4 = new ListNode(4);
        head2.next = temp3;
        temp3.next = temp4;
        ListNode prev = removeNthFromEnd(head2, 3);
        while (prev != null) {
            System.out.print(prev.val + " -> ");
            prev = prev.next;
        }
        System.out.println("null");
    }
}
