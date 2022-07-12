import java.util.Scanner;

public class ex_11 {

	public static void main(String[] args) {
		
		String nome, endereco, telefone;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		nome = sc.next();
		
		System.out.print("Informe seu endereço: ");
		endereco = sc.next();
		
		System.out.print("Informe seu telefone: ");
		telefone = sc.next();

		System.out.println(nome);
		System.out.println(endereco);
		System.out.println(telefone);
		
		sc.close();
		
	}

}
