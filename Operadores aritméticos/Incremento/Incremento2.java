package ProgramasPragmáticos;       //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;           //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


/**
 * Nombre del programa: Incremento 2.
 * ---
 * "El programa próximo cumpleaños, éste, solicita al usuario ingresar su edad actual y a partir de la misma, calcula el próximo número de cumpleaños".
 * Para desarrollar éste programa: Se utilizó la clase Scanner y el operador "++".
 * ---
 * Fecha de creación: 17/03/2021
 * Hora: 20:14 pm
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 *
 */


public class Incremento2 {                              //Se inicia la clase.
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);        //Se declara la clase Scanner.
        int edad;                                       //Se declara la variable.
        
        System.out.print("Ingresa tu edad actual: ");   //Mensaje de impresión para ingresar datos por teclado.
        edad=input.nextInt();                           //Lee los datos que ingresan por teclado.
        
        edad++;                                         //Incremento (Siguiente número)
        
        
        System.out.println("Tu próximo número de cumpleaños será: " + edad + ".");      //Impresión de mensaje y resultado.
    }
}
