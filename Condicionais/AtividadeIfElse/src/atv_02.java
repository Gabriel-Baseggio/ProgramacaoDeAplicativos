import java.util.Scanner;

public class atv_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String mesExtenso = null;
		
		System.out.print("Informe o dia atual: ");
		int dia = sc.nextInt();

		System.out.print("Informe o mês atual: ");
		int mes = sc.nextInt();

		System.out.print("Informe o ano atual: ");
		int ano = sc.nextInt();

		System.out.print("Informe a hora atual: ");
		int hora = sc.nextInt();

		System.out.print("Informe o minuto atual: ");
		int minuto = sc.nextInt();
		
		sc.close();
		
		if(mes == 1) {
			mesExtenso = "Janeiro";
		} else if(mes == 2) {
			mesExtenso = "Fevereiro";
		} else if(mes == 3) {
			mesExtenso = "Março";
		} else if(mes == 4) {
			mesExtenso = "Abril";
		} else if(mes == 5) {
			mesExtenso = "Maio";
		} else if(mes == 6) {
			mesExtenso = "Junho";
		} else if(mes == 7) {
			mesExtenso = "Julho";
		} else if(mes == 8) {
			mesExtenso = "Agosto";
		} else if(mes == 9) {
			mesExtenso = "Setembro";
		} else if(mes == 10) {
			mesExtenso = "Outubro";
		} else if(mes == 11) {
			mesExtenso = "Novembro";
		} else if(mes == 12){
			mesExtenso = "Dezembro";
		} else {
			System.out.println("Mês inválido");
			System.exit(0);
		}
		
		System.out.println(dia + "/" + mesExtenso + "/" + ano + ", " + hora + ":" + minuto);

	}

}
	