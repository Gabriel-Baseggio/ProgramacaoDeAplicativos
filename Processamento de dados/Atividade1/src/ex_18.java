import java.util.Scanner;

public class ex_18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int base, altura;
		
		System.out.print("Insira o valor da base do tri�ngulo: ");
		base = sc.nextInt();
		
		System.out.print("Insira o valor da altura do tri�ngulo: ");
		altura = sc.nextInt();
		
		System.out.println("A �rea desse tri�ngulo � " + ((base * altura) / 2));
		
		
		sc.close();

	}

}
