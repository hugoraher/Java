package ProgramasPragmáticos;       //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;           //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


/**
 * Nombre del programa: Área de un Polígono Regular.
 * ---
 * "El programa Área de un Polígono Regular, calcula el área de un polígono regular mediante los datos que ingresa el usuario.
 * Para desarrollar éste programa: Se utilizó la clase Scanner, el operador "* y /".
 * ---
 * Fecha de creación: 27/03/2021
 * Hora: 07:45 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 */


public class ÁreaPolígonoRegular {           //Se inicia la clase
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);        //Se declara la clase Scanner.
        int a, Pe, Ap;                                  //Se declaran variables.
        
        System.out.println("\t\t\t\t\t\tÁrea de un Polígono Regular\n");        //Línea impresa del título del programa.
        System.out.print("Ingresa el número del Perímetro: ");                  //Primer mensaje de impresión para ingresar datos por teclado.
        Pe=input.nextInt();                                                     //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa el número del apotema: ");                    //Segundo mensaje de impresión para ingresar datos por teclado.
        Ap=input.nextInt();                                                     //Lee los datos que ingresan por teclado.
        
        a=Pe * Ap / 2;                                                          //Área= Perímetro * Apotema / 2.
        
        System.out.println("El área del Polígono Regular es: " + a);            //Línea de impresión para mostrar el resultado.    
    }
}
