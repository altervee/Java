public class T4EJ2 {
public static void main(String[] args) {
System.out.print("Por favor, introduzca una hora: ");
int hora = Integer.parseInt(System.console().readLine());
if ((hora >= 6)&&(hora <= 12)){
System.out.println("Buenos días.");
}
else if ((hora >= 13)&&(hora <=20)){
System.out.println("Buenas tardes");
}
else if ((hora >= 21)&&(hora <= 24)){
System.out.print("Buenas noches.");
}
else if ((hora >= 0)&&(hora <= 5)){
System.out.print("Buenas noches.");
} 

else {
System.out.print("Error, porque no lo introdujiste correctamente.");
}
}
}
