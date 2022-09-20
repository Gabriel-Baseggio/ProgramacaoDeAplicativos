import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static Calculadora c = new Calculadora();

	public static void main(String[] args) {
		while (true) {	
			
			c.setResultado(0);
			c.setResultado2(0);
			c.setAux(0);
			c.setAux2(0);
			
			menu();

			System.out.println("Resultado: " + c.getResultado());
			
		}

	}

	private static void menu() {
		
		System.out.print("\n---CALCULADORA---"
				+ "\n1 - Soma"
				+ "\n2 - Subtração"
				+ "\n3 - Multiplicação"
				+ "\n4 - Divisão"
				+ "\n5 - Potenciação"
				+ "\n6 - Porcentagem"
				+ "\n7 - Raiz quadrada"
				+ "\n0 - Sair"
				+ "\nEscolha uma opção: ");
		int operacao = sc.nextInt();

		if (operacao == 0) {
			System.out.println("Obrigado por usar a calculadora!");
			System.exit(operacao);
		}

		System.out.print("Quantos números você digitará?(Mín:1 e Max:5) ");
		int nNum = sc.nextInt();
		
		informarNum(operacao, nNum);
		
	}

	private static void informarNum(int operacao, int nNum) {
		
		for (int i = 0; i < nNum; i++) {
			System.out.print("Informe o " + (i + 1) + "º número: ");
			double num = sc.nextDouble();
			switch (operacao) {
			case 1:
				c.soma(num);
				break;
			case 2:
				c.subtrai(num, i);
				break;
			case 3:
				c.multi(num, i);
				break;
			case 4:
				c.divi(num);
				break;
			case 5:
				c.potenc(num);
				break;
			case 6:
				c.porct(num);
				break;
			case 7:
				c.raiz(num);
				break;
			default:
				System.out.println("Operação incorreta!");
				break;
			}
		}
		
	}

}