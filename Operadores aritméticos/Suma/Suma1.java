package ProgramasPragmáticos;
import java.util.Scanner;

//Comentarios de documentación
/**
 * Nombre del programa: Suma 1.
 * ---
 * "El programa suma de dos números.
 * Para desarrollar éste programa: Se utilizó la clase Scanner y el operador "+".
 * ---
 * Fecha de creación: 08/03/2021
 * Hora: 09:09 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: /03/2021
 * Hora última de modificación: : pm
 *
 */

public class Suma1 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        //Scanner input1 = new Scanner (System.in);
        int n1, n2, resultado;
        
        System.out.print("Ingresa un  primer número: " );
        n1=input.nextInt();
        
        System.out.print("Ingresa un segundo número: ");
        n2=input.nextInt();
        
        resultado=n1 + n2;
        
        System.out.println("La suma de los dos números es: " + resultado);
    }   
}
