package pl.coderstrust.multithreadingMagazine;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> q) {
        this.queue = q;
    }

    @Override
    public void run() {
     // synchronized (this) {
            try {
                Message msg;
                while ((msg = queue.take()).getMsg() != "exit" && queue.remainingCapacity() >= 0) {
                    msg = queue.take();
                    Thread.sleep(1);
                    System.out.println("Taked and consumed element " + msg.getMsg());
                }
                    while (queue.remainingCapacity()==0)
                    Thread.currentThread().wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
//}

