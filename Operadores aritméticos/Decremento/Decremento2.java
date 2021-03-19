package ProgramasPragmáticos;       //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;           //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


/**
 * Nombre del programa: Decremento 2.
 * ---
 * "El programa anterior cumpleaños, éste, solicita al usuario ingresar su edad actual y a partir de la misma, calcula el anterior número de cumpleaños".
 * Para desarrollar éste programa: Se utilizó la clase Scanner y el operador "--".
 * ---
 * Fecha de creación: 12/03/2021
 * Hora: 20:28 pm
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 *
 */


public class Decremento2{                                //Se inicia la clase.
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);         //Se declara la clase Scanner.
        int edad;                                        //Se declara la variable.
        
        System.out.print("Tu amig@, no recuerda que número de cumpleaños tuviste al año pasado, ingresa tu edad actual para ayudarlo: ");   //Mensaje de impresión para ingresar datos por teclado.
        edad=input.nextInt();                            //Lee los datos que ingresan por teclado.
        
        --edad;                                          //Decremento (Anterior número)
        
        
        System.out.println("Tu número de cumpleaños pasado fue: " + edad + ".");        //Impresión de mensaje y resultado.
    }
}
