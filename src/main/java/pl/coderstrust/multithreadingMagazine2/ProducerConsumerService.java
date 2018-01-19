package pl.coderstrust.multithreadingMagazine2;

import java.util.LinkedList;

public class ProducerConsumerService {
    public static void main(String[] args) {

        LinkedList<Message> list = new LinkedList<>();
        Producer producer = new Producer(list);
        Consumer consumer = new Consumer(list);

        new Thread(producer).start();
        new Thread(consumer).start();
        System.out.println("Producer, Producer2, Producer3 and Consumer has been started");
    }
}