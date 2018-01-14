package pl.coderstrust.mySimpleLinkedList;

import org.junit.Test;

import java.util.List;

abstract class  MySimpleLinkedListTestBase {
    public abstract List getList();

    List testList = getList();


    @Test
    public void add() {
        testList.add(5);
        testList.add(6);
        testList.add(8);

        

    }

    @Test
    public void remove() {
    }

    @Test
    public void contains() {
    }
}