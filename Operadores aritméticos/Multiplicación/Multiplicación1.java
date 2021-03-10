package ProgramasPragmáticos;       //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;           //Se anexa la clase Scanner (Permitirá ingresar datos desde el teclado).

//Comentarios de documentación
/**
 * Nombre del programa: Multiplicación 1.
 * ---
 * "El programa multiplicación de dos números.
 * Para desarrollar éste programa: Se utilizó la clase Scanner y el operador "x".
 * ---
 * Fecha de creación: 09/03/2021
 * Hora: 14:53 pm
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 *
 */


public class Multiplicación1 {           //Se inicia la clase
    public static void main (String [] args){
        Scanner input=new Scanner (System.in);      //Se declara la clase Scanner.
        int n1, n2, resultado;                      //Se declaran las variables.
        
        System.out.print("Ingresa el primer número: "); //Primer mensaje de impresión para ingresar datos por teclado.
        n1=input.nextInt();                             //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa el segundo número: ");//Sengundo mensaje de impresión para ingresar datos por teclado.
        n2=input.nextInt();                             //Lee los datos que ingresa por teclado.
        
        resultado=n1*n2;                                //Se asigna valor a la variable resultado.
        
         System.out.println("El resultado de la multiplicación es: " + resultado);   //Impresión de mensaje y resultado de la resta.
    }
}
