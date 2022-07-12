import java.util.Scanner;

public class ex_k {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um valor de hora: ");
		int hora = sc.nextInt();

		System.out.print("Insira um valor de minutos: ");
		int min = sc.nextInt();

		System.out.println("A hora convertida em minutos é: " + (hora*60));
		System.out.println("O total de minutos é: " + (min + (hora*60)));
		System.out.println("O total de segundos é: " + ((min + (hora*60)))*60);

		sc.close();

	}

}
