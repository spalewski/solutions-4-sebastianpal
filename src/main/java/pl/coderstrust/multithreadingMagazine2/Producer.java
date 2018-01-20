package pl.coderstrust.multithreadingMagazine2;

import java.util.ArrayList;

public class Producer implements Runnable {

    private ArrayList<Message> list;

    public Producer(ArrayList<Message> q) {
        this.list = q;
    }

    @Override
    public void run() {

        while (true) {
            for (int i = 0; i < 100; i++) {
                Message msg = new Message("element " + i);
                    try {
                        while (list.size() == 10) {
                            wait();
                        }
                        list.add(msg);
                        System.out.println("Producer placed " + msg.getMsg());
                        System.out.println("list size after adding " + list.size());
                        Thread.sleep(100);
                       if (list.size()==10){
                       notify();
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
}


