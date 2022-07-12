import java.util.Scanner;

public class atv_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double salMin = 1212.0, salTotal = 0, maiorSal = 0;
		int pecasTotal = 0, pecasMasc = 0, numMasc = 0, pecasFem = 0, numFem = 0, numMaiorSal = 0;

		for (int i = 1; i <= 15; i++) {
			double salOper = 0;
			
			System.out.print("Informe o número do " + i + "º operário: ");
			int num = sc.nextInt();
			System.out.print("Informe o número de peças fabricadas no mês do " + i + "º operário: ");
			int pecas = sc.nextInt();
			System.out.print("Informe o sexo do " + i + "º operário(1 - Masculino ou 2 - Feminino): ");
			int sexo = sc.nextInt();

			if (pecas <= 30) {
				salOper = salMin;
			} else if(pecas > 30 && pecas <= 50) {
				salOper = salMin + ((pecas-30)*(salMin*0.03));
			} else if(pecas > 50) {
				salOper = salMin + ((pecas-30)*(salMin*0.05));
			}
			
			if(sexo == 1) {
				pecasMasc += pecas;
				numMasc++;
			} else if(sexo == 2) {
				pecasFem += pecas;
				numFem++;
			}
			
			if(salOper > maiorSal) {
				maiorSal = salOper;
				numMaiorSal = num;
			}
			
			salTotal += salOper;
			pecasTotal += pecas;
			
			System.out.println("O operário " + num + " receberá: R$" + salOper);
		}

		System.out.println("Total folha de pagamento da fábrica: R$" + salTotal);
		System.out.println("Total peças produzidas: " + pecasTotal);
		System.out.println("Média de peças por homem: " + (pecasMasc/numMasc));
		System.out.println("Média de peças por mulher: " + (pecasFem/numFem));
		System.out.println("O operário " + numMaiorSal + " foi o que teve maior salário, um salário de R$" + maiorSal);
		
		

		sc.close();

	}

}
