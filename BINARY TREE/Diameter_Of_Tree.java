
public class Diameter_Of_Tree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    public static int diameter2(Node root) {
        if (root == null) {
            return 0;
        }
        int leftd = diameter2(root.left);
        int lefth = height(root.left);

        int rightd = diameter2(root.right);
        int righth = height(root.right);

        int selfd = lefth + righth + 1;

        return Math.max(selfd, Math.max(leftd, rightd));
    }

    static class Info{
        int diam;
        int ht;

        public  Info (int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }

    public static Info diameter(Node root){

        if(root==null){
            return new Info(0,0);
        }

        Info leftInfo=diameter(root.left);
        Info righInfo=diameter(root.right);

        int diam=Math.max(Math.max(leftInfo.diam,righInfo.diam),leftInfo.ht+righInfo.ht+1);
        int ht=Math.max(leftInfo.ht,righInfo.ht)+1;

        return new Info(diam,ht);
    }



    //for leetcode Solution
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(diameter(root).diam);
    }
}
