import java.util.Scanner;

public class ex_c {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um n�mero inteiro diferente de zero: ");
		int x = sc.nextInt();

		System.out.print("Insira outro n�mero inteiro: ");
		int y = sc.nextInt();

		System.out.print("A divis�o do primeiro pelo segundo �: " + (x/y));

		sc.close();

	}

}
