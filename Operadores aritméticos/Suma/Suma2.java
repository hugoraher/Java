package ProgramasPragmáticos;
import java.util.Scanner;

//Comentarios de documentación
/**
 * Nombre del programa: Suma 2.
 * ---
 * "El programa suma de tres números.
 * Para desarrollar éste programa: Se utilizó la clase Scanner y el operador "+".
 * ---
 * Fecha de creación: 08/03/2021
 * Hora: 09:32 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: /03/2021
 * Hora última de modificación: : pm
 *
 */

public class Suma2 {
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        
        int n1,n2,n3,resultado;
       
        
        System.out.print("Ingresa el primer número: ");
        n1=input.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        n2=input.nextInt();
        
        System.out.print("Ingresa el tercer número: ");
        n3=input.nextInt();
        
        resultado=n1+n2+n3;
        
        
        System.out.println("El resultado de los tres número es: " + resultado);
    }
}
