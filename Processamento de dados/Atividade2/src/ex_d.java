import java.util.Scanner;

public class ex_d {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o preço do produto: ");
		double x = sc.nextDouble();

		System.out.print("O novo valor com desconto é de: R$" + (x*0.9));

		sc.close();

	}

}
