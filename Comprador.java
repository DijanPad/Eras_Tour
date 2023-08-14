/** Programacion orientada a objetos -  seccion 10
* Luis Francisco Padilla Juárez - 23663
* Ejercicio 1, Overloading
*  13-08-2023*/

public class Comprador {

    private String name;
    private String email;
    private int numentries;
    private int budget;

    //Comprador solo guarda datos para que se operen con el resto de objetos
    // no hace nada importante como tal
    //(por eso sus metodos son solo setters y getters)
    
    Comprador(){
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getNumentries() {
        return numentries;
    }
    public void setNumentries(int numentries) {
        this.numentries = numentries;
    }
    public int getBudget() {
        return budget;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }

    

}
