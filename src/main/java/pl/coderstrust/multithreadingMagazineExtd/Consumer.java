package pl.coderstrust.multithreadingMagazineExtd;

import java.util.ArrayList;
import java.util.Iterator;

public class Consumer implements Runnable {

    private ArrayList<Message> list;

    public Consumer(ArrayList<Message> q) {
        this.list = q;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (list) {
                    while (list.size() == 0) {
                        System.out.println("WAITING!!!!!!!!!!!");
                        list.wait();
                        Iterator<Message> iterator = list.listIterator();
                        Message msg;
                        while (iterator.hasNext()) {
                            msg = iterator.next();
                            iterator.remove();
                            System.out.println("Consumer takes and consumed " + msg.getMsg());
                            System.out.println(list.size());
                        }
                        Thread.sleep(100);
                        list.notifyAll();
                    }
                    list.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}