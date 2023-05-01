public class EmpleadoTest { 
public static void main (String args[]){ 
Empleado Empleado1=new Empleado ("Antonio", "Martínez", 20000.00); Empleado Empleado2=new Empleado ("María", "Fernández", 50000.00); System.out.println("Empleado1: Nombre: "+Empleado1.getnombre()+" Apellido:  "+Empleado1.getapellido()+" Salario: "+Empleado1.getSalario()); System.out.println("Empleado2: Nombre: "+Empleado2.getnombre()+" Apellido:  "+Empleado2.getapellido()+" Salario: "+Empleado2.getSalario()); 
Empleado1.setSalario( (0.1*Empleado1.getSalario())+Empleado1.getSalario()); Empleado2.setSalario( (0.1*Empleado2.getSalario())+Empleado2.getSalario()); 
System.out.println(""); 
System.out.println("Empleado1: Nombre: "+Empleado1.getnombre()+" Apellido:  "+Empleado1.getapellido()+" Nuevo salario: "+Empleado1.getSalario()); System.out.println("Empleado2: Nombre: "+Empleado2.getnombre()+" Apellido:  "+Empleado2.getapellido()+" Nuevo salario: "+Empleado2.getSalario()); 
} 
}

