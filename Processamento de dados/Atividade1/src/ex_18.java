import java.util.Scanner;

public class ex_18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int base, altura;
		
		System.out.print("Insira o valor da base do triângulo: ");
		base = sc.nextInt();
		
		System.out.print("Insira o valor da altura do triângulo: ");
		altura = sc.nextInt();
		
		System.out.println("A área desse triângulo é " + ((base * altura) / 2));
		
		
		sc.close();

	}

}
