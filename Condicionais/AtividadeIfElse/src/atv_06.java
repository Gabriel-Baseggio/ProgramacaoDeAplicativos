import java.util.Scanner;

public class atv_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Menu de op��es:\n"
				+ "1. Imposto\n"
				+ "2. Novo sal�rio\n"
				+ "3. Classifica��o\n"
				+ "Digite a op��o desejada: ");		
		int opcao = sc.nextInt();
		
		System.out.print("Informe o sal�rio: ");
		double salario = sc.nextDouble();
		
		sc.close();
		
		double valImp = 0; 
		
		if(opcao == 1) {
			if(salario < 500) {
				valImp = salario*0.05;
			} else if(salario >= 500 && salario <= 850) {
				valImp = salario*0.1;
			} else if(salario > 850) {
				valImp = salario*0.15;
			}
			System.out.println("O valor do imposto � " + valImp);
		} else if(opcao == 2) {
			if(salario > 1500) {
				System.out.println("O novo sal�rio ser� de: R$" + (salario+25));
			} else if(salario <= 1500 && salario > 750) {
				System.out.println("O novo sal�rio ser� de: R$" + (salario+50));
			} else if(salario < 750 && salario <= 450) {
				System.out.println("O novo sal�rio ser� de: R$" + (salario+75));
			} else if(salario < 450) {
				System.out.println("O novo sal�rio ser� de: R$" + (salario+100));
			}
		} else if(opcao == 3) {
			if(salario <= 700) {
				System.out.println("Mal remunerado");
			} else if(salario > 700) {
				System.out.println("Bem remunerado");
			}
		}
		
	}

}
