import java.util.Scanner;

public class ex_c {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um número inteiro diferente de zero: ");
		int x = sc.nextInt();

		System.out.print("Insira outro número inteiro: ");
		int y = sc.nextInt();

		System.out.print("A divisão do primeiro pelo segundo é: " + (x/y));

		sc.close();

	}

}
