import java.util.Scanner;

public class ex_b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um n�mero inteiro: ");
		int x = sc.nextInt();

		System.out.print("Insira outro n�mero inteiro: ");
		int y = sc.nextInt();
		
		System.out.print("Insira outro n�mero inteiro: ");
		int z = sc.nextInt();

		System.out.print("A multiplica��o dos tr�s �: " + (x*y*z));

		sc.close();

	}

}
