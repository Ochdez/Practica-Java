import java.util.Scanner;
class Scan1{
  public static void main(String[] args) {

    Scanner teclado1 = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);
    String nombre1;
    String epellido;

    System.out.println("Ingrese el primer nombre:");
    nombre1 = teclado1.nextLine();
    System.out.println("Su nombre es: "+nombre1);

    System.out.println("Ingrese su apellido:");
    epellido = teclado2.nextLine();
    System.out.println("Su apellido es: "+epellido);


  }
}
