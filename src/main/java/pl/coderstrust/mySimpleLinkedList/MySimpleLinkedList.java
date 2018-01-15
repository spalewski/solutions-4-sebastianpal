package pl.coderstrust.mySimpleLinkedList;

import java.util.*;

public class MySimpleLinkedList implements List<Object> {
    private int size;
    Link head;
    Link last;

    public MySimpleLinkedList() {
        head = null;
        size = 0;
    }

    private class Link<T> {

        private T data;
        private Link<T> next;

        public Link(T data) {
            this.data = data;
            this.next = null;
        }

        public void setLink(T data) {
            this.data = data;
        }

        public T getLink() {
            return this.data;
        }

        public void setNext(Link next) {
            this.next = next;
        }

        public Link getNext() {
            return this.next;
        }
    }

    @Override
    public boolean add(java.lang.Object o) {
        Link<Object> node = new Link(o);
        if (this.head == null) {
            this.head = this.last = node;
        } else {
            this.last.setNext(node);
            this.last = node;
        }
        this.size++;
        return true;
    }


    @Override
    public boolean remove(java.lang.Object o) {
        if (this.head == null) {
            throw new NoSuchElementException();
        } else if (this.head.getLink().equals(o)) {
            this.head = this.head.getNext();
            this.size--;
        }
        return true;
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
    public void clear() {

    }

    @Override
    public java.lang.Object get(int index) {
        if (head == null) throw new IndexOutOfBoundsException();
        Link tmp = head;
        for (int k = 0; k < index; k++) tmp = tmp.next;
        if( tmp == null) throw new IndexOutOfBoundsException();
        return tmp.data;
    }

    @Override
    public java.lang.Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(java.lang.Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(java.lang.Object o) {
        return 0;
    }

    @Override
    public ListIterator<java.lang.Object> listIterator() {
        return null;
    }

    @Override
    public ListIterator<java.lang.Object> listIterator(int index) {
        return null;
    }

    @Override
    public List<java.lang.Object> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public void add(int index, java.lang.Object element) {

    }

    @Override
    public java.lang.Object set(int index, java.lang.Object element) {
        return null;
    }

    @Override
    public boolean addAll(int index, Collection<? extends java.lang.Object> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends java.lang.Object> c) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(java.lang.Object o) {
        Link<Object> current = this.head;

        while (current != null) {
            if (current.getLink().equals(o)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public Iterator<java.lang.Object> iterator() {
        return null;
    }

    @Override
    public java.lang.Object[] toArray() {
        return new java.lang.Object[ 0 ];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
}


