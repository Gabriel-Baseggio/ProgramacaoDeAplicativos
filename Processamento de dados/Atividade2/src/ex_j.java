import java.util.Scanner;

public class ex_j {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double dolar = 0.2, euro = 0.19, libra = 0.16;
		
		System.out.print("Insira o valor de reais que voc� levar�: ");
		double real = sc.nextDouble();

		System.out.println("Convers�o para D�lares: $" + (real * dolar));
		System.out.println("Convers�o para Euros: �" + (real * euro));
		System.out.println("Convers�o para Libras Esterlinas: �" + (real * libra));

		sc.close();
		
	}

}
