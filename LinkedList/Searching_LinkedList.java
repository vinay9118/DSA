
public class Searching_LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
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

    public int search(int key) {
        int i = 0;
        Node prev = head;
        while (prev != null) {
            if (prev.data != key) {
                prev = prev.next;
                i++;
            } else {
                System.out.println(key+" are Found at Indxe:" + i);
                return i;
            }
        }
            System.out.println(key+" are not Present in Given LinkedList index:-1");
            return -1;
    }

    public static void main(String[] args) {
        Searching_LinkedList ll = new Searching_LinkedList();
        for (int i = 1; i < 6; i++) {
            ll.add(i);
        }
        ll.Print();
        //Searching 
        ll.search(30);
    }

}
