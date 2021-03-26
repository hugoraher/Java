package ProgramasPragmáticos;       //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;           //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


/**
 * Nombre del programa: Área de un Trapecio.
 * ---
 * "El programa Área de un Trapecio, calcula el área de un trapecio mediante los datos que ingresa el usuario.
 * Para desarrollar éste programa: Se utilizó la clase Scanner, el operador "*, + y /".
 * ---
 * Fecha de creación: 26/03/2021
 * Hora: 07:00 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 *
 */


public class ÁreaTrapecio {         //Se inicia la clase
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);                //Se declara la clase Scanner.
        int a,B, b, h;                                          //Se declaran variables.
        
        System.out.println("\t\t\t\t\t\tÁrea de un Trapecio\n");        //Línea impresa del título del programa.
        System.out.print("Ingresa el número para la Base mayor: ");     //Primer mensaje de impresión para ingresar datos por teclado.
        B=input.nextInt();                                              //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa el número para la base menor: ");     //Segundo mensaje de impresión para ingresar datos por teclado.
        b=input.nextInt();                                              //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa el número para la altura: ");         //Segundo mensaje de impresión para ingresar datos por teclado.
        h=input.nextInt();                                              //Lee los datos que ingresan por teclado.
        
        a=(B + b) * h / 2;                                              //Área= (Diagonal mayor + diagonal menor) * h / 2.
        
        System.out.println("El área del trapecio es: " + a);    //Línea de impresión para mostrar el resultado.
    }
}
