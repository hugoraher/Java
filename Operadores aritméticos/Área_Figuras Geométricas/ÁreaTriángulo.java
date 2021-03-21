package ProgramasPragmáticos;       //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;           //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


//Comentarios de documentación
/**
 * Nombre del programa: Área de un Triángulo.
 * ---
 * "El programa Área de un Triángulo, calcula el área de un triángulo mediante los datos que ingresa el usuario.
 * Para desarrollar éste programa: Se utilizó la clase Scanner, el operador "* y /".
 * ---
 * Fecha de creación: 21/03/2021
 * Hora: 13:46 pm
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 *
 */


public class ÁreaTriángulo {            //Se inicia la clase
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);    //Se declara la clase Scanner.
        int a, ba, al;                              //Se declaran variables.
       
        
        System.out.print("\t\t\t\t\tÁrea de un Triángulo:\n\n"); //Línea impresa del título del programa.    
        System.out.print("Ingresa la base: ");                //Primer mensaje de impresión para ingresar datos por teclado.
        ba=input.nextInt();                                     //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa la altura: ");                //Primer mensaje de impresión para ingresar datos por teclado.
        al=input.nextInt();                                     //Lee los datos que ingresan por teclado.
        
        a=ba*al/2;                                              //Área= base * altura / 2.
        
        System.out.println("El área del triángulo es: " + a  );     //Línea de impresión para mostrar el resultado.
    }
}
