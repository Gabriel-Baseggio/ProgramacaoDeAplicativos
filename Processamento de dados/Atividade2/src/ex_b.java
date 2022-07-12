import java.util.Scanner;

public class ex_b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um número inteiro: ");
		int x = sc.nextInt();

		System.out.print("Insira outro número inteiro: ");
		int y = sc.nextInt();
		
		System.out.print("Insira outro número inteiro: ");
		int z = sc.nextInt();

		System.out.print("A multiplicação dos três é: " + (x*y*z));

		sc.close();

	}

}
