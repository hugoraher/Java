package ProgramasPragmáticos;       //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;           //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).

/**
 * Nombre del programa: Área de un Ortoedro.
 * ---
 * "El programa Área de un Ortoedro, calcula el área de un ortoedro mediante los datos que ingresa el usuario.
 * Para desarrollar éste programa: Se utilizó la clase Scanner, el operador "* y +".
 * ---
 * Fecha de creación: 30/03/2021
 * Hora: 07:45 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 */


public class ÁreaOrtoedro {         //Se inicia la clase
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);        //Se declara la clase Scanner.
        int a, an, al, lon;                             //Se declaran variables.
        
        System.out.println("\t\t\t\t\t\tÁrea de un Ortoedro\n");      //Línea impresa del título del programa.
        
        System.out.print("Ingresa el número de ancho: ");             //Primer mensaje de impresión para ingresar datos por teclado.
        an=input.nextInt();                                           //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa el número para la altura: ");       //Segundo mensaje de impresión para ingresar datos por teclado.
        al=input.nextInt();                                           //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa el número para la longitud: ");     //Tercer mensaje de impresión para ingresar datos por teclado.
        lon=input.nextInt();                                          //Lee los datos que ingresan por teclado.
        
        a=2*(an*lon + an*al + lon*al);                                //Área= 2 * (a*b + a*c + b*c).
        
        System.out.println("El área del ortoedro es: " + a);          //Línea de impresión para mostrar el resultado.
    }
}
