import java.util.Scanner;

public class atv_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double num1, num2;
		
		System.out.print("Informe um número: ");	
		num1 = sc.nextDouble();
		System.out.print("Informe outro número: ");	
		num2 = sc.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O número " + num1 + " é o maior");
		}
		if(num2 > num1){
			System.out.println("O número " + num2 + " é o maior");
		}
		
		sc.close();
		
	}

}
