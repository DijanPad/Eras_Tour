/** Programacion orientada a objetos -  seccion 10
* Luis Francisco Padilla Juárez - 23663
* Ejercicio 1, Overloading
*  13-08-2023*/

import java.util.Scanner;
import java.util.Random;

public class Eras_Tour {
    
    public static void main(String[] args){

    //instanciar todas las clases que voy a utilizar    
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    Comprador comprador; 
    comprador = new Comprador();

    Ticket ticket;
    ticket = new Ticket(true);

    Localidad localidad1, localidad5, localidad10;

    localidad1 = new Localidad();
    localidad1.setNumLoc(20);
    localidad1.setPriceLoc(100);
    localidad1.setName("Localidad 1");

    localidad5 = new Localidad();
    localidad5.setNumLoc(20);
    localidad5.setPriceLoc(500);
    localidad5.setName("Localidad 5");

    localidad10 = new Localidad();
    localidad10.setNumLoc(20);
    localidad10.setPriceLoc(1000);
    localidad10.setName("Localidad 10");

    boolean run = true;
    String erasTour = "\n The Eras Tour";
    
    //Para que el se repita hasta que alguein decida no seguir compando, un while global
    while (run == true){
        System.out.println(erasTour);

        System.out.println("Ingresa tus datos para solicitar un ticket y tener la posibilidad de compar voletos.");
        
        //todas las interacciones en la interfaz
        System.out.println("Nombre: ");
        String a = scanner.nextLine();
        comprador.setName(a);

        System.out.println("email: ");
        String b = scanner.nextLine();
        comprador.setEmail(b);

        System.out.println("Numero de entradas deseadas: ");
        int c = scanner.nextInt();
        comprador.setNumentries(c);

        System.out.println("Su presupuesto: ");
        int d = scanner.nextInt();
        comprador.setBudget(d);
        
        //sorteo interno de ticket (para saber si puede comprar o no))
        ticket.setNumTic();
        ticket.setMaxRank();
        ticket.setMinRank();
        ticket.setCanBuy();

        //mostar al usuario su Ticket
        ticket.tostring();
        
        if (ticket.getCanBuy() == true) {
                //random de localidad y cada uno de los casos

        int locs = random.nextInt(2)+1;
            localidad1.setValidSpace();
            localidad5.setValidSpace();
            localidad10.setValidSpace();
            //Localidad 1
            if (locs == 1){
                if (localidad1.isValidSpace() == true){
                    localidad1.setDispSpace(comprador.getNumentries());
                    localidad1.setKenoughMon(comprador.getBudget());
                    localidad1.buyEntries();
                } else {
                    System.out.println("No hay entradas para la localidad que accediste");
                }
                
            }else if (locs == 2){ //Localidad 5
                if (localidad5.isValidSpace() == true){
                    localidad5.setDispSpace(comprador.getNumentries());
                    localidad5.setKenoughMon(comprador.getBudget());
                    localidad5.buyEntries();
                } else {
                    System.out.println("No hay entradas para la localidad que accediste");
                }

                //Localidad 10
            }else if (locs == 3){
                if (localidad10.isValidSpace() == true){
                    localidad10.setDispSpace(comprador.getNumentries());
                    localidad10.setKenoughMon(comprador.getBudget());
                    localidad10.buyEntries();
                } else {
                    System.out.println("No hay entradas para la localidad que accediste");
                }

            } 
            
        }else {
            System.out.println("Gracias por participar.");
        

    }
    System.out.println("\n");
    localidad1.boxControl();
        localidad5.boxControl();
        localidad10.boxControl();
    //sistema defensivo reciclado del Lab 1
    boolean flag = true;
    while (flag == true){
    System.out.println("\n Deseas seguir comprando?");
    String e = scanner.nextLine();
    if (e.equals("y")){
        run = true;
        flag = false;
    } else if (e.equals("n")){
        run = !run;
        flag = false;
    }else {
        System.out.println("Ingresa una opcion valida");
        flag = true;
    }
    }
    }
scanner.close(); 
    }
}
