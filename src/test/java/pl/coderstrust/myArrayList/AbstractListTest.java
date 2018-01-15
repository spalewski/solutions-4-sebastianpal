package pl.coderstrust.myArrayList;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractListTest {
    public abstract List getList();

    private List testList = getList();

    @Test
    public void shouldCheckArraySizeMethod() {
        Assert.assertEquals(0, testList.size());
        testList.add((long) 1);
        Assert.assertEquals(1, testList.size());
    }

    @Test
    public void ShouldCheckIsArrayEmptyMethod() {
        Assert.assertEquals(true, testList.isEmpty());
        testList.add((long) 2);
        Assert.assertEquals(false, testList.isEmpty());
    }

    @Test
    public void ShouldCheckcontainsMethod() {
        Assert.assertEquals(false, testList.contains(1));
        testList.add(3);
        Assert.assertEquals(true, testList.contains(3));
    }

    @Test
    public void ShouldCheckiteratorMethods() {
        Assert.assertEquals(false, testList.iterator().hasNext());
        testList.add(2);
        testList.add(2);
        Assert.assertEquals(true, testList.iterator().hasNext());
        testList.iterator().next();
        Assert.assertEquals(2, testList.iterator().next());
        testList.add(3);
        testList.add(4);

        Iterator itr = testList.iterator();

        while (itr.hasNext()) {
            int x = (Integer) itr.next();
            if (x <= 2)
                itr.remove();
        }
        Assert.assertEquals(2, testList.size());
    }

    @Test
    public void shouldChecktoArrayMethod() {
        testList.add(1);
        testList.add(2);
        testList.add(3);

        Object[] taken = new Object[ testList.size() ];
        Assert.assertEquals(null, taken[ 1 ]);
        taken = testList.toArray(taken);
        Assert.assertEquals(2, taken[ 1 ]);
    }

    @Test
    public void toArray1() {
        testList.add(1);
        testList.add(2);
        testList.add(3);

        Object[] taken = new Object[ testList.size() ];
        Assert.assertEquals(null, taken[ 1 ]);
        taken = testList.toArray(taken);
        Assert.assertEquals(2, taken[ 1 ]);
    }

    @Test
    public void add() {
        testList.add(5);
        testList.add(10);
        testList.add(-15);
        testList.add(20);
        Assert.assertEquals(4, testList.size());
    }

    @Test
    public void shouldCheckIsRemoveElement() {
        testList.add(10);
        Assert.assertEquals(1, testList.size());
        testList.remove(0);
        Assert.assertEquals(0, testList.size());
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
        Assert.assertEquals(0, testList.size());
        testList.addAll(data);
        Assert.assertEquals(2, testList.size());
    }

    @Test
    public void ShouldCheckAddAllForGenericTypr() {
        ArrayList data = new ArrayList();
        class TestClass<T> {
            private T testText;

            public TestClass(T testText) {
                this.testText = testText;
            }
        }
        TestClass testClass = new TestClass<>("blabla");
        testList.add(testClass);
        testList.add(testClass);
        Assert.assertEquals(2, testList.size());
        testList.addAll(data);
        Assert.assertEquals(2, testList.size());
    }


    @Test
    public void shouldCheckIsRemovingAll() {
        testList.add(5);
        testList.add(10);
        testList.add(-15);
        testList.add(20);
        Assert.assertEquals(4, testList.size());
        testList.removeAll(testList);
        Assert.assertEquals(0, testList.size());
    }

    @Test
    public void retainAll() {
        testList.add(0);
        testList.add(1);
        testList.add(3);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        Assert.assertEquals(6, testList.size());
        ArrayList toRetain = new ArrayList();
        toRetain.add(0);
        toRetain.add(1);
        toRetain.add(2);
        toRetain.add(3);
        testList.retainAll(toRetain);
        Assert.assertEquals(5, testList.size());
    }

    @Test
    public void shouldCheckIsMakingListClear() {
        testList.add(5);
        testList.add(10);
        testList.add(-15);
        testList.add(20);
        Assert.assertEquals(4, testList.size());
        testList.clear();
        Assert.assertEquals(0, testList.size());
    }

    @Test
    public void shouldCheckGettingElementViaIndex() {
        testList.add(5);
        testList.add(10);
        testList.add(-15);
        testList.add(20);
        Assert.assertEquals(10, testList.get(1));
        Assert.assertEquals(-15, testList.get(2));
        Assert.assertEquals(20, testList.get(3));
    }

    @Test
    public void set() {

        testList.add(5);
        testList.add(10);
        testList.add(-15);
        testList.add(20);
        Assert.assertEquals(-15, testList.get(2));
        testList.set(2, 100);
        Assert.assertEquals(100, testList.get(2));
    }

    @Test
    public void ShoildCheckAddMethodForGenericType() {
        class TestClass<T> {
            private T testText;

            public TestClass(T testText) {
                this.testText = testText;
            }
        }
        TestClass testClass = new TestClass<>("blabla");
        testList.add(testClass);
        testList.add(testClass);
        Assert.assertEquals(2, testList.size());

    }

    @Test
    public void ShouldCheckRemoveMethodForGenericType() {

        class TestClass<T> {
            private T testText;

            public TestClass(T testText) {
                this.testText = testText;
            }
        }
        TestClass testClass = new TestClass<>("blabla");
        testList.add(testClass);
        testList.add(testClass);
        Assert.assertEquals(2, testList.size());
        testList.remove(0);
        Assert.assertEquals(1, testList.size());

    }

    @Test
    public void shouldCheckIsReturningindexOf() {

        testList.add(0);
        testList.add(1);
        testList.add(3);
        Assert.assertEquals(1, testList.indexOf(1));
    }

    @Test
    public void shouldCheckIsReturninglastIndexOf() {
        testList.add(0);
        testList.add(1);
        testList.add(3);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        Assert.assertEquals(4, testList.lastIndexOf(3));
    }


    @Test
    public void shouldCheckIsExcractingsubList() {
        testList.add(0);
        testList.add(1);
        testList.add(3);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        ArrayList sublist = new ArrayList(testList.subList(4, 5));
        Assert.assertEquals(1, sublist.size());
        Assert.assertEquals(3, sublist.get(0));
    }
}