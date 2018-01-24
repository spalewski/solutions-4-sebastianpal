package pl.coderstrust.Tree;

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

        public boolean isEmpty() {
            return root == null;
        }

        public void insert(int data) {
            root = insert(root, data);
        }

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


        public int countNodes() {
            return countNodes(root);
        }

        private int countNodes(Node r) {
            if (r == null)
                return 0;
            else {
                int l = 1;
                l += countNodes(r.getLeft());
                l += countNodes(r.getRight());
                return l;
            }
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


        public void inorder() {
            inorder(root);
        }

        private void inorder(Node r) {
            int[] array = new int[countNodes()];
            if (r != null) {
                inorder(r.getLeft());
                System.out.print(r.getData() + " ");

                inorder(r.getRight());
            }
        }

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
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(5);
        binaryTree.insert(6);
        binaryTree.insert(22);
        binaryTree.insert(4);

        System.out.print("\nPost order : ");
        binaryTree.postorder();
        System.out.print("\nPre order : ");
        binaryTree.preorder();
        System.out.print("\nIn order : ");
        binaryTree.inorder();

    }
}