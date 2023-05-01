public abstract class Empleado2 { 
 private String nombre; 
 private String apellido; 
 private String numSeguridadSocial; 
 private double salarioBase; 
 private double comision; 
 private int ventas; 
 public Empleado2(String nombre, String apellido, String  numSeguridadSocial, double salarioBase, double comision, int ventas) { 
 this.nombre = nombre; 
 this.apellido = apellido; 
 this.numSeguridadSocial = numSeguridadSocial;  this.comision = comision; 
 this.ventas = ventas; 
 this.salarioBase = salarioBase; 
 } 
 public String getApellido() { 
 return apellido; 
 } 
 public String getNombre() { 
 return nombre; 
 } 
 public String getNumSeguridadSocial() { 
 return numSeguridadSocial; 
 }
 public double getdarSalario() { 
 return salarioBase; 
 } 
 public void setApellido(String apellido) { 
 this.apellido = apellido; 
 } 
 public void setNombre(String nombre) { 
 this.nombre = nombre; 
 } 
 public void setNumSeguridadSocial(String numSeguridadSocial) {  this.numSeguridadSocial = numSeguridadSocial;  } 
 public void setSalarioBase(double salarioBase) { 
 this.salarioBase = salarioBase; 
 } 
 }
