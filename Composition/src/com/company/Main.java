package com.company;

public class Main {

    public static void main(String[] args) {
	    Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell","240",dimensions);
        Monitor theMonitor = new Monitor("27 inch","Fujitsu",27,new Resolution(2540, 1440));
        MB mb = new MB("BJ - 200","MSI",4,6,"V4.40");
        PC thePC = new PC(theCase,theMonitor,mb);
        // thePC.getMonitor().drawPixelAt(1500,1200, "green"); PRIVATE
        // thePC.getMb().loadProgram("Word");
        // thePC.getTheCase().pressPowerButton();
        thePC.powerUp();



    }

}
