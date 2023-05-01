public class Empleado { 
private String nombre; 
private String apellido; 
private double salario; 
public Empleado(String nombre, String apellido, double salario) { this.nombre =nombre; 
this.apellido = apellido; 
this.salario=salario; 
} 
public String getnombre(){ 
return nombre; 
} 
public String getapellido(){ 
return apellido; 
} 
public double getSalario(){ 
return salario; 
}
public void setnombre(String nombre){ 
this.nombre = nombre; 
} 
public void setapellido(String apellido){ 
this.apellido = apellido; 
} 
public void setSalario(double salario){ 
this.salario = salario; 
} 
} 

 
