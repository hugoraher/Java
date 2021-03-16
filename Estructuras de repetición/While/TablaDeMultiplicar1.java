package ProgramasPragmáticos;       //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;           //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


//Comentarios de documentación
/**
 * Nombre del programa: Tablas de multiplicación (1 a 10).
 * ---
 * "El programa Tablas de multiplicación, se le solicita al usuario ingresar el número de la tabla que desea saber el resultado".
 * Para desarrollar éste programa: Se utilizó la clase Scanner y la estructura de repetición "while".
 * ---
 * Fecha de creación: 14/03/2021
 * Hora: 22:13 pm
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: 15/03/2021
 * Hora última de modificación: 12:13 pm 
 *
 */


public class TablaDeMultiplicar1 {                                         //Se inicia la clase.
    public static void main (String ... args){
        Scanner input=new Scanner (System.in);                             //Se declara la clase Scanner.
        int u=0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, m;               //Se declaran las variables
        
                                                                           //Se asigna valor a las variables.
        r1=1;
        r2=2;
        r3=3;
        r4=4;
        r5=5;
        r6=6;
        r7=7;
        r8=8;
        r9=9;
        r10=10;
        
        System.out.print("Ingresa un número: ");                            //Impresión de línea que solicita el ingreso de datos por teclado.
        m=input.nextInt();                                                  //Lee los datos que ingresan por teclado.
      
        switch(m){                                                          //Inicia la declaración switch.
            case 1:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");     //Impresión de línea que solicita el ingreso de datos por teclado.
                while(u < 11){                                              //Inicia la sentencia de repetición while.
                    System.out.println("1 * " + u + " = " + u*r1);          //Impresión de línea que imprime la tabla de multiplicar.
                    u++;                                                    //Operador de incremento (1 en 1).
                }                                                           //Termina la sentencia de repetición while.
                    break;
            
            case 2:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("2 * " + u + " = " + u*r2); 
                    u++;
                }
                    break;
               
            case 3:
               System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("3 * " + u + " = " + u*r3); 
                    u++;
                }
                    break;
                    
            case 4:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("4 * " + u + " = " + u*r4); 
                    u++;
                }
                    break;
                    
            case 5:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("5 * " + u + " = " + u*r5); 
                    u++;
                }
                    break;
                    
            case 6:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("6 * " + u + " = " + u*r6); 
                    u++;
                }
                    break;
                    
            case 7:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("7 * " + u + " = " + u*r7); 
                    u++;
                }
                    break;
                    
            case 8:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("8 * " + u + " = " + u*r8); 
                    u++;
                }
                    break;
                    
            case 9:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("9 * " + u + " = " + u*r9); 
                    u++;
                }
                    break;
                    
            case 10:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("10 * " + u + " = " + u*r10); 
                    u++;
                }
                    break;
                    default:
                        System.out.println("El número no existe.");
                    }                                                       //Termina la declaración switch
                }
            }
