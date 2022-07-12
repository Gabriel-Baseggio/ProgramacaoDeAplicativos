import java.util.Scanner;

public class atv_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1;
		
		System.out.print("Informe um número inteiro: ");	
		num1 = sc.nextInt();
		
		if((num1%2) == 0) {
			System.out.println("O número " + num1 + " é par");
		}
		if((num1%2) != 0) {
			System.out.println("O número " + num1 + " é ímpar");
		}
		
		sc.close();

	}

}
