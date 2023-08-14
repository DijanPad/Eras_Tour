import java.util.Scanner;
import java.util.Random;

public class Eras_Tour {
    
    public static void main(String[] args){
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

    localidad5 = new Localidad();
    localidad5.setNumLoc(20);
    localidad5.setPriceLoc(500);

    localidad10 = new Localidad();
    localidad10.setNumLoc(20);
    localidad10.setPriceLoc(1000);

    //no se usa, pero ayuda a la hora de crear el bucel infinito
    boolean run = true;
    String erasTour = "The Eras Tour";

    while (run == true){
        System.out.println(erasTour);
        System.out.println("Ingresa tus datos para solicitar un ticket y tener la posibilidad de compar voletos.");
        
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
        
        ticket.setNumTic();
        ticket.setMaxRank();
        ticket.setMinRank();
        ticket.setCanBuy();

        ticket.tostring();
        
        if (ticket.getCanBuy() == true) {

        int locs = random.nextInt(2)+1;
        System.out.println(locs);
            localidad1.setValidSpace();
            localidad5.setValidSpace();
            localidad10.setValidSpace();
            if (locs == 1){
                if (localidad1.isValidSpace() == true){
                    localidad1.setDispSpace(comprador.getNumentries());
                    localidad1.setKenoughMon(comprador.getBudget());
                    localidad1.buyEntries();
                }
            }else if (locs == 2){
                if (localidad5.isValidSpace() == true){
                    localidad5.setDispSpace(comprador.getNumentries());
                    localidad5.setKenoughMon(comprador.getBudget());
                    localidad5.buyEntries();
                }

            }else if (locs == 3){
                if (localidad10.isValidSpace() == true){
                    localidad10.setDispSpace(comprador.getNumentries());
                    localidad10.setKenoughMon(comprador.getBudget());
                    localidad10.buyEntries();
                }

            } 
            
        }else {
            System.out.println("Gracias por participar.");
        

    }
    
    }
scanner.close(); 
    }
}
