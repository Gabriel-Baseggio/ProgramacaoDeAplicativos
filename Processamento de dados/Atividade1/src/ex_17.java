import java.util.Scanner;

public class ex_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int raio;
		
		System.out.print("Insira o valor do raio do círculo: ");
		raio = sc.nextInt();
		
		System.out.println("A área desse círculo é " + (raio * raio * 3.14));
		
		System.out.println("O perímetro desse círculo é " + (2 * raio * 3.14));
		
		sc.close();

	}

}
