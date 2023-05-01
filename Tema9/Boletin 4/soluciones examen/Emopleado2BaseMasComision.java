public class Empleado2BaseMasComision extends Empleado2 {  private double salarioBase; 
 private double comision; 
 private int ventas; 
 public Empleado2BaseMasComision(String nombre, String apellido, String  numSeguridadSocial, double salarioBase, double comision, int ventas) { 
 super(nombre, apellido,  
numSeguridadSocial,salarioBase,comision,ventas); 
 this.comision = comision; 
 this.ventas = ventas; 
 this.salarioBase = salarioBase; 
 } 
  
  
 public double darSalario2 (){ 
 return this.salarioBase + (this.ventas*this.comision); 
 } 
}
