/**
* Ejercicio 1 horario
*
* @author Iván Calderón 
*/

public class T4EJ1 {
public static void main(String[] args) {
String diaSem;
    /* Recoge dia de la semana */
    System.out.print("Por favor, introduce un dia de la semana: ");
    diaSem = System.console().readLine().toLowerCase();
    /* Switch para encontrar asignatura */
    switch (diaSem){
        case "lunes":
        case "miércoles":
          System.out.print("Hay Sistemas Informáticos.");
          break;
        case "martes":
        case "jueves":
        case "viernes":
          System.out.print("Hay Programación.");
          break;
        case "sábado":
        case "domingo":
          System.out.print("No hay clase.");
        default:
          System.out.print("¿Qué parte de dia de la semana no entendiste?");
    }
  }
}


