import java.util.Scanner;

public class ex_m {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor do sal�rio m�nimo: ");
		double salMin = sc.nextDouble();

		System.out.print("Insira o valor de quilowatts consumidos em sua resid�ncia: ");
		double kw = sc.nextDouble();

		System.out.println("O valor de cada quilowatt �: " + (salMin/5));
		System.out.println("O valor a ser pago na resid�ncia �: " + ((kw*(salMin/5))));
		System.out.println("O valor a ser pago na resid�ncia com desconto de 15% �: " + (0.85*(kw*(salMin/5))));

		sc.close();

	}

}
