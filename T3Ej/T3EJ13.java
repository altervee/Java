public class T3EJ13 { // 
public static void main(String[] args) {
String linea;
System.out.print("Introduzca la nota del primer examen: ");
linea = System.console().readLine();
double nota1;
nota1 = Double.parseDouble(linea);
System.out.print("¿Que nota quieres sacar en el trimestre? ");
linea= System.console().readLine();
double notaMedia;
notaMedia = Double.parseDouble(linea);
double sacar = ((notaMedia-(0.4*nota1))/0.6);
System.out.println ("Para tener un "+notaMedia+" en el trimestre necesitaras sacar un "+sacar+" en el segundo examen");
}
}

