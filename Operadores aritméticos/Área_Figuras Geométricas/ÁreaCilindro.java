package ProgramasPragmáticos;       //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;           //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


/**
 * Nombre del programa: Área de un Cilindro.
 * ---
 * "El programa Área de un Cilindro, calcula el área de un cilindro mediante los datos que ingresa el usuario.
 * Para desarrollar éste programa: Se utilizó la clase Scanner, el operador "* y +".
 * ---
 * Fecha de creación: 29/03/2021
 * Hora: 06:45 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 */


public class ÁreaCilindro {         //Se inicia la clase
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);                //Se declara la clase Scanner.
        double a, h, R;                                         //Se declaran variables.
       
        System.out.println("\t\t\t\t\t\tÁrea de un Cilindro\n");       //Línea impresa del título del programa.
        
        System.out.print("Ingresa el número para 'R=Radio': ");        //Primer mensaje de impresión para ingresar datos por teclado.
        R=input.nextInt();                                             //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa el número para la altura: ");        //Primer mensaje de impresión para ingresar datos por teclado.
        h=input.nextInt();          
        
        a=2*Math.PI*R*(h+R);                                     //Área= 2 * Pi * R * (h+R).
        
        System.out.println("El área del cilindro es: " + a);     //Línea de impresión para mostrar el resultado.
    }
}
