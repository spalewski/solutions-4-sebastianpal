package pl.coderstrust.multithreadingMagazineExtd;

import java.util.ArrayList;

public class ProducerConsumerService {
    public static void main(String[] args) {

        ArrayList<Message> list = new ArrayList<>(1);
        Producer producer = new Producer(list);
        Consumer consumer = new Consumer(list);

        System.out.println("Producer and Consumer has been started");
        new Thread(producer).start();
        new Thread(consumer).start();

    }
}