package pl.coderstrust.myArrayList;

import java.util.*;

public class MyArrayList<T> implements List<T>, Iterable<T> {

    private T[] data;
    private int actSize = 0;
    private int fixSize = 10;


    public MyArrayList() {
        data = (T[]) new Object[this.fixSize];
    }

    @Override
    public int size() {
        return actSize;
    }

    @Override
    public boolean isEmpty() {
        return actSize == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public Iterator<T> iterator() {
        Object[] currentData = new Object[actSize];
        for (int i = 0; i <actSize ; i++) {
            currentData[i]=data[i];
        }

        return new Iterator<T>() {

            private int pos = 0;
            int last = -1;


            @Override
            public boolean hasNext() {
                return pos < currentData.length;
            }

            @Override
            public T next() {
                int i = pos;
                i=i+1;
                return (T) currentData[pos=i];

            }

            @Override
            public void remove() {
                if (last < 0)
                    throw new IllegalStateException();

                MyArrayList.this.remove(pos);
                pos = last;
                last=-1;

            }
        };
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(data, actSize);
    }


    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < actSize)
            return (T[]) Arrays.copyOf(data, actSize, a.getClass());
        System.arraycopy(data, 0, a, 0, actSize);
        if (a.length > actSize)
            a[actSize] = null;
        return a;
    }


    @Override
    public boolean add(T element) {

        if (actSize >= data.length) {

            T[] extended = (T[]) new Object[data.length * 2];

            System.arraycopy(data, 0, extended, 0, data.length);

            data = extended;
        }
        data[actSize] = element;
        actSize++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (actSize <= data.length/2) {

            T[] extended = (T[]) new Object[data.length / 2];

            System.arraycopy(data, 0, extended, 0, data.length);

            data = extended;
        }


        if (o == null) {
            for (int index = 0; index < actSize; index++)
                if (data[index] == null) {
                    fastRemove(index);
                    return true;
                }
        } else {
            for (int index = 0; index < actSize; index++)
                if (o.equals(data[index])) {
                    fastRemove(index);
                    return true;
                }
        }
        return false;
    }

    private void fastRemove(int index) {
        int numMoved = actSize - index - 1;
        if (numMoved > 0)
            System.arraycopy(data, index + 1, data, index,
                    numMoved);
        data[--actSize] = null;
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
        boolean flag = true;
        for (Object obj : c) {
            flag &= remove(obj);
        }
        return flag;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        actSize = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= actSize) {
            throw new RuntimeException("index out of bounds");
        }
        return data[index];
    }


    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= actSize) {
            throw new RuntimeException("index out of bounds");
        }
        T toSet = get(index);
        data[index] = element;
        return toSet;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > actSize) {
            throw new IndexOutOfBoundsException();
        }
        add(element);
        for (int i = actSize - 1; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
    }


    @Override
    public T remove(int index) {
        T element = get(index);
        for (int i = index; i < actSize - 1; i++) {
            data[i] = data[i + 1];
        }
        actSize--;
        return element;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < actSize; i++)
                if (data[i] == null)
                    return i;
        } else {
            for (int i = 0; i < actSize; i++)
                if (o.equals(data[i]))
                    return i;
        }
        return -1;
    }

    private boolean equals(Object target, Object element) {
        if (target == null) {
            return element == null;
        } else {
            return target.equals(element);
        }
    }

    @Override
    public int lastIndexOf(Object o) {
        return data.length - 1;
    }

    @Override
    public ListIterator<T> listIterator() {
        T[] copy = Arrays.copyOf(data, actSize);
        return Arrays.asList(copy).listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        T[] copy = Arrays.copyOf(data, actSize);
        return Arrays.asList(copy).listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex >= actSize || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        T[] copy = Arrays.copyOfRange(data, fromIndex, toIndex);
        return Arrays.asList(copy);
    }


    public void reSizeArray() {
        data = Arrays.copyOf(data, data.length * 2);
    }
}