import java.util.Scanner;

public class atv_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double num1, num2;
		
		System.out.print("Informe um n�mero: ");	
		num1 = sc.nextDouble();
		System.out.print("Informe outro n�mero: ");	
		num2 = sc.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O n�mero " + num1 + " � o maior");
		}
		if(num2 > num1){
			System.out.println("O n�mero " + num2 + " � o maior");
		}
		
		sc.close();
		
	}

}
