/**
* Ejercicio Sumas,restas,divisiṕn y multiplicación
*
* @Iván Calderón
*/
public class ejer1Tema2 { 
public static void main(String[] args) {
int x = 144;
int y = 999;
int sum = x + y;
System.out.println("La suma de mis variables es " + sum);
int mul = x * y;
System.out.println("La multiplicación de mis variables es " + mul);
double division  = x * y;
division = ( double )y / ( double )x;
System.out.println("El resultado de la división es " + division);
int res = y - x;
System.out.println("La resta de mis variables es " + res);
}
}
