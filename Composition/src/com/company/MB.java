package com.company;

public class MB {
    private String model;
    private String manufacture;
    private int cardSlots;
    private int ramSlots;
    private String bios;

    public MB(String model, String manufacture, int cardSlots, int ramSlots, String bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program: " + programName +" is loading...");
            }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getBios() {
        return bios;
    }
}
