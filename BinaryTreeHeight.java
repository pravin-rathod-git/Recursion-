





class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreeHeight {

    // Recursive function to find height
    public static int height(Node root) {

        // ✅ Base Condition
        if (root == null) {
            return 0;
        }

        // ✅ Hypothesis
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // ✅ Induction
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

        /*
                Constructing this tree:

                        1
                       / \
                      2   3
                     /
                    4
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        int treeHeight = height(root);

        System.out.println("Height of Binary Tree: " + treeHeight);
    }
}