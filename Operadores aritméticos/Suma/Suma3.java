/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramasPragmáticos;
import java.util.Scanner;

//Comentarios de documentación
/**
 * Nombre del programa: Suma 3.
 * ---
 * "El programa suma de cinco números.
 * Para desarrollar éste programa: Se utilizó la clase Scanner y el operador "+".
 * ---
 * Fecha de creación: 08/03/2021
 * Hora: 09:37 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: /03/2021
 * Hora última de modificación: : pm
 *
 */

public class Suma3 {
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    int n1, n2, n3, n4, n5, resultado;
    
    System.out.print("Ingresa el primer número: ");
    n1=input.nextInt();
    
    System.out.print("Ingresa el segundo número: ");
    n2=input.nextInt();
    
    System.out.print("Ingresa el tercer número: ");
    n3=input.nextInt();
    
    System.out.print("Ingresa el cuarto número: ");
    n4=input.nextInt();
    
    System.out.print("Ingresa el quinto número: ");
    n5=input.nextInt();
    
    resultado=n1+n2+n3+n4+n5;
    
    System.out.println("\nEl resultado de los cinco números es: " + resultado);
    }    
}
