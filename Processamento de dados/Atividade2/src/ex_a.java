import java.util.Scanner;

public class ex_a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um n�mero inteiro: ");
		int x = sc.nextInt();
		
		System.out.print("Insira outro n�mero inteiro: ");
		int y = sc.nextInt();
		
		System.out.print("A subtra��o do primeiro pelo segundo �: " + (x - y));
		
		sc.close();
		
	}

}
