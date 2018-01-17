package pl.coderstrust.mySimpleLinkedList;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

abstract class MySimpleLinkedListTestBase {
    public abstract List getList();

    List testList = getList();

    @Test
    public void shouldCheckIsAddAdding() {

        for (int i = 0; i < 10000; i++) {
            testList.add(i * i);
        }
        testList.add(5);
        testList.add(6);
        testList.add(8);

        Assert.assertEquals(10003, testList.size());
        Assert.assertEquals(true, testList.contains(6));
        Assert.assertEquals(1, testList.get(1));
        Assert.assertEquals(20647936, testList.get(4544));

    }

    @Test
    public void shouldCheckIsRemoveRemoving() {

        for (int i = 0; i < 10000; i++) {
            testList.add(i * i);
        }
        testList.add(5);
        testList.add(6);
        testList.add(8);

        Assert.assertEquals(10003, testList.size());
        Assert.assertEquals(true, testList.contains(6));
        Assert.assertEquals(4, testList.get(2));
        testList.remove(0);
        Assert.assertEquals(9, testList.get(2));


    }

    @Test
    public void shouldCheckIsContainsReturnsValidCheck() {
        for (int i = 0; i < 10000; i++) {
            testList.add(i * i);
        }
        testList.add(5);
        testList.add(6);
        testList.add(8);

        Assert.assertEquals(false, testList.contains(343));
        Assert.assertEquals(true, testList.contains(6));
        Assert.assertEquals(false, testList.contains(34345));
        Assert.assertEquals(true, testList.contains(20647936));
    }

    @Test
    public void ShouldCheckiteratorMethods() {
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        Assert.assertEquals(1, testList.iterator().next());
        Assert.assertEquals(true, testList.iterator().hasNext());

    }
}