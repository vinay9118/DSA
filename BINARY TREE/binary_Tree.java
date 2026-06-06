
public class binary_Tree {

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

    static class BinaryTree {

        static int idx = -1;

        public static Node buildtree(int[] node) {
            idx++;

            if (node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildtree(node);
            newNode.right = buildtree(node);

            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void PostOrder(Node root) {
            if (root == null) {
                return;

            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void InOrder(Node root) {
            if (root == null) {
                return;
            }
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] node = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree root = new BinaryTree();
        Node ans = root.buildtree(node);
        System.out.println("PreOrder Traversal:");
        root.preOrder(ans);
        System.out.println(" ");
        System.out.println("PostOrder Traversal");
        root.PostOrder(ans);
        System.out.println(" ");
        System.out.println("Inorder Traversal");
        root.InOrder(ans);

    }
}
