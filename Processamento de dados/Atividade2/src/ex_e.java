import java.util.Scanner;

public class ex_e {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor fixo do sal�rio: ");
		double salario = sc.nextDouble();

		System.out.print("Insira o valor de suas vendas: ");
		double vendas = sc.nextDouble();

		System.out.println("O valor de comiss�o �: " + (vendas*0.04));
		System.out.print("O valor do sal�rio com a comiss�o �: " + (salario + (vendas*0.04)));
		
		sc.close();

	}

}
