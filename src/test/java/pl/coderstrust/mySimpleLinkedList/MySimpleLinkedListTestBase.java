package pl.coderstrust.mySimpleLinkedList;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

abstract class  MySimpleLinkedListTestBase {
    public abstract List getList();

    List testList = getList();

    @Test
    public void add() {

        for (int i = 0; i <10000 ; i++) {
            testList.add(i*i);
        }
        testList.add(5);
        testList.add(6);
        testList.add(8);

        Assert.assertEquals(10003, testList.size());
        Assert.assertEquals(true, testList.contains(6));

    }

    @Test
    public void remove() {
    }

    @Test
    public void contains() {
    }
}