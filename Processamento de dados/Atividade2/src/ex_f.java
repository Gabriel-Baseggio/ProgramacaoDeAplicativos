import java.util.Scanner;

public class ex_f {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor do sal�rio m�nimo: ");
		double salMin = sc.nextDouble();

		System.out.print("Insira o valor do seu sal�rio: ");
		double salPessoa = sc.nextDouble();

		System.out.print("A quantidade de sal�rios m�nimos que voc� ganha �: " + (salPessoa/salMin));

		sc.close();
		
	}

}
