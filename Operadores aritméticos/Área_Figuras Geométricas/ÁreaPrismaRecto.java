package ProgramasPragmáticos;        //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;            //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


/**
 * Nombre del programa: Área de un Prisma Recto.
 * ---
 * "El programa Área de un Prisma Recto, calcula el área de un Prisma Recto mediante los datos que ingresa el usuario.
 * Para desarrollar éste programa: Se utilizó la clase Scanner, el operador "* y +".
 * ---
 * Fecha de creación: 01/04/2021
 * Hora: 10:00 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 */


public class ÁreaPrismaRecto {          //Se inicia la clase
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);                //Se declara la clase Scanner.
        int a, P, al, ar;                                       //Se declaran variables.
       
        
        System.out.println("\t\t\t\t\t\tÁrea de un Prisma Recto\n");   //Línea impresa del título del programa.
        
        System.out.print("Ingresa el número para el Perímetro: ");     //Primer mensaje de impresión para ingresar datos por teclado.
        P=input.nextInt();                                             //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa el número para la altura: ");        //Segundo mensaje de impresión para ingresar datos por teclado.
        al=input.nextInt();                                            //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa el número para la área: ");          //Tercer mensaje de impresión para ingresar datos por teclado.
        a=input.nextInt();                                             //Lee los datos que ingresan por teclado.          
        
        a=P*(al+a);                                                    //Área= 2 * Pi * R * (h+R).
        
        
        System.out.println("El área del prisma recto es: " + a);      //Línea de impresión para mostrar el resultado.
    }
}
