import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Código do funcionário: ");
		int cod = sc.nextInt();

		System.out.print("Salário do funcionário: ");
		double sal = sc.nextDouble();
		
		sc.close();
		
		String cargo = "";
		double aumento = 0, novoSal = 0;

		switch (cod) {
		case 1:
			cargo = "Escrituário";
			aumento = sal*0.5;
			novoSal = sal+aumento;
			break;
		case 2:
			cargo = "Secretário";
			aumento = sal*0.35;
			novoSal = sal+aumento;
			break;
		case 3:
			cargo = "Caixa";
			aumento = sal*0.2;
			novoSal = sal+aumento;
			break;
		case 4:
			cargo = "Gerente";
			aumento = sal*0.1;
			novoSal = sal+aumento;
			break;
		case 5:
			cargo = "Diretor";
			aumento = sal*0;
			novoSal = sal+aumento;
			break;
		default:
			System.out.println("Código incorreto!");
			break;
		}
		
		System.out.println("Cargo: " + cargo);
		System.out.println("Aumento: " + aumento);
		System.out.println("Novo salário: " + novoSal);
		
	}

}
