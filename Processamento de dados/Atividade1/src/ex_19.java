import java.util.Scanner;

public class ex_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int media1, media2, soma, media;
		
		media1 = (8 + 9 + 7) / 3;
		System.out.println("M�dia de 8, 9 e 7: " + media1);
		
		media2 = (4 + 5 + 6) / 3;
		System.out.println("M�dia de 4, 5 e 6: " + media2);
		
		soma = media1 + media2;
		System.out.println("Soma das m�dias: " + soma);
		
		media = soma / 2;
		System.out.println("M�dia das m�dias: " + media);
		
		sc.close();

	}
	
}
