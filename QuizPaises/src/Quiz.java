import java.util.Scanner;

// Dupla: Matheus Hohmann e Gabriel Baseggio
// Turma: 2932
// Quiz sobre Pa�ses 

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declara��o das vari�veis
		int contador = 1, saberResp = 0, correto = 0, p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
		String nome = "", classificacao = "";

		// Informar o nome do usu�rio e colocar na vari�vel
		System.out.print("Ol� Usu�rio, informe seu nome para continuarmos ao Quiz \n> ");
		nome = sc.next();

		// Repeti��o do jogo caso o contador seja diferente que 0 (usu�rio respondeu que
		// n�o quer finalizar)
		while (contador != 0) {
			System.out.println("\n--- QUIZ SOBRE PA�SES ---");
			// Informando as op��es de dificuldade ao usu�rio
			System.out.print(nome + ", selecione o n�vel das perguntas do Quiz:" + "\n1 - Nivel 1" + "\n2 - N�vel 2"
					+ "\n3 - N�vel 3" + "\n4 - Finalizar Quiz" + "\n> ");
			int opcao = sc.nextInt();

			// Switch segundo a op��o de dificuldade que o usu�rio escolheu
			switch (opcao) {
			case 1:
				System.out.println("--- N�VEL 1 ---");

				System.out.print("Primeira pergunta:\n" + "\nQual a capital do Acre?" + "\n1 - Porto Velho"
						+ "\n2 - Boa vista" + "\n3 - Rio Branco" + "\n4 - S�o Lu�s" + "\n5 - Acrel�ndia" + "\n> ");
				p1 = sc.nextInt();
				// Verifica��o se a resposta est� correta
				if (p1 == 3) {
					// Se estiver correta incrementa 1 no contador de corretas
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Segunda pergunta:\n" + "\nQue pa�s possue o formato de uma bota?" + "\n1 - It�lia"
						+ "\n2 - Fran�a" + "\n3 - Dinamarca" + "\n4 - Col�mbia" + "\n5 - Cuba" + "\n> ");
				p2 = sc.nextInt();
				if (p2 == 1) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Terceira pergunta:\n" + "\nOnde se localiza Machu Picchu?" + "\n1 - Col�mbia"
						+ "\n2 - Peru" + "\n3 - Chile" + "\n4 - Bol�via" + "\n5 - Venezuela" + "\n> ");
				p3 = sc.nextInt();
				if (p3 == 2) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print(
						"Quarta pergunta:\n" + "\nEm que pa�s foi constru�do o Muro de Berlim?" + "\n1 - Alemanha"
								+ "\n2 - Israel" + "\n3 - R�ssia" + "\n4 - Pol�nia" + "\n5 - Argentina" + "\n> ");
				p4 = sc.nextInt();
				if (p4 == 1) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Quinta pergunta:\n" + "\nQual o menor e maior pa�s, respectivamente?"
						+ "\n1 - Vaticano e R�ssia" + "\n2 - Nauru e China" + "\n3 - M�naco e Canad�"
						+ "\n4 - Malta e Estados Unidos" + "\n5 - S�o Marino e Canad�" + "\n> ");
				p5 = sc.nextInt();
				if (p5 == 1) {
					correto++;
				}

				// Verifca��o para atribuir uma classifica��o ao usu�rio, conforme sua pontua��o
				if (correto == 5) {
					classificacao = "Muito Bom";
				} else if (correto == 4) {
					classificacao = "Bom";
				} else if (correto == 3) {
					classificacao = "Na m�dia";
				} else if (correto == 2) {
					classificacao = "Abaixo da m�dia";
				} else if (correto == 1) {
					classificacao = "Ruim";
				} else {
					classificacao = "Muito Ruim";
				}

				// Sa�da na tela com a quantidade de quest�es correteas e sua classifica��o
				System.out.println(nome + ", sua pontua��o no N�vel " + opcao + " foi: " + correto
						+ "/5 \nSegundo nosso quiz, seu n�vel de conhecimento �: " + classificacao);

				// Pergunta pro usu�rio se ele gostaria de saber as respostas
				System.out.print("Voc� gostaria de saber as respostas corretas?" + "\n1 - Sim" + "\n2 - N�o" + "\n> ");
				saberResp = sc.nextInt();

				// Se ele quiser saber as respostas informar
				if (saberResp == 1) {
					// Informar as respostas
					System.out.println(
							"Quest�o 1 -> 3 - Rio Branco" + "\nQuest�o 2 -> 1 - It�lia" + "\nQuest�o 3 -> 2 - Peru"
									+ "\nQuest�o 4 -> 1 - Alemanha" + "\nQuest�o 5 -> 1 - Vaticano e R�ssia");
				}

				break;
			case 2:
				System.out.println("--- N�VEL 2 ---");

				System.out.print("Primeira pergunta:\n" + "\nQual pa�s possui a maior expectativa de vida?"
						+ "\n1 - Austr�lia" + "\n2 - Estados Unidos" + "\n3 - Jap�o" + "\n4 - Dinamarca"
						+ "\n5 - Alemanha" + "\n> ");
				p1 = sc.nextInt();
				if (p1 == 3) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Segunda pergunta:\n" + "\nQuais destas constru��es famosas ficam nos Estados Unidos?"
						+ "\n1 - Est�tua da Liberdade, Golden State Bridge e Empire State Building"
						+ "\n2 - Est�tua da Liberdade, Big Ben e The High Line"
						+ "\n3 - Angkor Wat, Taj Mahal e Skywalk no Grand Canyon"
						+ "\n4 - Lincoln Memorial, Sidney Opera House e Burj Khalifa"
						+ "\n5 - 30 St Mary Axe, The High Line e Residencial 148 Spruce Street" + "\n> ");
				p2 = sc.nextInt();
				if (p2 == 1) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Terceira pergunta:\n" + "\nCom que dois pa�ses faz fronteira o Equador?"
						+ "\n1 - Brasil e Col�mbia" + "\n2 - Col�mbia e Venezuela" + "\n3 - Col�mbia e Peru"
						+ "\n4 - Peru e Equador" + "\n5 - Equador e Brasil" + "\n> ");
				p3 = sc.nextInt();
				if (p3 == 3) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Quarta pergunta:\n" + "\nQual � o maior arquip�lago da Terra?" + "\n1 - Filipinas"
						+ "\n2 - Indon�sia" + "\n3 - Bahamas" + "\n4 - Finl�ndia" + "\n5 - Maldivas" + "\n> ");
				p4 = sc.nextInt();
				if (p4 == 2) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Quinta pergunta:\n" + "\nQual desses n�o � uma cidade localizada na Argentina?" + "\n1 - Ros�rio"
						+ "\n2 - Mendonza" + "\n3 - Santa F�" + "\n4 - San Juan" + "\n5 - Barranquila" + "\n> ");
				p5 = sc.nextInt();
				if (p5 == 5) {
					correto++;
				}

				if (correto == 5) {
					classificacao = "Muito Bom";
				} else if (correto == 4) {
					classificacao = "Bom";
				} else if (correto == 3) {
					classificacao = "Na m�dia";
				} else if (correto == 2) {
					classificacao = "Abaixo da m�dia";
				} else if (correto == 1) {
					classificacao = "Ruim";
				} else {
					classificacao = "Muito Ruim";
				}

				// Sa�da na tela com a quantidade de quest�es correteas e sua classifica��o
				System.out.println(nome + ", sua pontua��o no N�vel " + opcao + " foi: " + correto
						+ "/5 \nSegundo nosso quiz, seu n�vel de conhecimento �: " + classificacao);

				// Pergunta pro usu�rio se ele gostaria de saber as respostas
				System.out.print("Voc� gostaria de saber as respostas corretas?" + "\n1 - Sim" + "\n2 - N�o" + "\n> ");
				saberResp = sc.nextInt();

				// Se ele quiser saber as respostas informar
				if (saberResp == 1) {
					// Informar as respostas
					System.out.println("Quest�o 1 -> 3 - Jap�o"
							+ "\nQuest�o 2 -> 1 - Est�tua da Liberdade, Golden State Bridge e Empire State Building"
							+ "\nQuest�o 3 -> 3 - Col�mbia e Peru" + "\nQuest�o 4 -> 2 - Indon�sia"
							+ "\nQuest�o 5 -> 5 - Barranquila");
				}

				break;
			case 3:
				System.out.println("--- N�VEL 3 ---");

				System.out.print("Primeira pergunta:\n" + "\nQual das alternativas menciona apenas s�mbolos nacionais?"
						+ "\n1 - Bandeira ins�gnia da presid�ncia, bandeira nacional, bras�o, hinos e selo"
						+ "\n2 - Bandeira nacional, armas nacionais, hino nacional e selo nacional"
						+ "\n3 - Bandeira nacional, bras�o, hino nacional e hino da independ�ncia"
						+ "\n4 - Bandeira nacional, cores nacionais, hino nacional e hino da independ�ncia"
						+ "\n5 - Bandeira ins�gnia da presid�ncia, bras�o flora e fauna e hinos" + "\n> ");
				p1 = sc.nextInt();
				if (p1 == 2) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Segunda pergunta:\n" + "\nEm que estado australiano fica situada a cidade de Sydney?"
						+ "\n1 - Nova Gales do Sul" + "\n2 - Victoria" + "\n3 - Tasm�nia" + "\n4 - Queensland"
						+ "\n5 - Norfolk" + "\n> ");
				p2 = sc.nextInt();
				if (p2 == 1) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Terceira pergunta:\n"
						+ "\nEm que cidade ocorreu a Eco-92, a Confer�ncia das Na��es Unidas sobre ambiente e desenvolvimento?"
						+ "\n1 - Buenos Aires" + "\n2 - Rio de Janeiro" + "\n3 - Montevid�u " + "\n4 - Assun��o"
						+ "\n5 - Caracas" + "\n> ");
				p3 = sc.nextInt();
				if (p3 == 2) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Quarta pergunta:\n" + "\nEm qual local da �sia o portugu�s � a l�ngua oficial?"
						+ "\n1 - Portugal" + "\n2 - �ndia" + "\n3 - Filipinas " + "\n4 - Macau" + "\n5 - Mo�ambique"
						+ "\n> ");
				p4 = sc.nextInt();
				if (p4 == 4) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Quinta pergunta:\n" + "\nQual destes pa�ses � transcontinental?" + "\n1 - R�ssia"
						+ "\n2 - Filipinas" + "\n3 - Marrocos " + "\n4 - Groenl�ndia" + "\n5 - Tanz�nia" + "\n> ");
				p5 = sc.nextInt();
				if (p5 == 1) {
					correto++;
				}

				if (correto == 5) {
					classificacao = "Muito bom";
				} else if (correto == 4) {
					classificacao = "Bom";
				} else if (correto == 3) {
					classificacao = "Na m�dia";
				} else if (correto == 2) {
					classificacao = "Abaixo da m�dia";
				} else if (correto == 1) {
					classificacao = "Ruim";
				} else {
					classificacao = "Muito Ruim";
				}

				// Sa�da na tela com a quantidade de quest�es correteas e sua classifica��o
				System.out.println(nome + ", sua pontua��o no N�vel " + opcao + " foi: " + correto
						+ "/5 \nSegundo nosso quiz, seu n�vel de conhecimento �: " + classificacao);

				// Pergunta pro usu�rio se ele gostaria de saber as respostas
				System.out.print("Voc� gostaria de saber as respostas corretas?" + "\n1 - Sim" + "\n2 - N�o" + "\n> ");
				saberResp = sc.nextInt();

				// Se ele quiser saber as respostas informar
				if (saberResp == 1) {
					// Informar as respostas
					System.out.println(
							"Quest�o 1 -> 2 - Bandeira nacional, armas nacionais, hino nacional e selo nacional"
									+ "\nQuest�o 2 -> 1 - Nova Gales do Sul" + "\nQuest�o 3 -> 2 - Rio de Janeiro"
									+ "\nQuest�o 4 -> 4 - Macau" + "\nQuest�o 5 -> 1 - R�ssia");
				}

				break;
			case 4:
				// Finaliza��o do programa caso a op��o for 4 (Quer finalizar o quiz)
				contador = 0;
				break;
			default:
				// Caso o usu�rio informar uma op��o diferente das dispon�veis ele informa a
				// mensagem de dificuldade inv�lida
				System.out.println("Dificuldade inv�lida!");
			}

			// Reiniciando o valor da vari�vel caso ele queira responder novamente o quiz
			correto = 0;
		}
		sc.close();
	}
}
