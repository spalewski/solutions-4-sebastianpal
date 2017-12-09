package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

Printer printer = new Printer("drukarka", false,20);

printer.addToner(20);

System.out.println("initial page count " + printer.getPagesprinted());
int pagesPrinted=printer.printPages(7);
System.out.println("pages printed " + pagesPrinted + " total printed: " + printer.getPagesprinted());


    }
}
