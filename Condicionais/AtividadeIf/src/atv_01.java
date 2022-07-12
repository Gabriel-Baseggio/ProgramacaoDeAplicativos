import java.util.Scanner;

public class atv_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double media, nota1, nota2, nota3;
		char conceito = 'a';

		System.out.print("Informe a nota do trabalho de laboratório: ");
		nota1 = sc.nextDouble();
		System.out.print("Informe a nota da avaliação: ");
		nota2 = sc.nextDouble();
		System.out.print("Informe a nota do exame final: ");
		nota3 = sc.nextDouble();

		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

		if (media >= 8) {
			conceito = 'A';
		}
		if (media >= 7 && media < 8) {
			conceito = 'B';
		}
		if (media >= 6 && media < 7) {
			conceito = 'C';
		}
		if (media >= 5 && media < 6) {
			conceito = 'D';
		}
		if (media < 5) {
			conceito = 'E';
		}

		System.out.println("Sua média foi " + media + " e teve conceito " + conceito);

		sc.close();

	}

}
