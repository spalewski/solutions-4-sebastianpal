package pl.coderstrust.multithreadingMagazine;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService {
    public static void main(String[] args) {

        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        Producer2 producer2 = new Producer2(queue);
        Producer3 producer3 = new Producer3(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(producer2).start();
        new Thread(producer3).start();
        new Thread(consumer).start();
        System.out.println("Producer, Producer2, Producer3 and Consumer has been started");
    }
}