package pl.coderstrust.mySimpleLinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MySimpleLinkedList <T> implements Collection <T> {
    private int size;
    Link first;
    Link last;

    public MySimpleLinkedList() {
        first = null;
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
    public boolean add(T data) {
        Link<T> node = new Link(data);
        if (this.first == null) {
            this.first = this.last = node;
        }else{
            this.last.setNext(node);
            this.last = node;
        }
        this.size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
            if (this.first == null) {
                throw new NoSuchElementException();
            } else if (this.first.getLink().equals(o)) {
                this.first = this.first.getNext();
                this.size--;
            }
        return true;
    }
    @Override
    public boolean contains(Object o) {
            Link<T> current = this.first;

            while (current != null) {
                if (current.getLink().equals(o)) {
                    return true;
                }
                current = current.getNext();
            }
            return false;
        }

    ///////////////////////////////////////////////////////////////

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }



    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[ 0 ];
    }


    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[ 0 ];
    }
}
