import java.util.Scanner;

public class ex_l {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor dos custos do espetáculo: ");
		double custo = sc.nextDouble();

		System.out.print("Insira o valor dos ingressos do espetáculo: ");
		double ingresso = sc.nextDouble();

		System.out.println("O número de ingressos mínimos para cobrir os custos deve ser: " + (custo/ingresso));

		sc.close();

	}

}
