package ProgramasPragmáticos;          //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;              //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


/**
 * Nombre del programa: Área de un Círculo.
 * ---
 * "El programa Área de un Círculo, calcula el área de un círculo mediante los datos que ingresa el usuario.
 * Para desarrollar éste programa: Se utilizó la clase Scanner, el operador "*", la función Math.pow 'elevado al cuadrado' y la función Math.Pi.
 * ---
 * Fecha de creación: 28/03/2021
 * Hora: 06:45 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 *
 */


public class ÁreaCírculo {          //Se inicia la clase
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);                //Se declara la clase Scanner.
        double a, R;                                            //Se declaran variables.
       
        System.out.println("\t\t\t\t\t\tÁrea de un Círculo\n");        //Línea impresa del título del programa.
        
        System.out.print("Ingresa el número para 'R=Radio': ");        //Primer mensaje de impresión para ingresar datos por teclado.
        R=input.nextInt();                                             //Lee los datos que ingresan por teclado.
            
        a=Math.PI * Math.pow(R,2);                                     //Área= Pi * R^2.
        
        System.out.println("El área del círculo es: " + a);    //Línea de impresión para mostrar el resultado.
    }
}
