package com.company;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("Weast");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");
        Ceiling ceiling = new Ceiling(25, 5);
        Bed bed = new Bed("Modern", 5, 4, 3, 6);
        Lamp lamp = new Lamp("Classic", false, 7);

        Bedroom bedRoom = new Bedroom("Sypialnia", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }
}
