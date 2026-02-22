
public class LinkedList {

    public static class Node {

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

    public void addFirst(int data) {
        //Step1 Create New Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //Step2 newNode next-head
        newNode.next = head;
        //Step 3 head=newNode
        head = newNode;
    }

    public void addLast(int data) {
        //Step1 Create New Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //Step 2 tail.next=newnode
        tail.next = newNode;
        //Step3 tail=newNode
        tail = newNode;

    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        int i = 0;
        Node newNode = new Node(data);
        Node temp = head;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void Print() {
        if (head == null) {
            System.out.println("Linked List Is Empty");
        }
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        while (prev.next.next != null) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        System.out.println("Last Element Deleted:" + val);
        size--;
        return val;
    }

    public int remove(int idx) {
        //Write Previous code for size 0 and size 1 
        int i = 0;
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

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println("Element are added at Beginiing:");
        ll.addFirst(10);
        ll.Print();
        System.out.println("Element are added at Beginiing:");
        ll.addFirst(20);
        ll.Print();
        System.out.println("Element are added at End:");
        ll.addLast(30);
        ll.Print();
        System.out.println("Element are added at End:");
        ll.addLast(40);
        ll.Print();
        System.out.println("Element are added at Index with value:");
        ll.add(2, 29);
        ll.Print();
        //Size Of
        System.out.println("Size Of LinkedList:" + size);
        //Remove Element In LinkedList
        System.out.println("Element are Removed at Bgining:");
        ll.removeFirst();
        ll.Print();

        System.out.println("Element are Removed at End:");
        ll.removeLast();
        ll.Print();

        System.out.println("Element are Removed at Given Index:");
        ll.remove(1);
        ll.Print();

        //Search for key in LinkedList Return the Position Where it is found if Not then return -1
    }
    
}
