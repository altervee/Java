

   
public class Persona {
private String dni;
private String nombre;
private String apellidos;
private int edad;
private static int mayoriaEdad = 18;
public Persona(String dni, String nombre, String apellidos, int edad) {
this.dni = dni;
this.nombre = nombre;
this.apellidos = apellidos;
this.edad = edad;
}
public String getDni() {
return dni;
}
public String getNombre() {
return nombre;
}
public String getApellidos() {
return apellidos;
}
public int getEdad() {
return edad;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public void setApellidos(String apellidos) {
this.apellidos = apellidos;
}
public void setEdad(int edad) {
this.edad = edad;
}
// Devuelve si es menor o no
public boolean esMenor() {
return this.edad < 18;
}
// Devuelve si es jubilado o no

public boolean esJubilado() {
return this.edad > 65;
}

public void imprime() {
System.out.println("DNI: " + this.dni);
System.out.println("Nombre: " + this.nombre);
System.out.println("Apellidos: " + this.apellidos);
System.out.println("Edad: " + this.edad);
}

}


