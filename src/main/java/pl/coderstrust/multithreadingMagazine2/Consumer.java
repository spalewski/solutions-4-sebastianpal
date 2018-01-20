package pl.coderstrust.multithreadingMagazine2;

import java.util.Iterator;
import java.util.LinkedList;

public class Consumer implements Runnable {

    private LinkedList<Message> list;

    public Consumer(LinkedList<Message> q) {
        this.list = q;
    }

    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                try {
                    while (list.size() == 0) {
                        wait();
                    }
                    Iterator<Message> iterator = list.listIterator();
                    Message msg;

                    msg = iterator.next();
                    iterator.remove();
                    System.out.println("Consumer takes and consumed " + msg.getMsg());
                    Thread.sleep(10);
                    this.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}