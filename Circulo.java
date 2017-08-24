import java.util.Scanner;

public class Circulo {
	public static void main(String[] args) {
		
		Scanner t1 = new Scanner(System.in);
		double r, a;
		
		System.out.print("Ingrese el radio: ");
		r = t1.nextDouble();
		
		a = Math.PI*r*r;
		System.out.print("El area es: " + a);
		
	}

}
