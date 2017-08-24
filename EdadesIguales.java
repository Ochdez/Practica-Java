import java.util.Scanner;
class EdadesIguales{

  public static void main(String[] args) {

    Scanner t1 = new Scanner(System.in);
    Scanner t2 = new Scanner(System.in);
    int edad1;
    int edad2;

    System.out.print("Edad de la persona 1: ");
    edad1 = t1.nextInt();

    System.out.print("Edad de la persona 2: ");
    edad2 = t2.nextInt();

    if (edad1 == edad2){
      System.out.println("Las edades son iguales.");
    } else if (edad1 > edad2){
      System.out.println("La persona 1 es mayor.");
    } else {
      System.out.println("La persona 2 es mayor.");
    }


  }
}
