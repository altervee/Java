//Clase Empleado
public class Empleado {
   
    private static double pagoPorHoraExtra; //atributo de clase
    private String nif;
    private String nombre;
    private double sueldoBase;
    private int horasExtras;
    private double tipoIRPF;
    private char casado;  //S ó N
    private int numeroHijos;
   
    //Constructor por defecto
    public Empleado() {
    }

    //Constructor con un parámetro
    public Empleado(String nif) {
        this.nif = nif;
    }

}



    
