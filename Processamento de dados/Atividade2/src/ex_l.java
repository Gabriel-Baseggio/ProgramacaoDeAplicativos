import java.util.Scanner;

public class ex_l {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor dos custos do espet�culo: ");
		double custo = sc.nextDouble();

		System.out.print("Insira o valor dos ingressos do espet�culo: ");
		double ingresso = sc.nextDouble();

		System.out.println("O n�mero de ingressos m�nimos para cobrir os custos deve ser: " + (custo/ingresso));

		sc.close();

	}

}
