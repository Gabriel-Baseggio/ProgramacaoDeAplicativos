import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Código do produto: ");
		int codProd = sc.nextInt();

		System.out.print("Peso em quilos do produto: ");
		double peso = sc.nextDouble();

		peso *= 1000;
		
		System.out.print("Código do país de origem: ");
		int codPais = sc.nextInt();

		sc.close();

		double imposto = 0, precoPeso = 0, precoTotal = 0, valImposto = 0;

		if(codProd <= 4 && codProd >= 1) {
			precoPeso = peso*10;
		} else if(codProd >= 5 && codProd <= 7) {
			precoPeso = peso*25;
		} else if(codProd >= 8 && codProd <= 10) {
			precoPeso = peso*35;
		} else {
			System.out.println("Código de produto incorreto!");
		}
		
		switch (codPais) {
		case 1:
			imposto = 0;
			break;
		case 2:
			imposto = 0.15;
			break;
		case 3:
			imposto = 0.25;
			break;
		default:
			System.out.println("Código de origem incorreto!");
			break;
		}
		
		valImposto = precoPeso*imposto;
		precoTotal = precoPeso+valImposto;
		
		System.out.println("Peso do produto: " + (peso/1000));
		System.out.println("Preço do produto: " + precoPeso);
		System.out.println("Imposto sobre o produto: " + valImposto);
		System.out.println("Preço total do produto: " + precoTotal);

	}

}
