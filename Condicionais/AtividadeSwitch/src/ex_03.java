import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Número de livros: ");
		int qtd = sc.nextInt();
		
		sc.close();
		
		double descA = (0.25*qtd)+7.5;
		double descB = (0.5*qtd)+2.5;
		
		if(descA < descB) {
			System.out.println("Você deve escolher o desconto A");
		} else if(descA > descB) {
			System.out.println("Você deve escolher o desconto B");
		} else {
			System.out.println("Pode escolher qualquer um, os dois têm o mesmo desconto.");
		}
		
		
	}

}
