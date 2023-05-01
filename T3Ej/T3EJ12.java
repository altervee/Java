public class T3EJ12 { // 
  public static void main(String[] args) {
 String linea;
    System.out.print("Introduzca la base imponible: ");
    linea = System.console().readLine();
    double baseImponible;
    baseImponible = Double.parseDouble(linea);
    System.out.print("Introduzca el tipo de IVA (general 0.21, reducido 0.10 y superreducido 0.04) ");
    linea = System.console().readLine();
    double iva;
    iva = Double.parseDouble(linea);
    double precioconiva = ((baseImponible*iva)+baseImponible);
    System.out.println ("Base imponible " +baseImponible);
    System.out.println ("Iva            " +baseImponible*iva);
    System.out.println ("Precio con Iva " +precioconiva);
  }
}
    
