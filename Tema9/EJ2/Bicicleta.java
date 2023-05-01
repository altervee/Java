
public class Bicicleta extends Vehiculo {

  private int pinones; // número de piñones
  
  public Bicicleta(int p) {
    super();// de esta forma  la subclase hereda todo lo de la clase vehiculo
    this.pinones = p;
  }

  public void hazCaballito() {
    System.out.println("Estoy haciendo el caballito");
  }
}
