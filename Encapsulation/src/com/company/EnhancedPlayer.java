package com.company;

public class EnhancedPlayer {
    private String name;
    private int hitPoints =100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health<0 && health<=100){
        this.hitPoints = health;}
        this.weapon = weapon;
    }

    public void lh (int damage) {
        this.hitPoints = this.hitPoints - damage;
        // liczba utraconych skills
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
        }
    }
    public int hr(){
        return this.hitPoints;

    }


    public int getHealth() {
        return hitPoints;
    }
}
