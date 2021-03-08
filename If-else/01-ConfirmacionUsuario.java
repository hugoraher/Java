package BuscadorApellido;                                              //Modificar al nombre del paquete que utilizas o utilizarás para desarrollar dicho programa.
import java.util.Scanner;                                              //Se importa la clase Scanner.

//Comentarios del programa
/**
* Nombre del programa: Confirmación de usuario y contraseña.  
 * ---
 * "El programa solicita que se ingrese Usuario y Contraseña. En caso de que éstos sean correctos,
 * permite el acceso, si no lo son, solicita nuevamente los datos mencionados".
 * Para desarrollar éste programa: Se utilizó la clase Scanner y la declaración if-else.
 * ---
 * Fecha de creación: 26/02/2021
 * Hora: 15:03 pm
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: 01/03/2021
 * Hora última de modificación:  08:01 am
 * 
 */


public class ConfirmacionUsuario {                                      //Se inicializa la clase.
    public static void main (String [] args){
        
        Scanner input=new Scanner(System.in);                           //Se crea el objeto "input" de la clase escaner, éste, nos permitirá ingresar datos desde el teclado. 
        Scanner input1=new Scanner(System.in);                          //Se crea el objeto "input1" de la clase escaner, éste, nos permitirá ingresar datos desde el teclado. 
        String usuario, contrasena;                                     //Se declaran las variables con el tipo de dato.
        
        System.out.print("Ingresa tu usuario: ");                       //Se solicita al usuario ingresar su usuario.   
        usuario=input.nextLine();                                       //Lee los datos que ingresa el usuario.
                
        System.out.print("Ingresa tu contraseña: ");                    //Se solicita al usuario ingresar su contraseña.
        contrasena=input.nextLine();                                    //Lee los datos que ingresa el usuario.
        
        if("Victor Hugo".equals(usuario)){                              //Inicia la declaración if-else.
                                                                        //Modifica el nombre.
        }
        
        if("Raher".equals(contrasena)){                                 //Modifica la contraseña.
            System.out.println("Usuario y contraseña correcta, 'bienvenido al sistema'.");
                                                                        //Impresión de mensaje con datos correctos.
        }else {
            System.out.println("Usuario y contraseña incorrecta, vuelve a intentarlo.");
                                                                        //Impresión de mensaje con datos incorrectos.
        }                                                               //Termina la declaración if-else.
    }
}
