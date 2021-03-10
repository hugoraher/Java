package ProgramasPragmáticos;       //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;           //Se anexa la clase Scanner (Permitirá ingresar datos desde el teclado).


//Comentarios de documentación
/**
 * Nombre del programa: Multiplicación 3.
 * ---
 * "El programa multiplicación de cinco números.
 * Para desarrollar éste programa: Se utilizó la clase Scanner y el operador "x".
 * ---
 * Fecha de creación: 09/03/2021
 * Hora: 15:29 pm
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 *
 */


public class Multiplicación3 {           //Se inicia la clase
    public static void main (String [] args){
        Scanner input=new Scanner (System.in);        //Se declara la clase Scanner.
        int n1,n2,n3,n4,n5,resultado;                 //Se declaran las variables.
        
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
        
        resultado=n1*n2*n3*n4*n5;                       //Se asigna valor a la variable resultado.
        
        System.out.println("El resultado de la resta es: " + resultado);   //Impresión de mensaje y resultado de la resta.
    }
}
