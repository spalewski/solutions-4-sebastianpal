package com.company;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSuply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSuply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSuply = powerSuply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSuply() {
        return powerSuply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
