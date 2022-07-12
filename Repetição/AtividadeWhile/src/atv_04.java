import java.util.Scanner;

public class atv_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double valKW, qtdKW = 1, pctAcre = 0, consPaga = 0, somaTotal = 0, entreVal = 0;
		int tipo;

		System.out.print("Informe o valor do salário mínimo: ");
		double salMin = sc.nextDouble();
		
		valKW = salMin/8;
		System.out.println("O valor de cada quilowatt é R$" + valKW);

		while (qtdKW != 0) {
			System.out.print("\nInforme a quantidade de Quilowatts(0 para sair): ");
			qtdKW = sc.nextInt();

			if (qtdKW == 0) {
				break;
			}

			System.out.print("Informe o tipo de consumidor" + "\n1 - Residencial" + "\n2 - Comercial"
					+ "\n3 - Industrial" + "\nOpção escolhida: ");
			tipo = sc.nextInt();

			switch (tipo) {
			case 1:
				pctAcre = 1.05;
				break;
			case 2:
				pctAcre = 1.1;
				break;
			case 3:
				pctAcre = 1.15;
				break;
			default:
				System.out.println("Tipo de consumidor incorreto!");
				break;
			}

			consPaga = (qtdKW*valKW) * pctAcre;
			
			System.out.println("Esse consumidor deve pagar: R$" + consPaga);
			
			somaTotal += consPaga;
			
			if(consPaga >= 500 && consPaga <= 1000) {
				entreVal++;
			}

		}
		
		System.out.println("O faturamento geral da empresa foi R$" + somaTotal);
		System.out.println("A quantidade de consumidores que pagam entre R$500 e R$1.000: " + entreVal);

		sc.close();

	}

}
