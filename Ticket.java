/** Programacion orientada a objetos -  seccion 10
* Luis Francisco Padilla Juárez - 23663
* Ejercicio 1, Overloading
*  13-08-2023*/

import java.util.Random;
public class Ticket {
    
    private int numTic;
    private int maxRank;
    private int minRank;
    private boolean canBuy;

    Random random = new Random();

    Ticket(boolean canBuy) {
        this.canBuy = canBuy;
    }

    public int getNumTic() {
        return numTic;
    }

    public void setNumTic() {
        this.numTic = random.nextInt(14999)+1;
    }

    public int getMaxRank() {
        return maxRank;
    }

    public void setMaxRank() {
        this.maxRank = random.nextInt(14999)+1;
    }    

    public int getMinRank() {
        return minRank;
    }

    public void setMinRank() {
        this.minRank = random.nextInt(14999)+1;
    }

    public boolean getCanBuy() {
        return canBuy;
    }

    public void setCanBuy() {
        if ((this.numTic - this.minRank > 0) && (this.maxRank - this.numTic > 0)) {
            this.canBuy = true;
            // validacion de ticket
        } else {
            this.canBuy = false;
        }
    }

    //Metodo no previsto
    public void tostring() {
        System.out.println("Tu numero de ticket es " + this.numTic);
        if (this.canBuy == true){
            System.out.println("Puedes comprar entradas");
        } else {
            System.out.println("No puedes comprar entradas");
        }
    }


}
