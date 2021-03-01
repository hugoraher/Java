package Programas;	             //Modificar al nombre del paquete que utilizas o utilizarás para desarrollar dicho programa.
import java.util.Scanner;        //Se anexa la clase Scanner (Permitirá ingresar datos desde el teclado).

                                                //Comentarios de documentación
/**
 * Nombre del programa: Recetario
 * ---
 * "El programa es un recetario de cocina que pide datos por medio del teclado al usuario y a su vez, muestra
 * el resultado que se solicita".
 * Para desarrollar éste programa: Se utilizó la clase Scanner y la declaración Switch.
 * ---
 * Fecha de creación: 17/02/2021
 * Hora: 14:21 pm
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: 25/02/2021
 * Hora última de modificación:  15:46 pm
 */


public class Recetario {                    //Se inicia la clase.
     public static void main (String []args){
        Scanner input=new Scanner(System.in);   //Se declara la clase Scanner.
        int receta;                             //Se declara la variable que trabajará con la clase Scanner y la declaración Switch.
        receta=7;                               //Se asigna un valor a la variable.
        
        System.out.print("Ingresa el número de receta: ");        //Línea de impresión para ingresar datos desde teclado.
        receta=input.nextInt();
        
        switch(receta){                         //Se inicia la declaración Switch.
            case 1:                             
                System.out.println("-Usted elijió la receta de Sopa Azteca.");      //Mensaje de la receta elejida.
                System.out.println("\n\nReceta para 4 porciones:\n-12 Tortillas cortadas (en cuadros, tiras o a su gusto)." 
                        + "\n-1/4 de ajo picado."
                        + "\n-1/2 de cebolla picada."
                        + "\n-3 jitomates."
                        + "\n-1 litro de agua."
                        + "\n-Epazote."
                        + "\n-Sal");
                System.out.println("\n\nModo de preparación:"                       //Mensaje de para el usuario.
                        + "\n-Poner a calentar a fuego medio un sartén con aceite al gusto, freir las tortillas y sacarlas del mismo cuando estén crujientes."
                        + "\n-Agregar a la licuadora el 1/4 de ajo picado, la 1/2 cebolla picada, los 3 jitomates, el litro de agua"
                        + " y licuar hasta que todo esté mezclado."
                        + "\n-Poner una cacerola a fuego medio con un poco de aceite."
                        + "\n-Cortar cebolla y poner a sazonar en la cacerola."
                        + "\n-Vertir la mezcla de la licuadora en la cacerola y dejar hervir."
                        + "\n-Cuando esté hirviendo, poner el Epazote y dejar hervir por unos minutos a fuego bajo."
                        + "\n\nModo de servir:"
                        + "\n-En un plato ponga tortillas fritas, vierta la mezcla del jitomate y deguste a su elección.");
                
                System.out.println("\n¡Buen provecho!");                            //Mensaje opcional.
                break;                                                              //Sentencia que rompe la iteración.
                
            case 2:
                System.out.println("-Usted elijió la receta de Sopa Mexica.");      //Mensaje de la receta elejida.
                System.out.println("\nReceta para 4 porciones:\n-1 cebolla blanca picada finamente."        //Línea de impresión.
                        + "\n-2 cucharadas de aceite."
                        + "\n-4 elotes cortados."
                        + "\n-3 chiles poblanos asados, pelados y cortados en tiras."
                        + "\n-2 calabazas picadas en cubos."
                        + "\n-1 manojo de flores de calabaza sin tallos."
                        + "\n-4 tazas de agua."
                        + "\n-Sal.");
                System.out.println("\n\nModo de preparación:"                                                //Línea de impresión.
                        + "\n-En una cacerola vierte el aceite y dejar calentar por un instante."
                        + "Vierte la cebolla y dejar sazonar hasta que se torne un poco transparente."
                        + "\n-Vaciar el agua, los elotes, chiles y calabazas a cocer a fuego bajo por 20 minutos."
                        + "\n-Sazonar al gusto."
                        + "\n-Por último, agrega las flores de la calabaza y calienta por tres minutos más."
                        + "\n\n-Modo de servir:"
                        + "\n-En un plato servir la cantidad al gusto, y acompañar con lo que más le guste.");
                
                System.out.println("\n¡Buen provecho!");                            //Mensaje opcional.
                break;                                                              //Sentencia funcional para romper la iteración.
                
            case 3:
                System.out.println("-Usted elijió la receta de Sopa de Amaranto.");     //Mensaje de la receta elejida.
                System.out.println("\nReceta para 4 porciones:\n-1/2 cebolla picada en forma de media luna."     //Línea de impresión.
                        + "\n-2 litros de agua purificada."
                        + "\n-1 tasa de amaranto."
                        + "\n-Epazote."
                        + "\n-Sal.");
               System.out.println("\n\nModo de preparación:"                                           //Línea de impresión.
                        + "\n-Poner una cacerola con aceite a fuego medio y dejar calentar por un instante."
                        + "\n-Vaciar la cebolla picada y dejar sazonar hasta que se torne un poco transparente."
                        + "\n-Vaciar el agua, y dejar en el fuego medio hasta que hierva."
                        + "\n-Una vez el agua hervida, poner Epazote al gusto y dejar hervir 5 minutos más a fuego bajo ."
                        + "\n-Vaciar la taza de Amaranto y mover hasta incorporar todos los ingredientes, dejar hervir por 10 minutos."
                        + "\n-Poner sal al gusto."
                        + "\n\n-Modo de servir:"
                        + "\nEn un plato, servir la cantidad de sopa al gusto. Acompañar con limón y chile en polvo.");
                
                System.out.println("\n¡Buen provecho!");                            //Mensaje opcional.
                break;                                                              //Sentencia funcional para romper la iteración.
                
                //Espacio para más recetas.
                
            default:                                                                //Método funcional para notificar mensajes alternos al usuario.
        System.out.println("La receta que elegiste no existe.");
        }                                                                           //fin de la declaración Switch.
    }
}

