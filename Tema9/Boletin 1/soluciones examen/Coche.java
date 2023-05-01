

/**
 * 2)Crear una clase Coche,a trves de la cual se pueda conocer 
 */
public class Coche { 
 private String color; 
 private String marca; 
 private String modelo; 
 private int numCaballos; 
 private int numPuertas; 
 private String matricula; 
  
 public Coche(String marca, String modelo, int numPuertas, String matricula){  this.marca = marca; 
 this.modelo = modelo; 
 this.numPuertas = numPuertas; 
 this.matricula = matricula; 
 }
  
  
 public String getColor() { 
 return color; 
 } 
 public String getMarca() {  return marca; 
 } 
 public String getMatricula() {  return matricula; 
 } 
 public String getModelo() {  return modelo; 
 } 
 public int getNumCaballos() {  return numCaballos; 
 } 
 public int getNumPuertas() {  return numPuertas; 
 } 
 public void setColor(String color) {  this.color = color; 
 }
}
