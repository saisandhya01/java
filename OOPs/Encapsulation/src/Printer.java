public class Printer {
    private int tonerLevel;
    private boolean duplex;
    private int pagesPrinted;

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(tonerAmount + this.tonerLevel > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
        }
        else{
            return -1;
        }
        return this.tonerLevel;
    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            pagesToPrint = pages/2 + (pages % 2);
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
