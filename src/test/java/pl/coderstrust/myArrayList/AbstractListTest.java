package pl.coderstrust.myArrayList;

import org.junit.Assert;
import org.junit.Test;
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
        testList.add("blabla");
        testList.add("blabla");
        Assert.assertEquals(true,testList.iterator().hasNext());
        testList.iterator().next();
        Assert.assertEquals("blabla",testList.iterator().next());
        testList.iterator().remove();
        testList.iterator().remove();
        Assert.assertEquals(1,testList.size());

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
    public void containsAll() {
    }

    @Test
    public void addAll() {
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