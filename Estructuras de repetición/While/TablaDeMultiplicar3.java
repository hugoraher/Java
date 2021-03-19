package ProgramasPragmáticos;           //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;               //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


/**
 * Nombre del programa: Tabla de Multiplicar (20 al 30).
 * ---
 * "El programa Tablas de multiplicación, se le solicita al usuario ingresar el número de la tabla que desea saber el resultado".
 * Para desarrollar éste programa: Se utilizó la clase Scanner y la estructura de repetición "while".
 * ---
 * Fecha de creación: 18/03/2021
 * Hora: 13:59 pm
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: :  
 *
 */


public class TablaDeMultiplicar3 {                                         //Se inicia la clase.
    public static void main (String [] args){
        Scanner input=new Scanner (System.in);                             //Se declara la clase Scanner.
        int u=0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, m;               //Se declaran las variables
        
                                                                           //Se asigna valor a las variables.
        r1=21;
        r2=22;
        r3=23;
        r4=24;
        r5=25;
        r6=26;
        r7=27;
        r8=28;
        r9=29;
        r10=30;
        
        System.out.print("Ingresa un número: ");                            //Impresión de línea que solicita el ingreso de datos por teclado.
        m=input.nextInt();                                                  //Lee los datos que ingresan por teclado.
      
        switch(m){                                                          //Inicia la declaración switch.
            case 21:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");     //Impresión de línea que solicita el ingreso de datos por teclado.
                while(u < 11){                                              //Inicia la sentencia de repetición while.
                    System.out.println("21 * " + u + " = " + u*r1);         //Impresión de línea que imprime la tabla de multiplicar.
                    u++;                                                    //Operador de incremento (1 en 1).
                }                                                           //Termina la sentencia de repetición while.
                    break;
            
            case 22:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("22 * " + u + " = " + u*r2); 
                    u++;
                }
                    break;
               
            case 23:
               System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("23 * " + u + " = " + u*r3); 
                    u++;
                }
                    break;
                    
            case 24:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("24 * " + u + " = " + u*r4); 
                    u++;
                }
                    break;
                    
            case 25:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("25 * " + u + " = " + u*r5); 
                    u++;
                }
                    break;
                    
            case 26:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("26 * " + u + " = " + u*r6); 
                    u++;
                }
                    break;
                    
            case 27:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("27 * " + u + " = " + u*r7); 
                    u++;
                }
                    break;
                    
            case 28:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("28 * " + u + " = " + u*r8); 
                    u++;
                }
                    break;
                    
            case 29:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("29 * " + u + " = " + u*r9); 
                    u++;
                }
                    break;
                    
            case 30:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("30 * " + u + " = " + u*r10); 
                    u++;
                }
                
                    break;
                    default:
                        System.out.println("El número no existe.");
            }                                                       //Termina la declaración switch
        }
    }
