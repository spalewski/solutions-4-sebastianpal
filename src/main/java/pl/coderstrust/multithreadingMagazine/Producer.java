package pl.coderstrust.multithreadingMagazine;


import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> q) {
        this.queue = q;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                Message msg = new Message("element " + i);
                try {
                    queue.put(msg);
                    System.out.println("Producer placed " + msg.getMsg());
                    Thread.sleep(1);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}