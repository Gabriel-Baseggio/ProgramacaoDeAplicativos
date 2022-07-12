import java.util.Scanner;

public class ex_n {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor em kg do saco de ração: ");
		int racao = sc.nextInt();

		System.out.print("Insira a quantidade de ração fornecida para cada gato em gramas: ");
		int racaoGato = sc.nextInt();

		System.out.println("A quantidade de ração que restará no saco após cinco dias é: " + ((racao*1000)-(racaoGato*10)) );

		sc.close();

	}

}
