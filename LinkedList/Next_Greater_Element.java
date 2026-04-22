//leetcode 1019

import java.util.Stack;

public class Next_Greater_Element {

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

    public static int findSize(ListNode temp) {
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public static ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static int[] nextLargerNodes(ListNode lists) {
        //find size
        int size = findSize(lists);
        //reverse 
        ListNode ncurr = reverse(lists);
        //create new array with length size
        int[] arr = new int[size];
        Stack<Integer> st = new Stack<>();
        st.push(ncurr.val);

        ListNode curr = ncurr.next;
        int ptr = size - 2;

        while (ptr >= 0) {
            int ele = curr.val;
            curr = curr.next;

            //check and pop
            while (st.size() > 0 && st.peek() <= ele) {
                st.pop();
            }
            //put in array

            if (st.size() == 0) {
                arr[ptr] = 0;
            } else {
                arr[ptr] = st.peek();
            }
            //push in stack
            st.push(ele);
            ptr--;
        }
        return arr;
    }

    public static void main(String[] args) {
        //create First List
        ListNode head1 = new ListNode(1);
        ListNode temp1 = new ListNode(2);
        ListNode temp2 = new ListNode(3);
        head1.next = temp1;
        temp1.next = temp2;
        //create Second List
        ListNode head2 = new ListNode(2);
        ListNode temp3 = new ListNode(2);
        ListNode temp4 = new ListNode(4);
        head2.next = temp3;
        temp3.next = temp4;
        temp2.next = head2;
        print(head1);
        int[] ans = nextLargerNodes(head1);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
