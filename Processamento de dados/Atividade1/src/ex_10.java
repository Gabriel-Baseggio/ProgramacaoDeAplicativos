import java.util.Scanner;

public class ex_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Insira um n�mero: ");
		num = sc.nextInt();
		
		System.out.println("O antecessor desse n�mero � " + (num - 1));
		System.out.println("O sucessor desse n�mero � " + (num + 1));
		
		sc.close();

	}

}
