import java.util.Scanner;

public class atv_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a, b, c;
		int i;
		System.out.print("Informe o tipo de organização: ");
		i = sc.nextInt();
		System.out.print("Informe o primeiro número: ");
		a = sc.nextDouble();
		System.out.print("Informe o segundo número: ");
		b = sc.nextDouble();
		System.out.print("Informe o terceiro número: ");
		c = sc.nextDouble();

		if (i == 1) {
			if (a < b && a < c && b < c) {
				System.out.println("1 - " + a + "\n2 - " + b + "\n3 - " + c);
			}
			if (a < b && a < c && c < b) {
				System.out.println("1 - " + a + "\n2 - " + c + "\n3 - " + b);
			} 
			if (b < a && b < c && a < c) {
				System.out.println("1 - " + b + "\n2 - " + a + "\n3 - " + c);
			} 
			if (b < a && b < c && c < a) {
				System.out.println("1 - " + b + "\n2 - " + c + "\n3 - " + a);
			} 
			if (c < a && c < b && a < b) {
				System.out.println("1 - " + c + "\n2 - " + a + "\n3 - " + b);
			}
			if (c < a && c < b && b < a) {
				System.out.println("1 - " + c + "\n2 - " + b + "\n3 - " + a);
			}
		}
		if (i == 2) {
			if (a > b && a > c && b > c) {
				System.out.println("1 - " + a + "\n2 - " + b + "\n3 - " + c);
			}
			if (a > b && a > c && c > b) {
				System.out.println("1 - " + a + "\n2 - " + c + "\n3 - " + b);
			}
			if (b > a && b > c && a > c) {
				System.out.println("1 - " + b + "\n2 - " + a + "\n3 - " + c);
			}
			if (b > a && b > c && c > a) {
				System.out.println("1 - " + b + "\n2 - " + c + "\n3 - " + a);
			}
			if (c > a && c > b && a > b) {
				System.out.println("1 - " + c + "\n2 - " + a + "\n3 - " + b);
			}
			if (c > a && c > b && b > a) {
				System.out.println("1 - " + c + "\n2 - " + b + "\n3 - " + a);
			}
		}
		if (i == 3) {
			if (a > b && a > c) {
				System.out.println("1 - " + b + "\n2 - " + a + "\n3 - " + c);
			}
			if (b > a && b > c) {
				System.out.println("1 - " + a + "\n2 - " + b + "\n3 - " + c);
			}
			if (c > a && c > b) {
				System.out.println("1 - " + a + "\n2 - " + c + "\n3 - " + b);
			}
		}

		sc.close();

	}

}
