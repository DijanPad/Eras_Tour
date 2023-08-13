import java.util.Random;
public class Ticket {
    
    private int numTic;
    private int maxRank;
    private int minRank;
    private boolean canBuy;

    Random random = new Random();


    public int getNumTic() {
        return numTic;
    }

    public void setNumTic(int numTic) {
        this.numTic = random.nextInt(14999)+1;
    }

    public int getMaxRank() {
        return maxRank;
    }

    public void setMaxRank(int maxRank) {
        this.maxRank = random.nextInt(14999)+1;
    }    

    public int getMinRank() {
        return minRank;
    }

    public void setMinRank(int minRank) {
        this.minRank = random.nextInt(14999)+1;
    }

    public boolean getCanBuy() {
        return canBuy;
    }

    public void setCanBuy(boolean canBuy) {
        if (this.numTic - this.minRank > 0 && this.maxRank - this.numTic > 0); {
            this.canBuy = true;

        } else {
            this.canBuy = false;
        }
    }

    

}
