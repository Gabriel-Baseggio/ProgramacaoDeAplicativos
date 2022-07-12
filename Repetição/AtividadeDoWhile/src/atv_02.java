import java.util.Scanner;

public class atv_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cod = 0, cont = 0, carPass = 0, acidVit = 0, cidMaior = 0, cidMenor = 0, somaVeic = 0, somaAcidPeq = 0, cidPeq = 0;
		double indice = 0, maiorInd = 0, menorInd = 9999;

		do {
			System.out.print("Informe o c�digo da cidade: ");
			cod = sc.nextInt();
			System.out.print("Informe o n�mero de carros de passeio: ");
			carPass = sc.nextInt();
			System.out.print("Informe o n�mero de acidentes de tr�nsito com v�timas: ");
			acidVit = sc.nextInt();

			indice = (double) acidVit/ (double) carPass;
			
			if(indice > maiorInd) {
				maiorInd = indice;
				cidMaior = cod;
			}
			if(indice < menorInd) {
				menorInd = indice;
				cidMenor = cod;
			}
			
			somaVeic += carPass;
			
			if(carPass < 2000) {
				cidPeq++;
				somaAcidPeq += acidVit;
			}
			
			cont++;
		} while (cont < 5);
		
		System.out.println("A cidade de maior �ndice de acidentes foi " + cidMaior + ", com �ndice de " + maiorInd + " acidentes por carro.");
		System.out.println("A cidade de menor �ndice de acidentes foi " + cidMenor + ", com �ndice de " + menorInd + " acidentes por carro.");
		System.out.println("A m�dia de ve�culos das cidades � " + (somaVeic/5));
		System.out.println("A m�dia de acidentes das cidades com menos de 2.000 carros � " + (somaAcidPeq/cidPeq));

		sc.close();

	}

}
