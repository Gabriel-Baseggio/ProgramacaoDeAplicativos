import java.util.Scanner;

public class atv_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double salMin = 1212.0, salTotal = 0, maiorSal = 0;
		int pecasTotal = 0, pecasMasc = 0, numMasc = 0, pecasFem = 0, numFem = 0, numMaiorSal = 0;

		for (int i = 1; i <= 15; i++) {
			double salOper = 0;
			
			System.out.print("Informe o n�mero do " + i + "� oper�rio: ");
			int num = sc.nextInt();
			System.out.print("Informe o n�mero de pe�as fabricadas no m�s do " + i + "� oper�rio: ");
			int pecas = sc.nextInt();
			System.out.print("Informe o sexo do " + i + "� oper�rio(1 - Masculino ou 2 - Feminino): ");
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
			
			System.out.println("O oper�rio " + num + " receber�: R$" + salOper);
		}

		System.out.println("Total folha de pagamento da f�brica: R$" + salTotal);
		System.out.println("Total pe�as produzidas: " + pecasTotal);
		System.out.println("M�dia de pe�as por homem: " + (pecasMasc/numMasc));
		System.out.println("M�dia de pe�as por mulher: " + (pecasFem/numFem));
		System.out.println("O oper�rio " + numMaiorSal + " foi o que teve maior sal�rio, um sal�rio de R$" + maiorSal);
		
		

		sc.close();

	}

}
