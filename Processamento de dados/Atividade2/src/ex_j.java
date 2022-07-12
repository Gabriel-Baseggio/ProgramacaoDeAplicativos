import java.util.Scanner;

public class ex_j {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double dolar = 0.2, euro = 0.19, libra = 0.16;
		
		System.out.print("Insira o valor de reais que você levará: ");
		double real = sc.nextDouble();

		System.out.println("Conversão para Dólares: $" + (real * dolar));
		System.out.println("Conversão para Euros: €" + (real * euro));
		System.out.println("Conversão para Libras Esterlinas: £" + (real * libra));

		sc.close();
		
	}

}
