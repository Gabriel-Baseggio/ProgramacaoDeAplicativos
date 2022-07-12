import java.util.Scanner;

public class atv_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o salário do Carlos: ");
		double salCarlos = sc.nextDouble();

		sc.close();

		double salJoao = salCarlos / 3;
		int i = 0;

		while (salJoao < salCarlos) {
			salCarlos *= 1.02;
			salJoao *= 1.05;
			i++;
		}

		System.out.println("Levará " + i
				+ " meses para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos");

	}

}
