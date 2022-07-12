import java.util.Scanner;

public class atv_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0, somaTotal = 0, i = 0, maior = 0, menor = 9999999, numPar = 0, somaPares = 0, numImpar = 0;

		while (num != 30000) {
			System.out.print("Informe um número(30000 para sair): ");
			num = sc.nextInt();

			if (num == 30000) {
				break;
			}

			somaTotal += num;
			i++;
			if(num > maior) {
				maior = num;
			}
			if(num < menor) {
				menor = num;
			}
			if(num % 2 == 0) {
				numPar++;
				somaPares += num;
			} else {
				numImpar++;
			}
		}
		
		System.out.println("Soma de todos os números: " + somaTotal);
		System.out.println("Quantidade de números: " + i);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Média dos pares: " + (somaPares/numPar));
		System.out.println("Porcentagem dos ímpares: " + (((double) numImpar/i)*100));

		
		sc.close();

	}

}
