package pl.coderstrust.myArrayList;

import java.util.*;

public class MyArrayList<T> implements List<T>, Iterable<T> {

    private T[] data;
    private int actualSize = 0;
    private int initialSize = 10;


    public MyArrayList() {
        data = (T[]) new Object[ this.initialSize ];
    }

    @Override
    public int size() {
        return actualSize;
    }

    @Override
    public boolean isEmpty() {
        return actualSize == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    private class Itr implements Iterator<T> {

            int position;
            int lastReturned = -1;

            Itr() {}

        @Override
        public boolean hasNext() {
                return position != size();
        }
        @Override
        public T next() {
            if (position >= actualSize){
                throw new NoSuchElementException("No more elements is Array, last index is " + actualSize);}
            Object[] currentData = new Object[ actualSize ];
            for (int j = 0; j < actualSize; j++) {
                currentData[ j ] = data[ j ];
            }
            ++position;
            return (T) currentData[ lastReturned = position ];
        }
        @Override
        public void remove() {
            if (lastReturned < 0)
                throw new IllegalStateException();

            MyArrayList.this.remove(lastReturned);
            position = lastReturned;
            lastReturned = -1;

        }
    }


    @Override
    public Iterator<T> iterator() {
        
        return new Itr();

    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(data, actualSize);
    }


    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < actualSize)
            return (T[]) Arrays.copyOf(data, actualSize, a.getClass());
        System.arraycopy(data, 0, a, 0, actualSize);
        if (a.length > actualSize){
            a[ actualSize ] = null;}
        return a;
    }


    @Override
    public boolean add(T element) {

        data[ actualSize++] = element;
        //actualSize++;
        if (actualSize == data.length) {

            T[] extended = (T[]) new Object[ data.length * 2 ];

            System.arraycopy(data, 0, extended, 0, data.length);

            data = extended;
        }

        return true;
    }

    @Override
    public boolean remove(Object o) {

        if (o == null) {
            for (int index = 0; index < actualSize; index++)
                if (data[ index ] == null) {
                    fastRemove(index);
                    return true;

                }
        } else {
            for (int index = 0; index < actualSize; index++)
                if (o.equals(data[ index ])) {
                    fastRemove(index);
                    return true;
                }
        }
        if (actualSize <= data.length / 4) {

            T[] shortened = (T[]) new Object[ data.length / 2 ];

            System.arraycopy(data, 0, shortened, 0, data.length);

            data = shortened;
        }

        return false;
    }

    private void fastRemove(int index) {
        int numMoved = actualSize - index - 1;
        if (numMoved > 0)
            System.arraycopy(data, index + 1, data, index,
                    numMoved);
        data[ --actualSize ] = null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object element : c) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean flag = true;
        for (T element : c) {
            flag &= add(element);
        }
        return flag;
    }


    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        Iterator<?> e = iterator();
        while (e.hasNext()) {
            if (c.contains(e.next())) {
                e.remove();
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean changed = false;
        for (int i = size() - 1; i >= 0; i--) {
            Object obj = get(i);
            if (!c.contains(obj)) {
                remove(i);
                changed = true;
            }
        }
        return changed;
    }


    @Override
    public void clear() {
        actualSize = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= actualSize) {
            throw new RuntimeException("index out of bounds");
        }
        return data[ index ];
    }


    @Override
    public T set(int previousValue, T element) {
        if (previousValue < 0 || previousValue >= actualSize) {
            throw new RuntimeException("index out of bounds");
        }
        T toSet = get(previousValue);
        data[ previousValue ] = element;
        return toSet;
    }

    @Override
    public void add(int previousValue, T element) {
        if (previousValue < 0 || previousValue > actualSize) {
            throw new IndexOutOfBoundsException();
        }
        add(element);
        for (int i = actualSize - 1; i > previousValue; i--) {
            data[ i ] = data[ i - 1 ];
        }
        data[ previousValue ] = element;
    }


    @Override
    public T remove(int index) {
        T element = get(index);
        for (int i = index; i < actualSize - 1; i++) {
            data[ i ] = data[ i + 1 ];
        }
        actualSize--;
        return element;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < actualSize; i++)
                if (data[ i ] == null)
                    return i;
        } else {
            for (int i = 0; i < actualSize; i++)
                if (o.equals(data[ i ]))
                    return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = actualSize - 1; i >= 0; i--)
                if (data[ i ] == null)
                    return i;
        } else {
            for (int i = actualSize - 1; i >= 0; i--)
                if (o.equals(data[ i ]))
                    return i;
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        T[] copy = Arrays.copyOf(data, actualSize);
        return Arrays.asList(copy).listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        T[] copy = Arrays.copyOf(data, actualSize);
        return Arrays.asList(copy).listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex >= actualSize || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        T[] copy = Arrays.copyOfRange(data, fromIndex, toIndex);
        return Arrays.asList(copy);
    }
}