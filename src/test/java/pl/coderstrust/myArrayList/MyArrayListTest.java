package pl.coderstrust.myArrayList;

import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest extends MyArrayListTestBase {

    @Override
    public MyArrayList getArrayMethod() {
        return new MyArrayList();
    }

    MyArrayList myTestList = new MyArrayList();


    @Test
    public void shouldCheckArraySize() {
        myTestList.size();
        Assert.assertEquals(0, myTestList.size());
        myTestList.add(2);
        Assert.assertEquals(1, myTestList.size());
    }

    @Test
    public void ShouldCheckIsArrayEmpty() {
        Assert.assertEquals(true, myTestList.isEmpty());
        myTestList.add(55);
        Assert.assertEquals(false, myTestList.isEmpty());
    }

    @Test
    public void contains() {
        Assert.assertEquals(false, myTestList.contains(1));
        myTestList.add(55);
        Assert.assertEquals(true, myTestList.contains(55));
    }

    @Test
    public void iterator() {
    }

    @Test
    public void toArray() {
    }

    @Test
    public void toArray1() {
    }

    @Test
    public void add() {
    }

    @Test
    public void remove() {
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



