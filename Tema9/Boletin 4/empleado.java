
public abstract class empleado {
String nombre;
String apellido;
String numSS;
double salarioBase;
double comision;
int ventas;

public empleado(String nombre, String apellido, String numSS, double salarioBase, double comision, int ventas) {
this.nombre = nombre;
this.apellido = apellido;
this.numSS = numSS;
this.salarioBase = salarioBase;
this.comision = comision;
this.ventas = ventas;

}

//getter métodos
public String getApellido() {
return apellido;
}
public String getNombre() {
return nombre;
}

public String getNumSS() {
return numSS;
}
public double getSalarioBase(){
return salarioBase;
}
//setters métodos
public void setApellido(String apellido) {
this.apellido = apellido;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}

public void setnumSS(String numSS) {
  this.numSS = numSS;
}
public void setSalarioBase(double salarioBase) {
  this.salarioBase = salarioBase;
}
//public abstract double Salario();
}
