import java.util.Scanner;

public class ex_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int anos, meses, dias, idade;
		
		System.out.print("Insira quantos anos voc� tem: ");
		anos = sc.nextInt();
		
		System.out.print("Insira quantos meses voc� tem: ");
		meses = sc.nextInt();

		System.out.print("Insira quantos dias voc� tem: ");
		dias = sc.nextInt();
		
		idade = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Sua idade expressa em dias � " + idade);
		
		
		sc.close();

	}

}
