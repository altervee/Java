public class Empleado2PorComision extends Empleado2 {  private double comision; 
 private int ventas; 
 public Empleado2PorComision(String nombre, String apellido, String  numSeguridadSocial, double salarioBase, double comision, int ventas) { 
 super(nombre, apellido, numSeguridadSocial,  
salarioBase,comision,ventas); 
 this.comision = comision;
 this.ventas = ventas; 
 } 
 public double darSalario1(){ 
 return this.ventas*this.comision; 
 } 
}
