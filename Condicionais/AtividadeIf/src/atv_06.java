import java.util.Scanner;

public class atv_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1;
		
		System.out.print("Informe um n�mero inteiro: ");	
		num1 = sc.nextInt();
		
		if((num1%2) == 0) {
			System.out.println("O n�mero " + num1 + " � par");
		}
		if((num1%2) != 0) {
			System.out.println("O n�mero " + num1 + " � �mpar");
		}
		
		sc.close();

	}

}
