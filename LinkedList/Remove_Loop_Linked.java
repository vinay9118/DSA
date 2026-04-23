
public class Remove_Loop_Linked {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void Print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {

                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        //find Meeting point 
        slow = head;
        Node prev =fast;
        while (slow == fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove  cycle ->last.next=null
        prev.next= null;

    }

    public static void main(String[] args) {
        Remove_Loop_Linked ll=new Remove_Loop_Linked();
        for(int i=1;i<5;i++){
            ll.add(i);
        }
        tail.next=head.next;
       
        //1->2->3->4->2

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
