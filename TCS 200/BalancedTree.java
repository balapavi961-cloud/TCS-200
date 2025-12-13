class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BalancedTree {

    // Function to check height and balance
    static int height(Node root) {
        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        if (leftHeight == -1)
            return -1;

        int rightHeight = height(root.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Function to check if tree is balanced
    static boolean isBalanced(Node root) {
        return height(root) != -1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        if (isBalanced(root))
            System.out.println("Binary Tree is Balanced");
        else
            System.out.println("Binary Tree is NOT Balanced");
    }
}
