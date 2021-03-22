package ProgramasPragmáticos;
import java.util.Scanner;


/**
 *
 * @author ESCRITORIO
 */


public class ÁreaCuadrado {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int a, ba, al;
        
        System.out.println("\t\t\t\t\t\tÁrea de un Cuadrado");
        System.out.print("Ingresa la base: ");
        ba=input.nextInt();
        
        System.out.print("Ingresa la altura: ");
        al=input.nextInt();
        
        a=ba*al;
        
        System.out.println("El área del cuadrado es: " + a);
    }
    
}
