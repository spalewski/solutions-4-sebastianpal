package pl.coderstrust.multithreadingMagazine2;


import java.util.LinkedList;

public class Producer implements Runnable {

    private LinkedList<Message> list;

    public Producer(LinkedList<Message> q) {
        this.list = q;
    }

    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                for (int i = 0; i < 100; i++) {
                    if (list.size() <= 10) {
                        Message msg = new Message("element " + i);
                        list.add(msg);
                        System.out.println("Producer placed " + msg.getMsg());
                    } else {
                        try {
                            this.wait(20);
                            this.notify();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        }
    }
}