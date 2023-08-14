/** Programacion orientada a objetos -  seccion 10
* Luis Francisco Padilla Juárez - 23663
* Ejercicio 1, Overloading
*  13-08-2023*/

public class Localidad {
 
    private int numLoc;
    private int priceLoc;
    private boolean validSpace;
    private int dispSpace;
    private boolean kenoughMoney;

    //atributo no previsto (se utiliza solo para el tostring thou)
    private String name;

    Localidad(){    
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

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

    //validacion super importante
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

    //validacion del dinero, que corrige capacidad adquisitiva del usuario
    public void setKenoughMon(int budget) {
        if (budget >= (this.priceLoc*this.dispSpace)) {
            this.kenoughMoney = true;
        } else if (budget < this.priceLoc*this.dispSpace) {
            int x = budget/this.priceLoc;
            this.dispSpace = x; 
        }
    }

    //metodo no previsto para reducir el numero de entradas en cada localidad
    public void buyEntries(){
        this.numLoc = this.numLoc - this.dispSpace;
        System.out.println("Haz comprado " + this.dispSpace + " entradas en la " + this.name);
    }

    //metodo no previsto, control de caja

    public void boxControl(){
        System.out.println("Disponible: " + this.numLoc +" Localidad: " + this.name + " Precio: "+ this.priceLoc);
    }
    



}
