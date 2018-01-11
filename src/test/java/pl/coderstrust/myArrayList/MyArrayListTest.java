package pl.coderstrust.myArrayList;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class MyArrayListTest extends MyArrayListTestBase {

    MyArrayList myList = new MyArrayList();

    @Test
    public void shouldCheckArraySize() {
        myList.size();
        Assert.assertEquals(0, myList.size());
        myList.add((long) 2);
        Assert.assertEquals(1, myList.size());
    }

    @Test
    public void ShouldCheckIsArrayEmpty() {
    Assert.assertEquals(true,myList.isEmpty());
    myList.add((long) 55);
    Assert.assertEquals(false,myList.isEmpty());
    }

    @Test
    public void contains() {
    myList.add((long) 5);
    Assert.assertEquals(false,myList.contains(0));
    Assert.assertEquals(true,myList.contains(5));


    }

    @Test
    public void iterator() {
    }

    @Test
    public void toArray() {
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
    public void indexOf() {
    }

    @Test
    public void lastIndexOf() {
    }

    @Test
    public void listIterator() {
    }


    @Test
    public void subList() {
    }

    @Override
    public ArrayMethod getArrayMethod() {
        return null;
    }
}