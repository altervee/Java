public class empleadoporcomision extends empleado{
  private double comision;
  private int ventas;
  int ventas2;
  public empleadoporcomision(String nombre, String apellido, String numSS, double salarioBase, double comision, int ventas) {
  super(nombre, apellido, numSS, salarioBase, comision,ventas); //hereda las características de la clase empleado
  this.comision = comision;
  this.ventas = ventas;
}
public int getVentas(){
  return ventas;
}
//lo de abajo no era necesario
public void numVentas() {
  if (ventas2 > 0
  ) {
    System.out.println("Felicidades has vendido " + ventas);
  }else{
    System.out.println("Más suerte la proxima vez");
  }
}
@Override //sirve para que un metodo se sobrescriba y haga otra cosa sin alterar el original
public double getSalarioBase(){
  return this.ventas*this.comision;
}
}  
