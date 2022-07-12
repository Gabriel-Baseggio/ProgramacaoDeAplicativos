import java.util.Scanner;

public class ex_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.print("Insira o primeiro número: ");
		num1 = sc.nextDouble();
		
		System.out.print("Insira o segundo número: ");
		num2 = sc.nextDouble();
		
		System.out.println("A média desses números é " + ((num1+num2)/2));
		
		sc.close();

	}

}
