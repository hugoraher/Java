package ProgramasPragmáticos;            //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;                //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


//Comentarios de documentación
/**
 * Nombre del programa: Tabla de Multiplicar (11 al 20).
 * ---
 * "El programa Tablas de multiplicación, se le solicita al usuario ingresar el número de la tabla que desea saber el resultado".
 * Para desarrollar éste programa: Se utilizó la clase Scanner y la estructura de repetición "while".
 * ---
 * Fecha de creación: 16/03/2021
 * Hora: 08:47 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: :  
 *
 */


public class TablaDeMultiplicar2 {                                      //Se inicia la clase.
    public static void main (String [] args){
        Scanner input=new Scanner (System.in);                          //Se declara la clase Scanner.
        int u=0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, m;            //Se declaran las variables.
        
                                                                        //Se asigna valor a las variables.
        r1=11;
        r2=12;
        r3=13;
        r4=14;
        r5=15;
        r6=16;
        r7=17;
        r8=18;
        r9=19;
        r10=20;
        
        System.out.print("Ingresa un número: ");                        //Impresión de línea que solicita el ingreso de datos por teclado.
        m=input.nextInt();                                              //Lee los datos que ingresan por teclado.
      
        switch(m){                                                      //Inicia la declaración switch.
            case 11:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");    //Impresión de línea que solicita el ingreso de datos por teclado.
                while(u < 11){                                          //Inicia la sentencia de repetición while.
                    System.out.println("11 * " + u + " = " + u*r1);     //Impresión de línea que imprime la tabla de multiplicar.
                    u++;                                                //Operador de incremento (1 en 1).
                }                                                       //Termina la sentencia de repetición while.
                    break;
            
            case 12:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("12 * " + u + " = " + u*r2); 
                    u++;
                }
                    break;
               
            case 13:
               System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("13 * " + u + " = " + u*r3); 
                    u++;
                }
                    break;
                    
            case 14:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("14 * " + u + " = " + u*r4); 
                    u++;
                }
                    break;
                    
            case 15:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("15 * " + u + " = " + u*r5); 
                    u++;
                }
                    break;
                    
            case 16:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("16 * " + u + " = " + u*r6); 
                    u++;
                }
                    break;
                    
            case 17:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("17 * " + u + " = " + u*r7); 
                    u++;
                }
                    break;
                    
            case 18:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("18 * " + u + " = " + u*r8); 
                    u++;
                }
                    break;
                    
            case 19:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("19 * " + u + " = " + u*r9); 
                    u++;
                }
                    break;
                    
            case 20:
                System.out.println("El número de la tabla que elegiste es: " + m + ".");
                while(u < 11){
                    System.out.println("20 * " + u + " = " + u*r10); 
                    u++;
                }
                    break;
                    default:
                        System.out.println("El número no existe.");
        }                                                           //Termina la declaración switch
    }
}
