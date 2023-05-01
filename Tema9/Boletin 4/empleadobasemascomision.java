public class empleadobasemascomision extends empleado {
private double comision;
private int ventas;
private double salarioBase;

//constructor con parámetros
public empleadobasemascomision(String nombre, String apellido, String numSS, double SalarioBase, double comision, int ventas)  {
super(nombre, apellido, numSS, salarioBase, comision, ventas); // hereda las caracteristicas de la clase empleado
this.comision = comision;
this.ventas = ventas;
this.salarioBase = salarioBase;
}
public double getComision() {
return comision;
}

public void total() {
System.out.println("Ganara" + comision + "cuenta con " + ventas "ventas");

}
@Override // sirve para que un método se sobrescriba y haga otra cosa sin alterar el original
public double getsalarioBase(){
return this.salarioBase+(this.comision*this.ventas);
}
}
