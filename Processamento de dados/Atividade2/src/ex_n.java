import java.util.Scanner;

public class ex_n {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor em kg do saco de ra��o: ");
		int racao = sc.nextInt();

		System.out.print("Insira a quantidade de ra��o fornecida para cada gato em gramas: ");
		int racaoGato = sc.nextInt();

		System.out.println("A quantidade de ra��o que restar� no saco ap�s cinco dias �: " + ((racao*1000)-(racaoGato*10)) );

		sc.close();

	}

}
