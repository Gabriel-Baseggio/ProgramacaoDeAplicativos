import java.util.Scanner;

public class atv_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double num1, num2, num3;
		
		System.out.print("Informe um número: ");	
		num1 = sc.nextDouble();
		System.out.print("Informe outro número: ");	
		num2 = sc.nextDouble();
		System.out.print("Informe outro número: ");	
		num3 = sc.nextDouble();
		
		if(num1 < num2 && num1 < num3 && num2 < num3) {
			System.out.println("1 - " + num1 + "\n2 - " + num2 + "\n3 - " + num3);
		} 
		if(num1 < num2 && num1 < num3 && num3 < num2) {
			System.out.println("1 - " + num1 + "\n2 - " + num3 + "\n3 - " + num2);
		}
		if(num2 < num1 && num2 < num3 && num1 < num3) {
			System.out.println("1 - " + num2 + "\n2 - " + num1 + "\n3 - " + num3);
		}
		if(num2 < num1 && num2 < num3 && num3 < num1) {
			System.out.println("1 - " + num2 + "\n2 - " + num3 + "\n3 - " + num1);
		}
		if(num3 < num1 && num3 < num2 && num1 < num2) {
			System.out.println("1 - " + num3 + "\n2 - " + num1 + "\n3 - " + num2);
		}
		if(num3 < num1 && num3 < num2 && num2 < num1) {
			System.out.println("1 - " + num3 + "\n2 - " + num2 + "\n3 - " + num1);
		}
		
		sc.close();

	}

}
