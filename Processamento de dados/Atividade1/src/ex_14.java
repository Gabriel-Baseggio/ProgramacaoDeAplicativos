import java.util.Scanner;

public class ex_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Insira um n�mero: ");
		num = sc.nextInt();
		
		System.out.println("A ter�a parte desse n�mero � " + (num/3));
		
		sc.close();

	}

}
