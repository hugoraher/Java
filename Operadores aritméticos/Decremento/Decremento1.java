package ProgramasPragmáticos;   //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;       //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


//Comentarios de documentación
/**
 * Nombre del programa: Decremento 1.
 * ---
 * "El programa decremento de un número".
 * Para desarrollar éste programa: Se utilizó la clase Scanner y el operador "--".
 * ---
 * Fecha de creación: 12/03/2021
 * Hora: 07:16 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 *
 */


public class Decremento1 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        int x;
        
         System.out.print("Ingresa un número: ");      //Primer mensaje de impresión para ingresar datos por teclado.
        x=input.nextInt();                            //Lee los datos que ingresan por teclado.
        --x;                                          //Decremento (Anterior número)
        
        System.out.println("El anterior número a partir del que ingresaste es: " + x);     //Impresión de mensaje y resultado.
    }
    
}
