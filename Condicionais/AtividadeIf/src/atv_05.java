import java.util.Scanner;

public class atv_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double num1, num2, num3, num4;
		System.out.println("Informe os 3 pr�ximos n�meros em ordem crescente");
		System.out.print("Informe o primeiro n�mero: ");	
		num1 = sc.nextDouble();
		System.out.print("Informe o segundo n�mero: ");	
		num2 = sc.nextDouble();
		System.out.print("Informe o terceiro n�mero: ");	
		num3 = sc.nextDouble();
		System.out.print("Informe o quarto n�mero: ");	
		num4 = sc.nextDouble();
		
		if(num4 > num1 && num4 > num2 && num4 > num3) {
			System.out.println("1 - " + num4 + "\n2- " + num3 + "\n3- " + num2 + "\n4- " + num1);
		}
		if(num4 > num1 && num4 > num2 && num4 < num3) {
			System.out.println("1 - " + num3 + "\n2- " + num4 + "\n3- " + num2 + "\n4- " + num1);
		}
		if(num4 < num1) {
			System.out.println("1 - " + num3 + "\n2- " + num2 + "\n3- " + num1 + "\n4- " + num4);
		}
		if(num4 > num1 && num4 < num2 && num4 < num3) {
			System.out.println("1 - " + num3 + "\n2- " + num2 + "\n3- " + num4 + "\n4- " + num1);
		}
		
		sc.close();

	}

}
