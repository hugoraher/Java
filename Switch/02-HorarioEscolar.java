package ProgramasPragmáticos;           //Modificar el paquete que se utiliza o utilizará para crear el programa.
import java.util.Scanner;               //Importación de la clase Escáner.

//Comentarios de documentación
/**
 * Nombre del programa: Horario Escolar
 * ---
 * "El programa es un Horario Escolar en el que el alumno, consulta su actividad escolar ingresando su número de matricula".
 * Para desarrollar éste programa: Se utilizó la clase Scanner y la declaración Switch.
 * ---
 * Fecha de creación: 27/02/2021
 * Hora: 18:14 pm
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: 03/03/2021
 * Hora última de modificación:  12:14 pm
 */

public class HorarioEscolar {                      //Creación e inicio de la clase
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);   //Creación del objeto input Escaner
        Scanner input1 = new Scanner (System.in);  //Creación del objeto input1 Escáner.
        
                                              //Declaración de variables
        int matricula;
        String dia1, dia2, dia3, dia4, dia5, hora1, hora2, hora3, hora4, materia1, materia2, materia3, materia4, salon1, salon2, salon3, salon4,
        nombre, ndia;
        
                                              //Inicio de asignación de valor a variables.
        dia1="Lunes";
        dia2="Martes"; 
        dia3="Miercoles";                   
        dia4="Jueves";
        dia5="Viernes";
        
        hora1="07:00 - 09:00 am";
        hora2="09:00 - 11:00 am"; 
        hora3="11:00 - 13:00 pm";
        hora4="13:00 - 14:00 pm";
        
        materia1="Fundamentos de Programación"; 
        materia2="Fundamentos de Base de Datos";
        materia3="Fundamentos de Redes";
        materia4="Fundamentos de Software";
        
        salon1="Edificio M-Salón 16";
        salon2="Edificio M-Salón 12";
        salon3="Edificio B-Salón 11";
        salon4="Edificio F-Salón 9";
                                              //Fin de asignación de valor a variables.
        
        nombre="Víctor Hugo";                 //Modificar el nombre de usuario.
        
        System.out.print("Ingresa tu número de matricula: ");       //Mensaje de impresión que solicita datos al usuario por teclado (sólo números).
        matricula=input.nextInt();                                  //Lee los datos que ingresa el usuario.
        
        System.out.print("¿Qué día es hoy?:  ");                    //Mensaje de impresión que solicita datos al usuario por teclado.
        ndia=input1.nextLine();                                     //Lee los datos que ingresa el usuario.
        
        
        switch(ndia){                         //Inicio de la declaración Switch
                                              //Cambiar materias y horario a convenir.
            case "Lunes": 
        System.out.println("\nHola " + nombre + "," + " tu horario para el día de hoy " + ndia + " es: ");
        System.out.println("\nDía\t\tHora\t\t\tMateria\t\t\t\t\tSalón");
        System.out.println("\n" +dia1 + "\t\t" + hora1 + "\t" + materia1 + "\t\t" + salon1 + "\n"
                          +             "\t\t" + hora2 + "\t" + materia2 + "\t\t" + salon2 + "\n"
                          +             "\t\t" + hora3 + "\t" + materia3 + "\t\t\t" + salon3 + "\n"
                          +             "\t\t" + hora4 + "\t" + materia4 + "\t\t\t" + salon4 + "\n\n");
        System.out.println("¡Que tengas un excelente día!\n");
        break;
            case "Martes":
        System.out.println("\nHola " + nombre + "," + " tu horario para el día de hoy " + ndia + " es: ");
        System.out.println("\nDía\t\tHora\t\t\tMateria\t\t\t\t\tSalón");
        System.out.println("\n" +dia2 + "\t\t" + hora1 + "\t" + materia1 + "\t\t" + salon1 + "\n"
                          +             "\t\t" + hora2 + "\t" + materia2 + "\t\t" + salon2 + "\n"
                          +             "\t\t" + hora3 + "\t" + materia3 + "\t\t\t" + salon3 + "\n");
        System.out.println("¡Que tengas un excelente día!\n");
        break;
            case "Miercoles":
        System.out.println("\nHola " + nombre + "," + " tu horario para el día de hoy " + ndia + " es: ");
        System.out.println("\nDía\t\tHora\t\t\tMateria\t\t\t\t\tSalón");
        System.out.println("\n" +dia3 + "\t" + hora2 + "\t" + materia2 + "\t\t" + salon2 + "\n"
                          +             "\t\t" + hora3 + "\t" + materia3 + "\t\t\t" + salon3 + "\n"
                          +             "\t\t" + hora4 + "\t" + materia4 + "\t\t\t" + salon4 + "\n\n");
        System.out.println("¡Que tengas un excelente día!\n");
        break;
            case "Jueves":
        System.out.println("\nHola " + nombre + "," + " tu horario para el día de hoy " + ndia + " es: ");
        System.out.println("\nDía\t\tHora\t\t\tMateria\t\t\t\t\tSalón");
        System.out.println("\n" +dia4 + "\t\t" + hora3 + "\t" + materia3 + "\t\t\t" + salon3 + "\n"
                          +             "\t\t" + hora4 + "\t" + materia4 + "\t\t\t" + salon4 + "\n\n");
        System.out.println("¡Que tengas un excelente día!\n");
        break;   
            case "Viernes":
        System.out.println("\nHola " + nombre + "," + " tu horario para el día de hoy " + ndia + " es: ");
        System.out.println("\nDía\t\tHora\t\t\tMateria\t\t\t\t\tSalón");
        System.out.println("\n" +dia5 + "\t\t" + hora4 + "\t" + materia4 + "\t\t\t" + salon4 + "\n\n");
        System.out.println("¡Que tengas un excelente día!\n");
        break;
         
            default:
                System.out.println("El día no existe.");
        }                                       //Fin de la declaración Switch.
    }
}
