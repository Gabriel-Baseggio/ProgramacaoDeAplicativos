import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			System.out.print("\n---CALCULADORA---" + "\n1 - Soma" + "\n2 - Subtração" + "\n3 - Multiplicação"
					+ "\n4 - Divisão" + "\n5 - Potenciação" + "\n6 - Porcentagem" + "\n7 - Raiz quadrada" + "\n0 - Sair"
					+ "\nEscolha uma opção: ");
			int operacao = sc.nextInt();

			if (operacao == 0) {
				System.out.println("Obrigado por usar a calculadora!");
				System.exit(operacao);
			}

			System.out.print("Quantos números você digitará?(Mín:1 e Max:5) ");
			int nNum = sc.nextInt();

			double num = 0, resultado = 0, aux = 0, aux2 = 0, resultado2 = 0;

			for (int i = 0; i < nNum; i++) {
				System.out.print("Informe o " + (i + 1) + "º número: ");
				num = sc.nextDouble();
				switch (operacao) {
				case 1:
					resultado += num;
					break;
				case 2:
					resultado = aux - num;
					aux = num;
					if (i > 0) {
						resultado2 = aux2 - num;
						aux2 = resultado;
						if (i > 1) {
							resultado = resultado2;
						}
					}
					break;
				case 3:
					resultado = aux * num;
					aux = num;
					if (i > 0) {
						resultado2 = aux2 * num;
						aux2 = resultado;
						if (i > 1) {
							resultado = resultado2;
						}
					}
					break;
				case 4:
					resultado = aux / num;
					aux = num;
					break;
				case 5:
					resultado = Math.pow(aux, num);
					aux = num;
					break;
				case 6:
					resultado = aux * (num / 100);
					aux = num;
					break;
				case 7:
					resultado = Math.sqrt(num);
					break;
				default:
					System.out.println("Operação incorreta!");
					break;
				}
			}

			System.out.println("Resultado: " + resultado);
		}

	}

}