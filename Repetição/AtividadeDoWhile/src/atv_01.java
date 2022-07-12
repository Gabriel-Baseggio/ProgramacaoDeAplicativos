import java.util.Scanner;

public class atv_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0, cont = 0;
		
		do {
			cont = 0;
			
			System.out.print("Informe um número: ");
			num = sc.nextInt();	
			
			if(num <= 1) {
				break;
			}
			
			for(int i = num; i >= 1; i--) {
				if(num%i == 0) {
					cont++;
				}
			}
			
			if(cont == 2) {
				System.out.println(num + " é primo.");
			} else {
				System.out.println(num + " não é primo.");
			}
			
		} while(num > 1);
		
		sc.close();
		

	}

}
