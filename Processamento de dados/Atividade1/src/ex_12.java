import java.util.Scanner;

public class ex_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Insira o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.print("Insira o segundo número: ");
		num2 = sc.nextInt();
		
		System.out.println("A soma dos números é " + (num1 + num2));
		
		sc.close();

	}

}
