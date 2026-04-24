
public class Reverse_Of_LinkedList {

    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    //Reverse Order of Linked
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
       
    }

    public static void main(String[] args) {
        //Reverse Linked List
        Reverse_Of_LinkedList ll = new Reverse_Of_LinkedList();
        for(int i=5;i>0;i--){
            ll.add(i);
        }
        ll.print();
        ll.reverse();
        ll.print();
    }
}
