package pl.coderstrust.Tree;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.fail;

public class TreeTest {

    @Test
    public void shouldCheckPostOrder() {
        Tree.BinaryTree binaryTree = new Tree.BinaryTree();

        binaryTree.insert(5);
        binaryTree.insert(6);
        binaryTree.insert(22);
        binaryTree.insert(4);

        int expected[] = {4, 22, 6, 5};
        int[] result = binaryTree.postorder();

        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void shouldCheckPreOrder() {
        Tree.BinaryTree binaryTree = new Tree.BinaryTree();

        binaryTree.insert(5);
        binaryTree.insert(6);
        binaryTree.insert(22);
        binaryTree.insert(4);

        int expected[] = {5, 22, 4, 6};
        int[] result = binaryTree.preorder();

        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void shouldCheckInOrder() {
        Tree.BinaryTree binaryTree = new Tree.BinaryTree();

        binaryTree.insert(5);
        binaryTree.insert(6);
        binaryTree.insert(22);
        binaryTree.insert(4);

        int expected[] = {22, 4, 5, 6};
        int[] result = binaryTree.inorder();

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void shouldCheckFind() {
        Tree.BinaryTree binaryTree = new Tree.BinaryTree();

        binaryTree.insert(5);
        binaryTree.insert(6);
        binaryTree.insert(22);
        binaryTree.insert(4);

        boolean result1 = binaryTree.find(5);
        boolean result2 = binaryTree.find(0);
        boolean result3 = binaryTree.find(22);

        Assert.assertEquals(true, result1);
        Assert.assertEquals(false, result2);
        Assert.assertEquals(true, result3);
    }

    @Test
    public void shouldFailFindingInEmptyTree() {

        Tree.BinaryTree binaryTree = new Tree.BinaryTree();
        try {
            boolean result1 = binaryTree.find(5);
            boolean result2 = binaryTree.find(0);
            boolean result3 = binaryTree.find(22);
            fail("java.lang.NullPointerException");
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    @Test
    public void shouldCheckRemove() {
        Tree.BinaryTree binaryTree = new Tree.BinaryTree();

        binaryTree.insert(5);
        binaryTree.insert(6);
        binaryTree.insert(22);
        binaryTree.insert(4);

        boolean result1 = binaryTree.find(5);
        boolean result2 = binaryTree.find(0);
        boolean result3 = binaryTree.find(22);

        Assert.assertEquals(true, result1);
        Assert.assertEquals(false, result2);
        Assert.assertEquals(true, result3);
        binaryTree.remove(5);
        Assert.assertEquals(false, binaryTree.find(5));
        Assert.assertEquals(3, binaryTree.countNodes());
    }
}