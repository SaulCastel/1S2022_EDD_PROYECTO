package edd.proy1;

public class BST<T> {

    class Node{
        int key;
        Node left, right;
 
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
 
    // Root of BST
    Node root;
 
    // Constructor
    BST() { root = null; }
 
    BST(int value) { root = new Node(value); }
 
    // This method mainly calls insertRec()
    void insert(int key) { root = insertRec(root, key); }
 
    /* A recursive function to
       insert a new key in BST */
    Node insertRec(Node root, int key)
    {
 
        /* If the tree is empty,
           return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder() { inorderRec(root); }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
        inorderRec(root.left);
        System.out.println(root.key);
        inorderRec(root.right);
        }
    }

    void preorderRec(Node root)
    {
        if (root != null) {
        System.out.println(root.key);
        preorderRec(root.left);
        preorderRec(root.right);
        }
    }

    void posorderRec(Node root)
    {
        if (root != null) {
        posorderRec(root.left);
        posorderRec(root.right);
        System.out.println(root.key);
        }
    }
}
