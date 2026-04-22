
public class Palindrome {

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

    public void Print() {
        Node prev = head;
        while (prev != null) {
            System.out.print(prev.data + " -> ");
            prev = prev.next;
        }
        System.out.println("null");
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;//+1
            fast = fast.next.next; //+2
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if (head == null || head.next != null) {
            return true;
        }
        //Find mid
        Node midNode = findMid(head);
        //Reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        //step3 check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }

        return true;
    }

    public static void main(String[] args) {
        Palindrome ll = new Palindrome();
        ll.add(1);
        ll.add(1);
        ll.add(2);
        ll.add(1);
        ll.add(1);
        ll.Print();
        System.out.println(ll.checkPalindrome());

    }
}
