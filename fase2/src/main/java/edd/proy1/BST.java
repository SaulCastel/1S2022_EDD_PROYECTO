package edd.proy1;

public class BST<T> {

    class Node<T>{
        T key;
        Node<T> left, right;
 
        public Node(T item)
        {
            key = item;
            left = right = null;
        }
    }
 
    // Root of BST
    Node<T> root;
 
    // Constructor
    BST() { root = null; }
 
    BST(T value) { root = new Node<T>(value); }
 
    // This method mainly calls insertRec()
    void insert(T key) { root = insertRec(root, key); }
 
    /* A recursive function to
       insert a new key in BST */
    Node<T> insertRec(Node<T> root, T key)
    {
 
        /* If the tree is empty,
           return a new node */
        if (root == null) {
            root = new Node<T>(key);
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
}
