package pl.coderstrust.multithreadingMagazine;

import java.util.concurrent.BlockingQueue;

public class Producer2 implements Runnable {

        private BlockingQueue<Message> queue;

        public Producer2(BlockingQueue<Message> q){
            this.queue=q;
        }
        @Override
        public void run() {
            for(int i=0; i<100; i++){
                Message msg = new Message("element "+i + "from Producer2");
                try {
                    while (queue.remainingCapacity()==10){
                        wait();
                        queue.put(msg);
                        System.out.println("Produced "+msg.getMsg());}
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
      /*      Message msg = new Message("exit");
            try {
                queue.put(msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
}