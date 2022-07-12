import java.util.Scanner;

public class ex_g {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um número inteiro: ");
		int x = sc.nextInt();

		System.out.println("1 x " + x + " = " + (x*1));
		System.out.println("2 x " + x + " = " + (x*2));
		System.out.println("3 x " + x + " = " + (x*3));
		System.out.println("4 x " + x + " = " + (x*4));
		System.out.println("5 x " + x + " = " + (x*5));
		System.out.println("6 x " + x + " = " + (x*6));
		System.out.println("7 x " + x + " = " + (x*7));
		System.out.println("8 x " + x + " = " + (x*8));
		System.out.println("9 x " + x + " = " + (x*9));
		System.out.println("10 x " + x + " = " + (x*10));

		sc.close();

	}

}
