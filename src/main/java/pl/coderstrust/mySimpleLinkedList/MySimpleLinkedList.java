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

    private void linkFirst(T e) {
        final Node<T> f = first;
        final Node<T> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;

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

    void linkBefore(T e, Node<T> succ) {
        final Node<T> pred = succ.prev;
        final Node<T> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
    }

    private T unlinkFirst(Node<T> f) {
        final T element = f.item;
        final Node<T> next = f.next;
        f.item = null;
        f.next = null; // help GC
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        return element;
    }

    private T unlinkLast(Node<T> l) {
        final T element = l.item;
        final Node<T> prev = l.prev;
        l.item = null;
        l.prev = null; // help GC
        last = prev;
        if (prev == null)
            first = null;
        else
            prev.next = null;
        size--;

        return element;
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

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
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

    public int lastIndexOf(java.lang.Object o) {
        int index = size;
        if (o == null) {
            for (Node<T> x = last; x != null; x = x.prev) {
                index--;
                if (x.item == null)
                    return index;
            }
        } else {
            for (Node<T> x = last; x != null; x = x.prev) {
                index--;
                if (o.equals(x.item))
                    return index;
            }
        }
        return -1;
    }



    public T peek() {
        final Node<T> f = first;
        return (f == null) ? null : f.item;
    }

    public T element() {
        return getFirst();
    }

    public T poll() {
        final Node<T> f = first;
        return (f == null) ? null : unlinkFirst(f);
    }

    public T remove() {
        return removeFirst();
    }

    public boolean offer(T e) {
        return add(e);
    }

    public boolean offerFirst(T e) {
        addFirst(e);
        return true;
    }

    public boolean offerLast(T e) {
        addLast(e);
        return true;
    }

    public T peekFirst() {
        final Node<T> f = first;
        return (f == null) ? null : f.item;
    }

    public T peekLast() {
        final Node<T> l = last;
        return (l == null) ? null : l.item;
    }

    public T pollFirst() {
        final Node<T> f = first;
        return (f == null) ? null : unlinkFirst(f);
    }

    public T pollLast() {
        final Node<T> l = last;
        return (l == null) ? null : unlinkLast(l);
    }

    public void push(T e) {
        addFirst(e);
    }

    public T pop() {
        return removeFirst();
    }

    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    public boolean removeLastOccurrence(Object o) {
        return false;
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
    public boolean isEmpty() {return false;}
    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }
        private class LinkedListIterator implements Iterator<T>{

            Node current = first;
            @Override
            public boolean hasNext() {
                return current != null;
            }
            @Override
            public T next() {
                if(hasNext()){
                    T item = (T) current.item;
                    current = current.next;
                    return item;
                }
                return null;
            }
        }

        public T getFirst() {
        Node<T> f = first;
        return f.item;
    }
    public T removeFirst() {return null;}
    public void addFirst(T e) {}
    public void addLast(T e) {}
}