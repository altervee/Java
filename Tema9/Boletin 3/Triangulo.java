public class Triangulo{
  private int base;
  private int altura;
  public Triangulo (int b,int h){
    this.base =b;
    this.altura=h;
  }
  public int getArea(){
  return (base*altura)/2;
}
}
public class pruebaTriangulo{
  public static void main(String[] args){
    Triangulo a =new Triangulo (1,4);
    Triangulo b=new Triangulo (6,14);
    System.out.println("El area del primer triangulo es :" +a.getArea());
    System.out.println("El área del segundo triangulo es :" +b.getArea());
}
}

