
public class Recursive_Search{

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
    
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
            if(idx==-1){
                return -1;
            }
            return idx+1;
        
    }
    public int reSearch(int key) {
        return helper(head,key);
    }

    public static void main(String[] args) {
        Recursive_Search ll=new Recursive_Search();
        for (int i = 1; i < 6; i++) {
            ll.add(i);
        }
        ll.Print();
        //For Searching
        System.out.println("Element are Found at:"+ll.reSearch(3));
        System.out.println("Element are Found at:"+ll.reSearch(30));
    }

}
