package pl.coderstrust.Tree;

public class Tree {

    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int n) {
            left = null;
            right = null;
            data = n;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public int getData() {
            return data;
        }
    }

    public static class BinaryTree {
        private Node root;
        private int[] array;
        private int index = 0;

        public BinaryTree() {
            root = null;
        }

        public boolean isEmpty() {
            return root == null;
        }

        public void insert(int element) {
            Node newNode = new Node(element);
            if (root == null) {
                root = newNode;
                return;
            }
            Node current = root;
            Node parent = null;
            while (true) {
                parent = current;
                if (element < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
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

        public boolean remove(int element) {
            Node parent = root;
            Node current = root;
            boolean isLeftChild = false;
            while (current.data != element) {
                parent = current;
                if (current.data > element) {
                    isLeftChild = true;
                    current = current.left;
                } else {
                    isLeftChild = false;
                    current = current.right;
                }
                if (current == null) {
                    return false;
                }
            }
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                }
                if (isLeftChild == true) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            } else if (current.left != null && current.right != null) {

                Node successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
                successor.left = current.left;
            }
            return true;
        }

        private Node getSuccessor(Node removeNode) {
            Node successsor = null;
            Node successsorParent = null;
            Node current = removeNode.right;
            while (current != null) {
                successsorParent = successsor;
                successsor = current;
                current = current.left;
            }
            if (successsor != removeNode.right) {
                successsorParent.left = successsor.right;
                successsor.right = removeNode.right;
            }
            return successsor;
        }

        public int[] inorder() {
            array = new int[countNodes()];
            inorder(root);
            index = 0;

            return array;

        }

        private void inorder(Node r) {
            if (r != null) {
                inorder(r.getLeft());
                array[index++] = r.getData();
                inorder(r.getRight());
            }
        }

        public int[] preorder() {
            array = new int[countNodes()];
            preorder(root);
            return array;
        }

        private void preorder(Node r) {
            if (r != null) {
                array[index++] = r.getData();
                preorder(r.getLeft());
                preorder(r.getRight());
            }
        }

        public int[] postorder() {
            array = new int[countNodes()];
            postorder(root);
            return array;
        }

        private void postorder(Node r) {
            if (r != null) {
                postorder(r.getLeft());
                postorder(r.getRight());
                array[index++] = r.getData();

            }
        }
    }
}