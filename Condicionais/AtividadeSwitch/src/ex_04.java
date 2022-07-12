import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor da compra: R$");
		double compra = sc.nextDouble();

		System.out.print("Opções de Pagamento:"
				+ "\n1 - À vista(15% de desconto)"
				+ "\n2 - Cheque pré-datado para 30 dias()10% de desconto"
				+ "\n3 - Parcelado em 6 vezes(Sem desconto)"
				+ "\n4 - Percelado em 12 vezes(8% de acréscimo)"
				+ "\nEscolha sua opção: ");
		int opc = sc.nextInt();
		
		double valFinal = 0, valParc= 0, qtdParc = 0;  
		
		switch(opc) {
		case 1:
			valFinal = compra*0.85;
			break;
		case 2:
			valFinal = compra*0.9;
			break;
		case 3:
			valFinal = compra;
			valParc = valFinal/6;
			qtdParc = 6;
			break;
		case 4:
			valFinal = compra*1.08;
			valParc = valFinal/12;
			qtdParc = 12;
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		System.out.println("Valor total da compra: R$" + compra);
		System.out.println("Valor final da compra: R$" + valFinal);
		if((valFinal-compra) > 0) {
			System.out.println("O juros foi de: R$" + (valFinal-compra));
		} else if((valFinal-compra) < 0) {
			System.out.println("O desconto foi de: R$" + Math.abs((valFinal-compra)));
		}
		if(qtdParc > 0) {
			System.out.println("Número de parcelas: " + qtdParc);
			System.out.println("Valor de cada parcela: " + valParc);
		}
		
		sc.close();

	}

}
