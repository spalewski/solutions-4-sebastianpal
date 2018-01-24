package pl.coderstrust.Tree;

import java.util.Scanner;

public class Tree {

static class Node {
    Node left, right;
    int data;

    public Node() {
        left = null;
        right = null;
        data = 0;
    }

    public Node(int n) {
        left = null;
        right = null;
        data = n;
    }

    public void setLeft(Node n) {
        left = n;
    }

    public void setRight(Node n) {
        right = n;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void set(int d) {
        data = d;
    }

    public int getData() {
        return data;
    }
}

public static class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = null;
    }


    public void insert(int data) {
        root = insert(root, data);
    }

    /* Function to insert data recursively */
    private Node insert(Node node, int data) {
        if (node == null)
            node = new Node(data);
        else {
            if (node.getRight() == null)
                node.right = insert(node.right, data);
            else
                node.left = insert(node.left, data);
        }
        return node;
    }

    public boolean find(int val) {
        return find(root, val);
    }

    private boolean find(Node r, int val) {
        if (r.getData() == val)
            return true;
        if (r.getLeft() != null)
            if (find(r.getLeft(), val))
                return true;
        if (r.getRight() != null)
            if (find(r.getRight(), val))
                return true;
        return false;
    }

    /* Function for inorder traversal */
    public void inorder() {
        inorder(root);
    }

    private void inorder(Node r) {
        if (r != null) {
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

    /* Function for preorder traversal */
    public void preorder() {
        preorder(root);
    }

    private void preorder(Node r) {
        if (r != null) {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    /* Function for postorder traversal */
    public void postorder() {
        postorder(root);
    }

    private void postorder(Node r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();


            System.out.print("\nPost order : ");
            binaryTree.postorder();
            System.out.print("\nPre order : ");
            binaryTree.preorder();
            System.out.print("\nIn order : ");
            binaryTree.inorder();
    }
}