import java.util.Scanner;

public class ex_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int base, altura;
		
		System.out.print("Insira o valor da base do retângulo: ");
		base = sc.nextInt();
		
		System.out.print("Insira o valor da altura do retângulo: ");
		altura = sc.nextInt();
		
		System.out.println("A área desse retângulo é " + (base * altura));
		
		System.out.println("O perímetro desse retângulo é " + (2 * base + 2 * altura));
		
		sc.close();

	}

}
