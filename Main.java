// Define the Node Class
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null; // Initialize left as null
        this.right = null; // Initialize right as null
    }
}

// Define the BinarySearchTree Class
class BinarySearchTree {
    Node root;

    // Method to insert a new node
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    // Recursive helper method to insert a new node
    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        }
        return current;
    }

    // Method to perform inorder traversal
    public void inorderTraversal() {
        inorderTraversalRecursive(root);
    }

    // Recursive helper method for inorder traversal
    private void inorderTraversalRecursive(Node node) {
        if (node != null) {
            inorderTraversalRecursive(node.left); // Traverse left subtree
            System.out.print(node.data + " "); // Visit the node
            inorderTraversalRecursive(node.right); // Traverse right subtree
        }
    }
}

// Test the BinarySearchTree
public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);
        tree.insert(70);
        tree.insert(80);
        
        System.out.println("Inorder traversal of the tree:");
        tree.inorderTraversal(); // Should print: 20 30 40 50 60 70 80
    }
}
       
            
