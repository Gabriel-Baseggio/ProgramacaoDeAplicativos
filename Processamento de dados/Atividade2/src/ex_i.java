import java.util.Scanner;

public class ex_i {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double salario;
		
		System.out.print("Insira o valor de horas trabalhadas: ");
		int horas = sc.nextInt();

		System.out.print("Insira o valor do salário mínimo: ");
		double salMin = sc.nextDouble();
		
		System.out.print("Insira o valor de horas extras trabalhadas: ");
		double horasExtra = sc.nextDouble();
		
		salario = (horas*(salMin/8));
		salario += (horasExtra*(salMin/4));
		
		System.out.print("O salário a receber é: " + salario);

		sc.close();

	}

}
