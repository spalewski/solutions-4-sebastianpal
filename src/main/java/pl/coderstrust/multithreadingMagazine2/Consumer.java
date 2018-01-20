package pl.coderstrust.multithreadingMagazine2;

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
                synchronized (this) {
                    while (list.size() == 0) {
                        list.wait();
                    }
                    Iterator<Message> iterator = list.listIterator();
                    Message msg;
                    while (!iterator.hasNext()) ;
                    msg = iterator.next();
                    iterator.remove();
                    System.out.println("Consumer takes and consumed " + msg.getMsg());
                    System.out.println(list.size());
                    if (list.size()==0){
                    notify();
                }}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}