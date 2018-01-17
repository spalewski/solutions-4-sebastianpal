package pl.coderstrust.mySimpleLinkedList;

import java.util.*;

public class MySimpleLinkedList<T> implements List<T>, Iterable<T> {

    int size = 0;
    Node<T> first;
    Node<T> last;

    public MySimpleLinkedList() {
    }

    public MySimpleLinkedList(Collection<T> c) {
        this();
        addAll(c);
    }

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    void linkLast(T e) {
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }


    T unlink(Node<T> x) {
        final T element = x.item;
        final Node<T> next = x.next;
        final Node<T> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }
        x.item = null;
        size--;
        return element;
    }


    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    public int size() {
        return size;
    }

    public boolean add(T e) {
        linkLast(e);
        return true;
    }

    public boolean remove(Object o) {
        if (o == null) {
            for (Node<T> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<T> x = first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }


    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }


    public void clear() {
        for (Node<T> x = first; x != null; ) {
            Node<T> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    public T get(int index) {
        return node(index).item;
    }

    public T set(int index, T element) {
        return null;
    }

    public void add(int index, T element) {
    }

    public T remove(int index) {
        return unlink(node(index));
    }


    Node<T> node(int index) {
        if (index < (size >> 1)) {
            Node<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<T> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<T> x = first; x != null; x = x.next) {
                if (x.item == null)
                    return index;
                index++;
            }
        } else {
            for (Node<T> x = first; x != null; x = x.next) {
                if (o.equals(x.item))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        return -1;
    }


    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    public Object[] toArray() {
        return null;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
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
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T item = (T) current.item;
                current = current.next;
                return item;
            }
            return null;
        }
    }
}