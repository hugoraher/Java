package ProgramasPragmáticos;            //Modificar al nombre del paquete que utilizas o utilizarás para desarrollar dicho programa.
import java.util.Scanner;                //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).

//Comentarios de documentación
/**
 * Nombre del programa: Suma 3.
 * ---
 * "El programa suma de cinco números.
 * Para desarrollar éste programa: Se utilizó la clase Scanner y el operador "+".
 * ---
 * Fecha de creación: 08/03/2021
 * Hora: 09:37 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: 08/03/2021
 * Hora última de modificación: 13:23 pm
 *
 */

public class Suma3 {            //Se inicia la clase.
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);         //Se declara la clase Scanner.
    int n1, n2, n3, n4, n5, resultado;              //Se declaran las variables.
    
    System.out.print("Ingresa el primer número: "); //Primer mensaje de impresión para ingresar datos por teclado.
    n1=input.nextInt();                             //Lee los datos que ingresan por teclado.
    
    System.out.print("Ingresa el segundo número: ");//Sengundo mensaje de impresión para ingresar datos por teclado.
    n2=input.nextInt();                             //Lee los datos que ingresa por teclado.
    
    System.out.print("Ingresa el tercer número: "); //Tercer mensaje de impresión para ingresar datos por teclado.
    n3=input.nextInt();                             //Lee los datos que ingresa por teclado.
    
    System.out.print("Ingresa el cuarto número: "); //Cuarto mensaje de impresión para ingresar datos por teclado.
    n4=input.nextInt();                             //Lee los datos que ingresa por teclado.
    
    System.out.print("Ingresa el quinto número: "); //Quinto mensaje de impresión para ingresar datos por teclado.
    n5=input.nextInt();                             //Lee los datos que ingresa por teclado.
    
    resultado=n1+n2+n3+n4+n5;                       //Se asigna valor a la variable resultado.
    
    System.out.println("\nEl resultado de los cinco números es: " + resultado);      //Impresión de mensaje y resultado de la suma.
    }    
}
