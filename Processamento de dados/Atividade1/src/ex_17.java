import java.util.Scanner;

public class ex_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int raio;
		
		System.out.print("Insira o valor do raio do c�rculo: ");
		raio = sc.nextInt();
		
		System.out.println("A �rea desse c�rculo � " + (raio * raio * 3.14));
		
		System.out.println("O per�metro desse c�rculo � " + (2 * raio * 3.14));
		
		sc.close();

	}

}
