import java.util.scanner;
public class T4EJ22B {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   System.out.println(" ¿Que dia de la semana es hoy ");
   String dia = s.next ();
   System.out.println(" ¿Que hora es? Escriba la hora separada de los minutos por un espacio ");
   int hora = s.nextInt ();
   int minutos = s.nextInt ();
   
   
   
   
if (dia.equals("lunes")) {
System.out.println("Faltan " +(((60*24)*6)+(20*60)-(hora*60)-minutos) +" minutos para el domingo a las 20h");
}
if (dia.equals("martes")) {
System.out.println("Faltan " +(((60*24)*5)+(20*60)-(hora*60)-minutos) +" minutos para el domingo a las 20h");
}
if (dia.equals("miercoles")) {
System.out.println("Faltan " +(((60*24)*4)+(20*60)-(hora*60)-minutos) +" minutos para el domingo a las 20h");
}
if (dia.equals("jueves")) {
System.out.println("Faltan " +(((60*24)*3)+(20*60)-(hora*60)-minutos) +" minutos para el domingo a las 20h");
}
if (dia.equals("viernes")) {
System.out.println("Faltan " +(((60*24)*2)+(20*60)-(hora*60)-minutos) +" minutos para el domingo a las 20h");
}
if (dia.equals("sabado")) {
System.out.println("Faltan " +(((60*24)*1)+(20*60)-(hora*60)-minutos) +" minutos para el domingo a las 20h");
}
if (dia.equals("domingo")) {
System.out.println("Faltan " +(((60*24)*0)+(20*60)-(hora*60)-minutos) +" minutos para el domingo a las 20h");
}
}






