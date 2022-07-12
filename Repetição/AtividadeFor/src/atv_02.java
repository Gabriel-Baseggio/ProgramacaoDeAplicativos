import java.util.Scanner;

public class atv_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int jogaMenor = 0, pesoMaior = 0;
		double somaAlt = 0;
		
		for(int i = 1; i <= 2; i++) {			
			double somaAltT = 0;
			for(int j = 1; j <= 11; j++) {
				System.out.print("\nInforme a idade do " + j + "º jogador do " + i + "º time: ");
				int idade = sc.nextInt();
				System.out.print("Informe o peso do " + j + "º jogador do " + i + "º time: ");
				double peso = sc.nextDouble();
				System.out.print("Informe a altura do " + j + "º jogador do " + i + "º time: ");
				double altura = sc.nextDouble();
				
				if(idade < 18) {
					jogaMenor++;
				}
				somaAlt += altura;
				somaAltT += altura;
				if(peso > 80) {
					pesoMaior++;
				}
			}
			System.out.printf("O time " + i + " tem média de idades de: %.2f \n", (somaAltT/11));
		}
		
		System.out.println("\nQuantidade de jogadores com menos de 18 anos: " + jogaMenor);
		System.out.printf("A média de idades é: %.2f", (somaAlt/22));
		System.out.printf("\nA porcentagem de jogadores acima de 80kg é: %.2f%", (((double) pesoMaior/22)*100));
		
		sc.close();

	}

}
