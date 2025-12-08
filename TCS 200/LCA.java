


public class BinaryTree {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    Node root;
    BinaryTree(int data){
        root = new Node(data);
    }
    public void insertLeft(Node root,int data){
        Node n = new Node(data);
        root.left=n;
    }
    public void insertRight(Node root,int data){
        Node n = new Node(data);
        root.right=n;
    }
    public BinaryTree lowestCommonAncestor(BinaryTree root, BinaryTree p, BinaryTree q) {
        if (root == null) return null;
        if (root == p || root == q) return root;

        BinaryTree left = lowestCommonAncestor(root.left, p, q);
        BinaryTree right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) return root;
        return left == null ? right : left;
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(10);
        bt.insertLeft(bt.root,15);
        bt.insertRight(bt.root,20);
        bt.insertLeft(bt.root.left,11);
        bt.insertRight(bt.root.left,13);
        System.out.println(lowestCommonAncestor(bt.root));
    }
}
