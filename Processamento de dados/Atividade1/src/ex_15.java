import java.util.Scanner;

public class ex_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.print("Insira o primeiro n�mero: ");
		num1 = sc.nextDouble();
		
		System.out.print("Insira o segundo n�mero: ");
		num2 = sc.nextDouble();
		
		System.out.println("A m�dia desses n�meros � " + ((num1+num2)/2));
		
		sc.close();

	}

}
