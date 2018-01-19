package pl.coderstrust.multithreadingMagazine2;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> q) {
        this.queue = q;
    }

    @Override
    public void run() {
        try {
            Message msg;
            while (true) {
                for (int i = 0; i < 100; i++) {
                    msg = queue.take();
                    System.out.println("Consumer takes and consumed " + msg.getMsg());
                    Thread.sleep(1);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}