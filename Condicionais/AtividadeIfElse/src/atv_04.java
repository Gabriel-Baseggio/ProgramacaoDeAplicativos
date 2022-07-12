import java.util.Scanner;

public class atv_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaDur, minDur;
		
		System.out.print("Hora de início: ");
		int hora1 = sc.nextInt();
		System.out.print("Minuto de início: ");
		int min1 = sc.nextInt();
		
		System.out.print("Hora de término: ");
		int hora2 = sc.nextInt();
		System.out.print("Minuto de término: ");
		int min2 = sc.nextInt();

		sc.close();
		
		if(hora1 < hora2) {
			horaDur = hora2 - hora1;
		} else if(hora1 > hora2) {
			horaDur = 24 - (hora1 - hora2);
		} else {
			horaDur = 24;
		}
		
		if(min1 < min2) {
			minDur = min2 - min1;
		} else if(min1 > min2) {
			horaDur--;
			minDur = 60 - (min1 - min2);
		} else {
			minDur = 0;
		}
		
		System.out.println("O jogo durou " + horaDur + "h e " + minDur + "min");
		
	}

}
