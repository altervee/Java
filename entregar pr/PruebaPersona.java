import java.util.Scanner;
public class PruebaPersona {
public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
// Instanciamos personas
Persona persona1 = new Persona("11111111-X", "Juan", "A B", 30);
Persona persona2 = new Persona("21111111-T", "María", "C D", 40);
// Imprimimos p1 y p2
persona1.imprime();
System.out.println("");
persona2.imprime();
System.out.println("");
System.out.println("");
// Realizamos algunos cambios
persona1.setNombre("Jaime");
persona1.setEdad(11);
persona2.setNombre("Ignacio");
persona2.setEdad(26);
// Imprimimos p1 y p2
persona1.imprime();
System.out.println("");
persona2.imprime();
System.out.println("");
// Imprimomos diferencia de edad
System.out.println("La diferencia de edad es " +
Math.abs((persona1.getEdad()-persona2.getEdad()))+ " años");
if (persona1.esMenor()) {
System.out.println("La persona 1 es menor de edad");
} else {
System.out.println("La persona 1 es mayor de edad");
}
if (persona2.esMenor()) {
System.out.println("La persona 2 es menor de edad");
} else {

System.out.println("La persona 2 es mayor de edad");
}
System.out.println("");

}
}

