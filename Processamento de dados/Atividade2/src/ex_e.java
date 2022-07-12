import java.util.Scanner;

public class ex_e {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor fixo do salário: ");
		double salario = sc.nextDouble();

		System.out.print("Insira o valor de suas vendas: ");
		double vendas = sc.nextDouble();

		System.out.println("O valor de comissão é: " + (vendas*0.04));
		System.out.print("O valor do salário com a comissão é: " + (salario + (vendas*0.04)));
		
		sc.close();

	}

}
