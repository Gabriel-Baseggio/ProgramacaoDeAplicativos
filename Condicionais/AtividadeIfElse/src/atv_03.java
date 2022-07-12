import java.util.Scanner;

public class atv_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---Primeira Data---");
		System.out.print("Dia: ");
		int dia1 = sc.nextInt();
		System.out.print("Mês: ");
		int mes1 = sc.nextInt();
		System.out.print("Ano: ");
		int ano1 = sc.nextInt();
		
		System.out.println("---Segunda Data---");
		System.out.print("Dia: ");
		int dia2 = sc.nextInt();
		System.out.print("Mês: ");
		int mes2 = sc.nextInt();
		System.out.print("Ano: ");
		int ano2 = sc.nextInt();
		
		sc.close();
		
		String data1 = dia1 + "/" + mes1 + "/" + ano1 + " é a maior";
		String data2 = dia2 + "/" + mes2 + "/" + ano2 + " é a maior";
		
		if(ano1 > ano2) {
			System.out.println(data1);
		} else if(ano2 > ano1) {
			System.out.println(data2);
		} else if(mes1 > mes2) {
			System.out.println(data1);
		} else if(mes1 < mes2) {
			System.out.println(data2);
		} else if(dia1 > dia2) {
			System.out.println(data1);
		} else if(dia1 < dia2) {
			System.out.println(data2);
		} else {
			System.out.println("As duas datas são iguais");
		}
				
	}

}
