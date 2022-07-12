import java.util.Scanner;

public class atv_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 1;

		while(num != 0 && num > 0) {
			System.out.print("Informe um número(0 ou Negativo para sair): ");
			num = sc.nextInt();
			
			if(num == 0 || num < 0) {
				break;
			}
			
			System.out.println("Quadrado: " + Math.pow(num, 2));
			System.out.println("Cubo: " + Math.pow(num, 3));
			System.out.println("Raíz Quadrada: " + Math.sqrt(num));
		}

		sc.close();

	}

}
