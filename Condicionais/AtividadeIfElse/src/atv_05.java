import java.util.Scanner;

public class atv_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String msg = null;

		System.out.print("Código do funcionário: ");
		int cod = sc.nextInt();
		System.out.print("Salário do funcionário: ");
		double salario = sc.nextDouble();

		sc.close();

		if (cod == 1) {
			msg = "Cargo: Escrituário\nValor do aumento: R$" + (salario * 0.5) + "\nNovo salário: " + (salario * 1.5);
		} else if (cod == 2) {
			msg = "Cargo: Secretário\nValor do aumento: R$" + (salario * 0.35) + "\nNovo salário: " + (salario * 1.35);
		} else if (cod == 3) {
			msg = "Cargo: Caixa\nValor do aumento: R$" + (salario * 0.2) + "\nNovo salário: " + (salario * 1.2);
		} else if (cod == 4) {
			msg = "Cargo: Gerente\nValor do aumento: R$" + (salario * 0.1) + "\nNovo salário: " + (salario * 1.1);
		} else if (cod == 5) {
			msg = "Cargo: Diretor\nValor do aumento: R$0\nNovo salário: " + salario;
		}

		System.out.println(msg);

	}

}
