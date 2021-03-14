package ProgramasPragmáticos;    //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;        //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


//Comentarios de documentación
/**
 * Nombre del programa: Año siguiente.
 * ---
 * "El programa año siguiente, consiste en que para saber el año posterior, el usuario debe insertar el año actual".
 * Para desarrollar éste programa: Se utilizó la clase Scanner y el operador "++".
 * ---
 * Fecha de creación: 13/03/2021
 * Hora: 18:34 pm
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 *
 */


public class AñoSiguiente {                             //Se inicia la clase.
    public static void main (String [] args){
        Scanner input=new Scanner (System.in);          //Se declara la clase Scanner.
        int a;                                          //Se declara la variable.
        
        System.out.print("Ingresa el año actual: ");    //Primer mensaje de impresión para ingresar datos por teclado.
        a=input.nextInt();                              //Lee los datos que ingresan por teclado.
        ++a;                                            //Incremento (Siguiente número)
        
        System.out.println("El siguiente año es: " + a);//Impresión de mensaje y resultado.
    }
}
