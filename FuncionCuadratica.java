import java.util.Scanner;

class FuncionCuadratica{
  public static void main(String[] args) {

    Scanner t1 = new Scanner(System.in);
    Scanner t2 = new Scanner(System.in);
    Scanner t3 = new Scanner(System.in);
    int a,b,c;
    double x1,x2,d;

    System.out.print("Ingrese coeficiente a: ");
    a = t1.nextInt();
    System.out.print("Ingrese coeficiente b: ");
    b = t2.nextInt();
    System.out.print("Ingrese coeficiente c: ");
    c = t3.nextInt();

    d = (b*b)-4*a*c;
    if (d<0){
      System.out.println("No tiene soluciones reales");
    } else {
      x1 = (-b+Math.sqrt(d))/(2*a);
      x2 = (-b-Math.sqrt(d))/(2*a);
      System.out.print("Las soluciones son: ");
      System.out.print("X1= " + x1 + " y X2= " + x2);
    }



  }
}
