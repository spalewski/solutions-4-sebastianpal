package pl.coderstrust.myArrayList;

import java.util.*;

public class MyArrayList implements List<Long> {

    private Long[] data;
    private int actSize = 0;
    private int fixSize = 10;


    public MyArrayList() {
        data = new Long[this.fixSize];
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
    return false;
    }

    @Override
    public Iterator<Long> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Long aLong) {
        actSize++;

        if (actSize>=data.length) {

            Long[] extended =  new Long[data.length * 2];

            System.arraycopy(data, 0, extended, 0, data.length);

            data = extended;
        }
        data[actSize] = aLong;
        return true;
    }

    @Override
    public boolean remove(Object o) {
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
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Long> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Long> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Long get(int index) {
        if (index < 0 || index >= actSize) {
            throw new RuntimeException("index out of bounds");
        }
        return data[index];
    }


    @Override
    public Long set(int index, Long element) {
        if (index < 0 || index >= actSize) {
            throw new RuntimeException("index out of bounds");
        }
        data[index]=element;
        return null;

    }

    @Override
    public void add(int index, Long element) {
        if (data.length - actSize <= data.length / 2) {
            this.reSizeArray();
        }
        data[index] = element;
        actSize++;
    }

    @Override
    public Long remove(int index) {
     return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return data.length-1;
    }

    @Override
    public ListIterator<Long> listIterator() {
        return listIterator();
    }

    @Override
    public ListIterator<Long> listIterator(int index) {
        return listIterator(0);
    }

    @Override
    public List<Long> subList(int fromIndex, int toIndex) {
        return null;
    }

    public void reSizeArray() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    ArrayList <String> list = new ArrayList<>();

}