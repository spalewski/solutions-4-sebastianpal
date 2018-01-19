package pl.coderstrust.multithreadingMagazine;

import java.util.concurrent.BlockingQueue;

public class Producer3 implements Runnable {

    private BlockingQueue<Message> queue;

    public Producer3(BlockingQueue<Message> q) {
        this.queue = q;
    }

    @Override
    public void run() {
        for (int i = 0; i <i+1; i++) {
            Message msg = new Message("element from producer 3 " + i);
            try {
                queue.put(msg);
                System.out.println("Producer nr 3 placed " + msg.getMsg());
                Thread.sleep(1);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}