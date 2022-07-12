import java.util.Scanner;

public class atv_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double media, nota1, nota2, nota3, aTirar;
		String situacao = "";

		System.out.print("Informe a nota 1: ");
		nota1 = sc.nextDouble();
		System.out.print("Informe a nota 2: ");
		nota2 = sc.nextDouble();
		System.out.print("Informe a nota 3: ");
		nota3 = sc.nextDouble();

		media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			situacao = "aprovado";
		}
		if (media >= 3  && media < 7) {
			situacao = "em exame";
		}
		if (media < 3) {
			situacao = "reprovado";
		}

		System.out.println("Sua média foi " + media + " e está " + situacao);
		
		aTirar = 12-media;
		
		if(situacao.equals("em exame")) {
			System.out.println("Você deve tirar " + aTirar + " no exame final.");
		}

		sc.close();

	}

}
