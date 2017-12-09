package com.company;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void lh (int damage) {
        this.health = this.health - damage;
        // liczba utraconych skills
        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }
        public int hr(){
            return this.health;

    }

}
