import java.util.Scanner;

public class atv_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Menu de op��es:\n1. Somar dois n�meros\n2. Raiz quadrada de um n�mero.\n"
				+ "Digite a op��o desejada: ");
		int opcao = sc.nextInt();
		
		System.out.print("Informe um n�mero inteiro: ");
		int num1 = sc.nextInt();
		
		if(opcao == 1) {
			System.out.print("Informe outro n�mero inteiro: ");
			int num2 = sc.nextInt();
			System.out.println("A soma dos dois �: " + (num1 + num2));
		} else if(opcao == 2){
			System.out.println("A ra�z quadrada desse n�mero �: " + Math.sqrt(num1));
		} else {
			System.out.println("Op��o inv�lida");
			System.exit(0);
		}
		
		sc.close();

	}

}
