import java.util.Scanner;

public class ex_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int base, altura;
		
		System.out.print("Insira o valor da base do ret�ngulo: ");
		base = sc.nextInt();
		
		System.out.print("Insira o valor da altura do ret�ngulo: ");
		altura = sc.nextInt();
		
		System.out.println("A �rea desse ret�ngulo � " + (base * altura));
		
		System.out.println("O per�metro desse ret�ngulo � " + (2 * base + 2 * altura));
		
		sc.close();

	}

}
