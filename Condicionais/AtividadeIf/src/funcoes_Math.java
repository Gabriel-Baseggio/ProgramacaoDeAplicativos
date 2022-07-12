import java.util.Scanner;

public class funcoes_Math {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;

		System.out.print("Informe o valor de a: ");
		a = sc.nextDouble();
		System.out.print("Informe o valor de b: ");
		b = sc.nextDouble();
		System.out.print("Informe o valor de c: ");
		c = sc.nextDouble();
		
		double quadb = Math.pow(b, 2);
		double delta = quadb - 4*a*c;
		double rdelta = Math.sqrt(delta);
		double resultado1 = (-b + rdelta)/2*a;
		double resultado2 = (-b - rdelta)/2*a;
		
		System.out.printf("X': %.2f", resultado1);
		System.out.printf("\nX'': %.2f", resultado2);
		
		sc.close();
		
	}

}
