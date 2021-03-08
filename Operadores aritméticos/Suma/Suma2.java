package ProgramasPragmáticos;           //Modificar al nombre del paquete que utilizas o utilizarás para desarrollar dicho programa.
import java.util.Scanner;               //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).

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
 * Fecha última de modificación: 08/03/2021
 * Hora última de modificación: 13:12 pm
 *
 */

public class Suma2 {             //Se inicia la clase.
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);         //Se declara la clase Scanner.
        int n1,n2,n3,resultado;                       //Se declaran las variables.
       
        System.out.print("Ingresa el primer número: "); //Primer mensaje de impresión para ingresar datos por teclado.
        n1=input.nextInt();                             //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa el segundo número: ");//Sengundo mensaje de impresión para ingresar datos por teclado.
        n2=input.nextInt();                             //Lee los datos que ingresa por teclado.
        
        System.out.print("Ingresa el tercer número: "); //Tercer mensaje de impresión para ingresar datos por teclado.
        n3=input.nextInt();                             //Lee los datos que ingresa por teclado.
        
        resultado=n1+n2+n3;                             //Se asigna valor a la variable resultado.
        
        
        System.out.println("El resultado de los tres número es: " + resultado);     //Impresión de mensaje y resultado de la resta.
    }
}