package Programas;              //Modificar al nombre del paquete que utilizas o utilizarás para desarrollar dicho programa.
import java.util.Scanner;       //Se importa la clase Scanner.


//Comentarios de documentación.
/**
 * Nombre del programa: Hora del día.  
 * ---
 * "El programa rectifica la hora del día por medio de un saludo y los datos que 
 * ingrese el usuario por medio del teclado.
 * Para desarrollar éste programa: Se utilizó la clase Scanner y la declaración else if.
 * ---
 * Fecha de creación: 25/02/2021
 * Hora: 06:03 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: 25/02/2021
 * Hora última de modificación: 16:13 pm
 */

public class HorarioDia {       //se inicia la clase.
    public static void main (String [] args){
        Scanner input=new Scanner (System.in); //Se crea el objeto Scanner.
        int hora=24;            //se declara la variable y se le asigna el valor 24 (Referencia a 24 horas del día).
        
        System.out.print("Ingresa la hora del día en formato de 24 horas, por favor: "); //Se solicita al usuario ingresar datos por el teclado. 
        hora=input.nextInt();                                                            
        
        if(hora<6){             //Inicia la declaración "else if".
            System.out.println("Son las " + hora + " am," + " es hora de dormir.");
        }else if(hora<12) {
            System.out.println("Son las " + hora + " am," + " buenos días.");
        }else if(hora<18) {
            System.out.println("Son las " + hora + " pm," + " buenas tardes.");
        }else if(hora<24) {  
            System.out.println("Son las " + hora + " pm," + " buenas noches.");
        } else {
            System.out.println("La hora no existe.");
        }                       //Termina la declaración "else if"
    }
}
