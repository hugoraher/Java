package ProgramasPragmáticos;            //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;                //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).

/**
 * Nombre del programa: Área de un Cono.
 * ---
 * "El programa Área de un Cono, calcula el área de un cono mediante los datos que ingresa el usuario.
 * Para desarrollar éste programa: Se utilizó la clase Scanner, el operador "* y +".
 * ---
 * Fecha de creación: 30/03/2021
 * Hora: 07:00 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 */

public class ÁreaCono {         //Se inicia la clase
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);            //Se declara la clase Scanner.
        double a, r, al, g;                                 //Se declaran variables.
        
        System.out.println("\t\t\t\t\t\tÁrea de un Cono\n");      //Línea impresa del título del programa.
        
        System.out.print("Ingresa el número para el radio: ");       //Primer mensaje de impresión para ingresar datos por teclado.
        r=input.nextInt();                                           //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa el número para la altura: ");      //Segundo mensaje de impresión para ingresar datos por teclado.
        al=input.nextInt();                                          //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa el número para la generatriz: ");  //Tercer mensaje de impresión para ingresar datos por teclado.
        g=input.nextInt();                                           //Lee los datos que ingresan por teclado.
        
        a=Math.PI*r*(al+g);                                          //Área=Pi * r * (al+g).
        
        System.out.println("El área del Cono es: " + a);             //Línea de impresión para mostrar el resultado.
    }
}
