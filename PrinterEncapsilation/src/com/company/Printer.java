package com.company;

public class Printer {
    private String printerName;
    private boolean duplex;
    private int pagesprinted;
    private int tonerlevel;

    public Printer(String printerName, boolean duplex, int tonerlevel) {
        if (tonerlevel > -1 && tonerlevel <= 100) {
            this.tonerlevel = tonerlevel;
        } else {
            this.tonerlevel = -1;
        }

        this.printerName = printerName;
        this.duplex = duplex;
        this.pagesprinted = 0;

    }
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerlevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerlevel += tonerAmount;
            return this.tonerlevel;
        } else {
            return -1;
        }
    }
        public int printPages (int pages){
            int pagesToPrint = pages;
            if (this.duplex) {
                pagesToPrint /= 2;
                System.out.println("Printing in duplex mode");
            }
            this.pagesprinted += pagesToPrint;
            return pagesToPrint;
        }

    public int getPagesprinted() {
        return pagesprinted;
    }

}


