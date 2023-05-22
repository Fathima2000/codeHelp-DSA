package tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTree {

    public static Node buildTree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data: ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        // Step A, B and C
        Node root = new Node(data);

        System.out.println("Enter data for left part of " + data + " node");
        root.left = buildTree();

        System.out.println("Enter data for right part of " + data + " node");
        root.right = buildTree();

        return root;
    }

    public static void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        // initially
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            // A
            Node temp = q.peek();
            q.remove();

            if (temp == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                // C
                System.out.print(temp.data + " ");
                // D
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    public static void inorderTraversal(Node root) {
        // base case
        if (root == null) {
            return;
        }

        // LNR
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void preorderTraversal(Node root) {
        // base case
        if (root == null) {
            return;
        }

        // NLR
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void postorderTraversal(Node root) {
        if (root == null) {
            return;
        }

        // LRN
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int ans = Math.max(leftHeight, rightHeight) + 1;
        return ans;
    }

    public static void main(String[] args) {
        Node root = null;

        root = buildTree();
        levelOrderTraversal(root);
        System.out.println("Height: " + height(root));
    }
}