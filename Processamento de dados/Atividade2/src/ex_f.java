import java.util.Scanner;

public class ex_f {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor do salário mínimo: ");
		double salMin = sc.nextDouble();

		System.out.print("Insira o valor do seu salário: ");
		double salPessoa = sc.nextDouble();

		System.out.print("A quantidade de salários mínimos que você ganha é: " + (salPessoa/salMin));

		sc.close();
		
	}

}
