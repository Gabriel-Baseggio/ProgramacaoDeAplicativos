import java.util.Scanner;

public class ex_m {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor do salário mínimo: ");
		double salMin = sc.nextDouble();

		System.out.print("Insira o valor de quilowatts consumidos em sua residência: ");
		double kw = sc.nextDouble();

		System.out.println("O valor de cada quilowatt é: " + (salMin/5));
		System.out.println("O valor a ser pago na residência é: " + ((kw*(salMin/5))));
		System.out.println("O valor a ser pago na residência com desconto de 15% é: " + (0.85*(kw*(salMin/5))));

		sc.close();

	}

}
