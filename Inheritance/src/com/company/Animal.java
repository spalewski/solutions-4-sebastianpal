package com.company;

public class Animal {
    private String name;
    private int neural;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int neural, int body, int size, int weight) {
        this.name = name;
        this.neural = neural;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }


    public void eat() {
        System.out.println("Animal.eat().call");
    }

    public void move(int speed) {
        System.out.println(" Animal class: Animal moving at speed: " + speed);

    }

    public String getName() {
        return name;
    }

    public int getNeural() {
        return neural;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
