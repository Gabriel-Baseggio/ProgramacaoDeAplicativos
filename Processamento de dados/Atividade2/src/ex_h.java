import java.util.Scanner;

public class ex_h {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor do salário de João: ");
		double salJoao = sc.nextDouble();

		System.out.print("Insira o valor da primeira conta a ser paga: ");
		double conta1 = sc.nextDouble();

		System.out.print("Insira o valor da segunda conta a ser paga: ");
		double conta2 = sc.nextDouble();

		System.out.print("O restante do salário após pagar as contas é: " + (salJoao-((conta1*1.02)+(conta2*1.02))));

		sc.close();

	}

}
