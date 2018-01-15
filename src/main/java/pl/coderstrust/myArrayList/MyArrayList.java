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

        Itr() {
        }

        @Override
        public boolean hasNext() {
            return position != size();
        }

        @Override
        public T next() {
            int i = position;
            if (i >= actualSize) {
                throw new NoSuchElementException("No more elements is Array, last index is " + actualSize);
            }
            Object[] currentData = new Object[ actualSize ];
            for (int j = 0; j < actualSize; j++) {
                currentData[ j ] = data[ j ];
            }
            ++position;
            return (T) currentData[ lastReturned = i ];
        }

        @Override
        public void remove() {
            if (lastReturned < 0) ;

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
    public <T> T[] toArray(T[] element) {
        if (element.length < actualSize) {
            return (T[]) Arrays.copyOf(data, actualSize, element.getClass());
        }
        System.arraycopy(data, 0, element, 0, actualSize);
        if (element.length > actualSize) {
            for (int i = actualSize; i < data.length; i++) {
                element[ i ] = null;
            }
        }
        return element;
    }

    @Override
    public boolean add(T element) {

        data[ actualSize++ ] = element;
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
    public boolean addAll(int index, Collection<? extends T> elements) {
        Object[] a = elements.toArray();

        int numNew = a.length;
        if (numNew == 0)
            return false;
        Object[] elementData;
        final int s;
        if (numNew > (elementData = this.data).length - (s = actualSize)) {
            elementData = new Object[ s + numNew ];
            System.arraycopy(a, 0, elementData, s, numNew);
            actualSize = s + numNew;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> elements) {
        boolean modified = false;
        Iterator<?> iterator = iterator();
        while (iterator.hasNext()) {
            if (elements.contains(iterator.next())) {
                iterator.remove();
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> elements) {
        boolean changed = false;
        for (int i = size() - 1; i >= 0; i--) {
            Object obj = get(i);
            if (!elements.contains(obj)) {
                remove(i);
                changed = true;
            }
        }
        return changed;
    }


    @Override
    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[ i ] = null;
        }
        actualSize = 0;
        T[] cleared = (T[]) new Object[ initialSize ];
        System.arraycopy(data, 0, cleared, 0, initialSize);
        data = cleared;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= actualSize) {
        }
        return data[ index ];
    }


    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= actualSize) {
            throw new RuntimeException("index out of bounds");
        }
        T previousValue = get(index);
        data[ index ] = element;
        return previousValue;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > actualSize) {
            throw new IndexOutOfBoundsException();
        }
        if (actualSize == data.length) {
            T[] extended = (T[]) new Object[ data.length * 2 ];
            System.arraycopy(data, 0, extended, 0, data.length);
            data = extended;
        }
        data[ index ] = element;
        ++actualSize;

    }


    @Override
    public T remove(int index) {
        T element = get(index);
        for (int i = index; i < actualSize - 1; i++) {
            data[ i ] = data[ i + 1 ];
        }
        actualSize--;
        data[ data.length - 1 ] = null;
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
        return new ListItr(0);
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return new ListItr(index);
    }

    private class ListItr extends Itr implements ListIterator<T> {

        ListItr(int index) {
            super();
            position = index;

        }

        @Override
        public boolean hasPrevious() {
            return position != 0;
        }

        @Override
        public T previous() {
            int i = position - 1;
            if (i < 0) {
                throw new NoSuchElementException("No more previous elements");
            }
            Object[] elementData = MyArrayList.this.data;
            position = i;
            return (T) elementData[ lastReturned = i ];
        }

        @Override
        public int nextIndex() {
            return position;
        }

        @Override
        public int previousIndex() {
            return position - 1;
        }

        @Override
        public void set(T element) {
            MyArrayList.this.set(lastReturned, element);
        }

        @Override
        public void add(T element) {
            int i = position;
            MyArrayList.this.add(i, element);
            position = i + 1;
            lastReturned = -1;
        }
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