import java.util.Scanner;

public class atv_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String msg = null;

		System.out.print("C�digo do funcion�rio: ");
		int cod = sc.nextInt();
		System.out.print("Sal�rio do funcion�rio: ");
		double salario = sc.nextDouble();

		sc.close();

		if (cod == 1) {
			msg = "Cargo: Escritu�rio\nValor do aumento: R$" + (salario * 0.5) + "\nNovo sal�rio: " + (salario * 1.5);
		} else if (cod == 2) {
			msg = "Cargo: Secret�rio\nValor do aumento: R$" + (salario * 0.35) + "\nNovo sal�rio: " + (salario * 1.35);
		} else if (cod == 3) {
			msg = "Cargo: Caixa\nValor do aumento: R$" + (salario * 0.2) + "\nNovo sal�rio: " + (salario * 1.2);
		} else if (cod == 4) {
			msg = "Cargo: Gerente\nValor do aumento: R$" + (salario * 0.1) + "\nNovo sal�rio: " + (salario * 1.1);
		} else if (cod == 5) {
			msg = "Cargo: Diretor\nValor do aumento: R$0\nNovo sal�rio: " + salario;
		}

		System.out.println(msg);

	}

}
