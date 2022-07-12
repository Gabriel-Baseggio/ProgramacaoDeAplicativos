import java.util.Scanner;

public class ex_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Insira um número: ");
		num = sc.nextInt();
		
		System.out.println("A terça parte desse número é " + (num/3));
		
		sc.close();

	}

}
