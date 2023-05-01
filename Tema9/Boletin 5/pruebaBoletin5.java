import java.util.Scanner;
public class pruebaBoletin5 {
public static void main (String[] args){
Scanner reader = new Scanner (System.in);

boletin5 suma = new boletin5();

boletin5 pares = new boletin5();

boletin5 impares = new boletin5();
int numero =0;
System.out.println("Escribe los números: ");

while (numero !=-1) {
numero = Integer.parseInt(reader.nextLine());
if(numero == -1) {
break;

}
suma.anadirNumero(numero);
if (numero % 2 == 0) {
} else {
impares.anadirNumero(numero);
}
}
System.out.println("Suma: " + suma.suma());
System.out.println("Suma. de los pares: " + pares.suma());
System.out.println("Suma de los impares: " + impares.suma());
 }
 }
