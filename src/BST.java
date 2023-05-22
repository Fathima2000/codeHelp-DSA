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

public class BST{
	static void takeInput(Node root) {
		Scanner sc = new Scanner(System.in);
	    int data = sc.nextInt();
	    
	    while(data!=-1) {
	    	root = inserIntoBST(root, data);
	    	data = sc.nextInt();
	    }
	}
	
	static Node inserIntoBST(Node root, int data) {
		//BASE CASE
		if(root==null) {
			//this is the first node we have to create
			root = new Node(data);
			return root;
		}
		
		//RECURSION calls	
		if(data < root.data) {
			//insert into left
			root.left = inserIntoBST(root.left, data);
		}
		else {
			//insert into right
			root.right = inserIntoBST(root.right, data);
		}
		
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
	
	public static void main(String[] args) {
		Node root = null;
		System.out.println("Enter the data: ");

		takeInput(root);
        levelOrderTraversal(root);
	
	}
}