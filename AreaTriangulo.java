import java.util.Scanner;
public class AreaTriangulo {

	public static void main(String[] args) {
		
	Scanner t1 = new Scanner(System.in);
	
	double a, b, c, s, area;
		
	System.out.print("Ingrese el lado a: ");
	a = t1.nextDouble();
	System.out.print("Ingrese el lado b: ");
	b = t1.nextDouble();
	System.out.print("Ingrese el lado c: ");
	c = t1.nextDouble();
	
	s=(a+b+c)/2;
	area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	
	System.out.print("El area del triangulo es = " + area);
	
		
	}
}
