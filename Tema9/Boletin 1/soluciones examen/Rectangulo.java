//1)Crear una clase Rectángulo,con atributos base y altura.Crear tanbién el constructor de la clase y los métodos necesarios para calcular el área y el perímetro.

/**
 * Clase consistente en un círculo que tiene un radio y un color
 */
public class Rectangulo{
   
   private double base;
   private double altura;
   
   // Constructores
   /** Construye un círculo con un valor por defecto para el radio y para el color */
   public Rectangulo(double b, double a) {  // primer constructor
     this.base = b;
     this.altura =a;
   }
   

  
    public double getPerimetro() {
      return base+altura+base+altura;
   }
     /** Devuelve el área del círculo */
   public double getArea() {
      return base*altura;
}
}








