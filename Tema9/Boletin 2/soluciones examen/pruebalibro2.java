import java.util.Scanner ; 
public class pruebaLibro2 { 
public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 String titulo, autor; 
 int ejemplares; 
 //se crea el objeto libro1 utilizando el constructor con parámetros  Librox libro1 = new Librox("El quijote de la Mancha", "Miguel de  Cervantes", 2, 0); 
 //se crea el objeto libro2 utilizando el constructor por defecto  Librox libro2 = new Librox(); 
 System.out.print("Introduce el titulo del libro2: ");  titulo = sc.nextLine(); 
 System.out.print("Introduce el autor del libro2: ");  autor = sc.nextLine(); 
 System.out.print("Numero de ejemplares del libro2: ");  ejemplares = sc.nextInt(); 
 //se asigna a libro2 los datos pedidos por teclado. 
 //para ello se utilizan los métodos setters 
 libro2.setTitulo(titulo); 
 libro2.setAutor(autor); 
 libro2.setEjemplares(ejemplares); 
 //se muestran por pantalla los datos del objeto libro1  //se utilizan los métodos getters para acceder al valor de los atributos  System.out.println("Libro 1:"); 
 System.out.println("Titulo: " + libro1.getTitulo());  System.out.println("Autor: " + libro1.getAutor()); 
 System.out.println("Ejemplares: " + libro1.getEjemplares());  System.out.println("Prestados: " + libro1.getPrestados());  System.out.println(); 
 //se realiza un préstamo de libro1. El método devuelve true si se ha  podido 
 //realizar el préstamo y false en caso contrario 
 if (libro1.prestamo()) { 
 System.out.println("Se ha prestado el libro " + libro1.getTitulo());  } else { 
 System.out.println("No quedan ejemplares del libro " +  libro1.getTitulo() + " para prestar");  
 } 
 //se realiza una devolución de libro1. El método devuelve true si se ha  podido 
 //realizar la devolución y false en caso contrario
 if (libro1.devolucion()) { 
 System.out.println("Se ha devuelto el libro " + libro1.getTitulo());  } else { 
 System.out.println("No hay ejemplares del libro " +  libro1.getTitulo() + " prestados"); 
 } 
 //se realiza otro préstamo de libro1 
 if (libro1.prestamo()) { 
 System.out.println("Se ha prestado el libro " + libro1.getTitulo());  } else { 
 System.out.println("No quedan ejemplares del libro " +  libro1.getTitulo() + " para prestar"); 
 } 
 //se realiza otro préstamo de libro1. En este caso no se podrá realizar  ya que 
 //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por  //pantalla el mensaje No quedan ejemplares del libro…  if (libro1.prestamo()) { 
 System.out.println("Se ha prestado el libro " + libro1.getTitulo());  } else { 
 System.out.println("No quedan ejemplares del libro " +  libro1.getTitulo() + " para prestar");  
 } 
 //se realiza un préstamo de libro2. El método devuelve true si se ha  podido 
 //realizar el préstamo y false en caso contrario 
 if (libro2.prestamo()) { 
 System.out.println("Se ha prestado el libro " + libro2.getTitulo());  } else { 
 System.out.println("No quedan ejemplares del libro " +  libro2.getTitulo() + " para prestar");  
 } 
 //se realiza una devolución de libro2. El método devuelve true si se ha  podido 
 //realizar la devolución y false en caso contrario 
 if (libro2.devolucion()) { 
 System.out.println("Se ha devuelto el libro " + libro2.getTitulo());  } else { 
 System.out.println("No hay ejemplares del libro " +  libro2.getTitulo() + " prestados"); 
 } 
 //se realiza otro préstamo de libro2 
 if (libro2.prestamo()) { 
 System.out.println("Se ha prestado el libro " + libro2.getTitulo());  } else { 
 System.out.println("No quedan ejemplares del libro " +  libro2.getTitulo() + " para prestar"); 
 } 
 //se realiza otro préstamo de libro2. En este caso no se podrá realizar  ya que 
 //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por  //pantalla el mensaje No quedan ejemplares del libro…  if (libro2.prestamo()) { 
 System.out.println("Se ha prestado el libro " + libro2.getTitulo());  } else { 
 System.out.println("No quedan ejemplares del libro " +  libro2.getTitulo() + " para prestar");  
 } 
 
 //mostrar los datos del objeto libro1 
 System.out.println("Libro 1:"); 
 System.out.println("Titulo: " + libro1.getTitulo());  System.out.println("Autor: " + libro1.getAutor());  System.out.println("Ejemplares: " + libro1.getEjemplares());  System.out.println("Prestados: " + libro1.getPrestados());  System.out.println(); 
 //mostrar los datos del objeto libro2 
 System.out.println("Libro 2:"); 
 System.out.println("Titulo: " + libro2.getTitulo());  System.out.println("Autor: " + libro2.getAutor());  System.out.println("Ejemplares: " + libro2.getEjemplares());  System.out.println("Prestados: " + libro2.getPrestados());  System.out.println(); 
} 
}

