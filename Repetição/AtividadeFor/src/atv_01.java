import java.util.Scanner;

public class atv_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + num + " = " + (i * num));
		}
		
	}

}
