
public class Loop_In_Linked {

    public class Node {

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

    public boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow ==fast ){
                System.out.println("Linked List formed Cycle");
                return true;
            }
        }
        System.out.println("Linked List not formed Cycle");
        return false;
    }
    public static void main(String[] args) {
        Loop_In_Linked ll = new Loop_In_Linked();
        for (int i = 5; i > 0; i--) {
            ll.add(i);
        }
        ll.Print();
        ll.isCycle();
    }
}
