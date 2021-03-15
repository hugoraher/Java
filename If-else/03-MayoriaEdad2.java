package ProgramasPragmáticos;           //Nombre del paquete dónde alojo mis programas.
import java.util.Scanner;               //Se importa la clase Scanner.


//Comentarios de documentación
/**
 * Nombre del programa: Mayoría de edad 2.
 * ---
 * "El programa solicita al usuario ingresar su edad, si éste cumple la mayoría de edad, se permite
 * el acceso. Si no, se le niega por ser menor de edad. Además, para constatar la mayoría de edad. Se solicita
 * ingrear el año de nacimiento.
 * Para desarrollar éste programa: Se utilizó la clase Scanner y la declaración if-else.
 * ---
 * Fecha de creación: 06/03/2021
 * Hora: 16:33 pm
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: 15/03/2021
 * Hora última de modificación:   12:15 pm
 *
 */

public class MayoriaEdad2 {                    //Se inicia la clase
     public static void main (String [] args){
        Scanner input=new Scanner(System.in);  //Se crea el objeto Scanner.
        int edad;                              //Se declara la variable "edad".
        int año;                               //Se declara la variable "año".
        
        
        System.out.print("Ingresa tu edad: "); //Impresión de pantalla solicitando datos al usuario.
        edad=input.nextInt();                  //Lee los datos que ingresa el usuario.
        
        System.out.print("Para constatar que eres mayor de edad, ingresa el año de tu nacimiento: ");
        año=input.nextInt();                   //Lee los datos que ingresa el usuario.
        
        if(año<=2003){                         //Inicia la declaración if-else.
            System.out.println("Tu edad, si  cumple el requisito para ingresar.");
        }else {
            System.out.println("Tu edad, no cumple el requisito para ingresar.");
        }                                      //Finaliza la declaración if-else.  
    }
}
