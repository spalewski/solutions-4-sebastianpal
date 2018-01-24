package pl.coderstrust.Tree;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.fail;

public class TreeTest {

    @Test
    public void shouldCheckPostOrder() {
        Tree.BinaryTree binaryTree = new Tree.BinaryTree();

        binaryTree.insert(6);
        binaryTree.insert(4);
        binaryTree.insert(8);
        binaryTree.insert(3);
        binaryTree.insert(5);
        binaryTree.insert(7);
        binaryTree.insert(9);

        int expected[] = {3, 5, 4, 7, 9, 8, 6};
        int[] result = binaryTree.postorder();

        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void shouldCheckPreOrder() {
        Tree.BinaryTree binaryTree = new Tree.BinaryTree();

        binaryTree.insert(6);
        binaryTree.insert(4);
        binaryTree.insert(8);
        binaryTree.insert(3);
        binaryTree.insert(5);
        binaryTree.insert(7);
        binaryTree.insert(9);

        int expected[] = {6, 4, 3, 5, 8, 7, 9};
        int[] result = binaryTree.preorder();

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void shouldCheckInOrder() {
        Tree.BinaryTree binaryTree = new Tree.BinaryTree();

        binaryTree.insert(6);
        binaryTree.insert(4);
        binaryTree.insert(8);
        binaryTree.insert(3);
        binaryTree.insert(5);
        binaryTree.insert(7);
        binaryTree.insert(9);

        int expected[] = {3, 4, 5, 6, 7, 8, 9};
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