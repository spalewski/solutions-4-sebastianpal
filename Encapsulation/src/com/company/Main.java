package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player player = new Player();
//        player.name="Tim";
//        player.health=20;
//        player.weapon="Sword";
//
//        int damage=10;
//        player.lh(damage);
//        System.out.println("Player HR " + player.hr());
//
//        damage=11;
//        player.lh(damage);
//        System.out.println("Player HR " + player.hr());

        EnhancedPlayer player = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println("Players initial H is: " + player.getHealth());

    }
}
