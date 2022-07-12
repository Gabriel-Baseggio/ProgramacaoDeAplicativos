import java.util.Scanner;

public class atv_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Menu de opções:\n1. Somar dois números\n2. Raiz quadrada de um número.\n"
				+ "Digite a opção desejada: ");
		int opcao = sc.nextInt();
		
		System.out.print("Informe um número inteiro: ");
		int num1 = sc.nextInt();
		
		if(opcao == 1) {
			System.out.print("Informe outro número inteiro: ");
			int num2 = sc.nextInt();
			System.out.println("A soma dos dois é: " + (num1 + num2));
		} else if(opcao == 2){
			System.out.println("A raíz quadrada desse número é: " + Math.sqrt(num1));
		} else {
			System.out.println("Opção inválida");
			System.exit(0);
		}
		
		sc.close();

	}

}
