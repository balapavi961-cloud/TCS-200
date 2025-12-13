class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class DiameterTree {

    static int diameter = 0;

    // Function to calculate height and update diameter
    static int height(Node root) {
        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Update diameter
        diameter = Math.max(diameter, leftHeight + rightHeight + 1);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    static int getDiameter(Node root) {
        diameter = 0;
        height(root);
        return diameter;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Diameter of Binary Tree: " + getDiameter(root));
    }
}
