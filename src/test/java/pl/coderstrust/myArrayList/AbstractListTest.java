package pl.coderstrust.myArrayList;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractListTest {
    public abstract List getList();

List testList = getList();

    @Test
    public void shouldCheckArraySize() {
        Assert.assertEquals(0, testList.size());
        testList.add((long)1);
        Assert.assertEquals(1, testList.size());
    }

    @Test
    public void ShouldCheckIsArrayEmpty() {
        Assert.assertEquals(true, testList.isEmpty());
        testList.add((long)2);
        Assert.assertEquals(false, testList.isEmpty());
    }

    @Test
    public void contains() {
        Assert.assertEquals(false, testList.contains(1));
        testList.add(3);
        Assert.assertEquals(true, testList.contains(3));
    }

    @Test
    public void iterator() {
        Assert.assertEquals(false,testList.iterator().hasNext());
        testList.add(2);
        testList.add(2);
        Assert.assertEquals(true,testList.iterator().hasNext());
        testList.iterator().next();
        Assert.assertEquals(2,testList.iterator().next());
        testList.add(3);
        testList.add(4);

        Iterator itr = testList.iterator();

        while (itr.hasNext())
        {
            int x = (Integer)itr.next();
            if (x <= 2)
                itr.remove();
        }

        Assert.assertEquals(2, testList.size());

    }

    @Test
    public void toArray() {
    }

    @Test
    public void toArray1() {
    }

    @Test
    public void add() {
        testList.add(5);
        testList.add(10);
        testList.add(-15);
        testList.add(20);
        Assert.assertEquals(4,testList.size());
    }

    @Test
    public void remove() {
        testList.add(10);
        Assert.assertEquals(1,testList.size());
        testList.remove(0);
        Assert.assertEquals(0,testList.size());
    }

    @Test
    public void shouldCheckContainsAll() {
        ArrayList data = new ArrayList();
        data.add("bla");
        data.add("blabla");
        Assert.assertEquals(false, testList.containsAll(data));
        testList.add("bla");
        Assert.assertEquals(false, testList.containsAll(data));
        testList.add("blabla");
        Assert.assertEquals(true, testList.containsAll(data));
    }

    @Test
    public void shouldCheckAddAll() {
        ArrayList data = new ArrayList();
        data.add("bla");
        data.add("blabla");
        Assert.assertEquals(0,testList.size());
        testList.addAll(data);
        Assert.assertEquals(2,testList.size());
    }

    @Test
    public void addAll1() {
    }

    @Test
    public void removeAll() {
    }

    @Test
    public void retainAll() {
    }

    @Test
    public void clear() {
    }

    @Test
    public void get() {
    }

    @Test
    public void set() {
    }

    @Test
    public void add1() {
    }

    @Test
    public void remove1() {
    }

    @Test
    public void indexOf() {
    }

    @Test
    public void lastIndexOf() {
    }

    @Test
    public void listIterator() {
    }

    @Test
    public void listIterator1() {
    }

    @Test
    public void subList() {
    }

    @Test
    public void reSizeArray() {
    }
}