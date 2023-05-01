
 public class Fecha { 
 private int dia; 
 private int mes; 
 private int año; 
 //Constructor por defecto 
 public Fecha() { 
 } 
 //Constructor con parámetros 
 public Fecha(int dia, int mes, int año) {  this.dia = dia; 
 this.mes = mes; 
 this.año = año; 
 } 
 //setters y getters 
 public void setDia(int d) { 
 this.dia = d; 
 } 
 public void setMes(int m) { 
 this.mes = m; 
 } 
 public void setAño(int a) { 
 this.año = a; 
 } 
 public int getDia() { 
 return dia; 
 } 
 public int getMes() { 
 return mes; 
 } 
 public int getAño() { 
 return año; 
 } 
 //Método para comprobar si la fecha es correcta  public boolean fechaCorrecta() { 
 boolean diaCorrecto, mesCorrecto, añoCorrecto;  añoCorrecto = año > 0; 
 mesCorrecto = mes >= 1 && mes <= 12;  switch (mes) { 
 case 2: 
 diaCorrecto = dia >= 1 && dia <= 28;
 break; 
 case 4: 
 case 6: 
 case 9: 
 case 11: 
 diaCorrecto = dia >= 1 && dia <= 30;  break; 
 default: 
 diaCorrecto = dia >= 1 && dia <= 31;  } 
 return diaCorrecto && mesCorrecto && añoCorrecto;  } 
  
 //Método que modifica la fecha cambiándola por la del día  siguiente  
 public void diaSiguiente() { 
 dia++; 
 if (!fechaCorrecta()) { 
 dia = 1; 
 mes++; 
 if (!fechaCorrecta()) { 
 mes = 1; 
 año++; 
 } 
 } 
 } 
 } 
  

   
