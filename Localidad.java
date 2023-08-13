public class Localidad {
 
    private int numLoc;
    private int priceLoc;
    private boolean validSpace;
    private int dispSpace;
    private boolean kenoughMoney;


    public int getNumLoc() {
        return numLoc;
    }

    public void setNumLoc(int numLoc) {
        this.numLoc = numLoc;
    }

    public int getPriceLoc() {
        return priceLoc;
    }

    public void setPriceLoc(int priceLoc) {
        this.priceLoc = priceLoc;
    }

    public boolean isValidSpace() {
        return validSpace;
    }

    public void setValidSpace() {
        if(this.numLoc > 0 ) {
            validSpace = true;
        } else {
            validSpace = false;
        }

    }

    public int getDispSpace() {
        return dispSpace;
    }

    public void setDispSpace(int numentries) {
        if (numentries == this.numLoc) {
            this.dispSpace = numentries;
        }else if (numentries < this.numLoc) {
            this.dispSpace = numentries;
        }else if (numentries > this.numLoc) {
            this.dispSpace = this.numLoc;
        }
    }

    public boolean getKenoughMoney() {
        return kenoughMoney;
    }

    public void setKenoughMon(int budget) {
        if (budget >= (this.priceLoc*this.dispSpace)) {
            this.kenoughMoney = true;
        } else if (budget < this.priceLoc*this.dispSpace) {
            int x = budget/this.priceLoc;
            this.dispSpace = x; 
        }
    }

    public void buyEntries(){
        this.numLoc = this.numLoc - this.dispSpace;
    }


    



}
