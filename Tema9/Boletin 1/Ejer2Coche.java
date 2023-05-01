public class Ejer2Coche {
// private: no accesible desde fuera de esta clase
private int caballos;
private int puertas;
private String color, marca, modelo, matricula;

/**Construye un circulo con un valor definido para el radio y un valor por defecto para el color*/
public Ejer2Coche(int c,int p) { // segundo constructor
this.caballos = c;
this.puertas = p;
}
public String getColor() { 
return color;
}
public String getMarca() {
return marca;
}
public String getModelo() {
return modelo;
}
public String getMAtricula() {
  return matricula;
}

/**Devuelve el radio*/
public int getCaballos() {
return caballos;
}
/** Devuelve el área del circulo*/
public int getPuertas() {
return puertas;
}
public void setColor() {
this.color=color;
}
}
