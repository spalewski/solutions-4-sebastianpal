package pl.coderstrust.multithreadingMagazine;


import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> q) {
        this.queue = q;
    }

    @Override
    public void run() {
        synchronized (queue) {
            for (int i = 0; i < 100; i++) {
                Message msg = new Message("element " + i);
                try {
                    if (queue.remainingCapacity() != 0) {
                        queue.put(msg);
                        Thread.sleep(1);
                        System.out.println("Produced and placed " + msg.getMsg());
                    }else {
                        Thread.currentThread().wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Message msg = new Message("exit");
            try {
                queue.put(msg);
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}