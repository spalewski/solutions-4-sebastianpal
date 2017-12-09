package com.company;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MB mb;

    public PC(Case theCase, Monitor monitor, MB mb) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.mb = mb;
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }


    private void drawLogo(){
        System.out.println("Power UP button pressed");
       monitor.drawPixelAt(1200,500, "yellow");
    }
    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private MB getMb() {
        return mb;
    }
}
