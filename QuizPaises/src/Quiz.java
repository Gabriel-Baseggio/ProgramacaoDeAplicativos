import java.util.Scanner;

// Dupla: Matheus Hohmann e Gabriel Baseggio
// Turma: 2932
// Quiz sobre Países 

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declaração das variáveis
		int contador = 1, saberResp = 0, correto = 0, p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
		String nome = "", classificacao = "";

		// Informar o nome do usuário e colocar na variável
		System.out.print("Olá Usuário, informe seu nome para continuarmos ao Quiz \n> ");
		nome = sc.next();

		// Repetição do jogo caso o contador seja diferente que 0 (usuário respondeu que
		// não quer finalizar)
		while (contador != 0) {
			System.out.println("\n--- QUIZ SOBRE PAÍSES ---");
			// Informando as opções de dificuldade ao usuário
			System.out.print(nome + ", selecione o nível das perguntas do Quiz:" + "\n1 - Nivel 1" + "\n2 - Nível 2"
					+ "\n3 - Nível 3" + "\n4 - Finalizar Quiz" + "\n> ");
			int opcao = sc.nextInt();

			// Switch segundo a opção de dificuldade que o usuário escolheu
			switch (opcao) {
			case 1:
				System.out.println("--- NÍVEL 1 ---");

				System.out.print("Primeira pergunta:\n" + "\nQual a capital do Acre?" + "\n1 - Porto Velho"
						+ "\n2 - Boa vista" + "\n3 - Rio Branco" + "\n4 - São Luís" + "\n5 - Acrelândia" + "\n> ");
				p1 = sc.nextInt();
				// Verificação se a resposta está correta
				if (p1 == 3) {
					// Se estiver correta incrementa 1 no contador de corretas
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Segunda pergunta:\n" + "\nQue país possue o formato de uma bota?" + "\n1 - Itália"
						+ "\n2 - França" + "\n3 - Dinamarca" + "\n4 - Colômbia" + "\n5 - Cuba" + "\n> ");
				p2 = sc.nextInt();
				if (p2 == 1) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Terceira pergunta:\n" + "\nOnde se localiza Machu Picchu?" + "\n1 - Colômbia"
						+ "\n2 - Peru" + "\n3 - Chile" + "\n4 - Bolívia" + "\n5 - Venezuela" + "\n> ");
				p3 = sc.nextInt();
				if (p3 == 2) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print(
						"Quarta pergunta:\n" + "\nEm que país foi construído o Muro de Berlim?" + "\n1 - Alemanha"
								+ "\n2 - Israel" + "\n3 - Rússia" + "\n4 - Polônia" + "\n5 - Argentina" + "\n> ");
				p4 = sc.nextInt();
				if (p4 == 1) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Quinta pergunta:\n" + "\nQual o menor e maior país, respectivamente?"
						+ "\n1 - Vaticano e Rússia" + "\n2 - Nauru e China" + "\n3 - Mônaco e Canadá"
						+ "\n4 - Malta e Estados Unidos" + "\n5 - São Marino e Canadá" + "\n> ");
				p5 = sc.nextInt();
				if (p5 == 1) {
					correto++;
				}

				// Verifcação para atribuir uma classificação ao usuário, conforme sua pontuação
				if (correto == 5) {
					classificacao = "Muito Bom";
				} else if (correto == 4) {
					classificacao = "Bom";
				} else if (correto == 3) {
					classificacao = "Na média";
				} else if (correto == 2) {
					classificacao = "Abaixo da média";
				} else if (correto == 1) {
					classificacao = "Ruim";
				} else {
					classificacao = "Muito Ruim";
				}

				// Saída na tela com a quantidade de questões correteas e sua classificação
				System.out.println(nome + ", sua pontuação no Nível " + opcao + " foi: " + correto
						+ "/5 \nSegundo nosso quiz, seu nível de conhecimento é: " + classificacao);

				// Pergunta pro usuário se ele gostaria de saber as respostas
				System.out.print("Você gostaria de saber as respostas corretas?" + "\n1 - Sim" + "\n2 - Não" + "\n> ");
				saberResp = sc.nextInt();

				// Se ele quiser saber as respostas informar
				if (saberResp == 1) {
					// Informar as respostas
					System.out.println(
							"Questão 1 -> 3 - Rio Branco" + "\nQuestão 2 -> 1 - Itália" + "\nQuestão 3 -> 2 - Peru"
									+ "\nQuestão 4 -> 1 - Alemanha" + "\nQuestão 5 -> 1 - Vaticano e Rússia");
				}

				break;
			case 2:
				System.out.println("--- NÍVEL 2 ---");

				System.out.print("Primeira pergunta:\n" + "\nQual país possui a maior expectativa de vida?"
						+ "\n1 - Austrália" + "\n2 - Estados Unidos" + "\n3 - Japão" + "\n4 - Dinamarca"
						+ "\n5 - Alemanha" + "\n> ");
				p1 = sc.nextInt();
				if (p1 == 3) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Segunda pergunta:\n" + "\nQuais destas construções famosas ficam nos Estados Unidos?"
						+ "\n1 - Estátua da Liberdade, Golden State Bridge e Empire State Building"
						+ "\n2 - Estátua da Liberdade, Big Ben e The High Line"
						+ "\n3 - Angkor Wat, Taj Mahal e Skywalk no Grand Canyon"
						+ "\n4 - Lincoln Memorial, Sidney Opera House e Burj Khalifa"
						+ "\n5 - 30 St Mary Axe, The High Line e Residencial 148 Spruce Street" + "\n> ");
				p2 = sc.nextInt();
				if (p2 == 1) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Terceira pergunta:\n" + "\nCom que dois países faz fronteira o Equador?"
						+ "\n1 - Brasil e Colômbia" + "\n2 - Colômbia e Venezuela" + "\n3 - Colômbia e Peru"
						+ "\n4 - Peru e Equador" + "\n5 - Equador e Brasil" + "\n> ");
				p3 = sc.nextInt();
				if (p3 == 3) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Quarta pergunta:\n" + "\nQual é o maior arquipélago da Terra?" + "\n1 - Filipinas"
						+ "\n2 - Indonésia" + "\n3 - Bahamas" + "\n4 - Finlândia" + "\n5 - Maldivas" + "\n> ");
				p4 = sc.nextInt();
				if (p4 == 2) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Quinta pergunta:\n" + "\nQual desses não é uma cidade localizada na Argentina?" + "\n1 - Rosário"
						+ "\n2 - Mendonza" + "\n3 - Santa Fé" + "\n4 - San Juan" + "\n5 - Barranquila" + "\n> ");
				p5 = sc.nextInt();
				if (p5 == 5) {
					correto++;
				}

				if (correto == 5) {
					classificacao = "Muito Bom";
				} else if (correto == 4) {
					classificacao = "Bom";
				} else if (correto == 3) {
					classificacao = "Na média";
				} else if (correto == 2) {
					classificacao = "Abaixo da média";
				} else if (correto == 1) {
					classificacao = "Ruim";
				} else {
					classificacao = "Muito Ruim";
				}

				// Saída na tela com a quantidade de questões correteas e sua classificação
				System.out.println(nome + ", sua pontuação no Nível " + opcao + " foi: " + correto
						+ "/5 \nSegundo nosso quiz, seu nível de conhecimento é: " + classificacao);

				// Pergunta pro usuário se ele gostaria de saber as respostas
				System.out.print("Você gostaria de saber as respostas corretas?" + "\n1 - Sim" + "\n2 - Não" + "\n> ");
				saberResp = sc.nextInt();

				// Se ele quiser saber as respostas informar
				if (saberResp == 1) {
					// Informar as respostas
					System.out.println("Questão 1 -> 3 - Japão"
							+ "\nQuestão 2 -> 1 - Estátua da Liberdade, Golden State Bridge e Empire State Building"
							+ "\nQuestão 3 -> 3 - Colômbia e Peru" + "\nQuestão 4 -> 2 - Indonésia"
							+ "\nQuestão 5 -> 5 - Barranquila");
				}

				break;
			case 3:
				System.out.println("--- NÍVEL 3 ---");

				System.out.print("Primeira pergunta:\n" + "\nQual das alternativas menciona apenas símbolos nacionais?"
						+ "\n1 - Bandeira insígnia da presidência, bandeira nacional, brasão, hinos e selo"
						+ "\n2 - Bandeira nacional, armas nacionais, hino nacional e selo nacional"
						+ "\n3 - Bandeira nacional, brasão, hino nacional e hino da independência"
						+ "\n4 - Bandeira nacional, cores nacionais, hino nacional e hino da independência"
						+ "\n5 - Bandeira insígnia da presidência, brasão flora e fauna e hinos" + "\n> ");
				p1 = sc.nextInt();
				if (p1 == 2) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Segunda pergunta:\n" + "\nEm que estado australiano fica situada a cidade de Sydney?"
						+ "\n1 - Nova Gales do Sul" + "\n2 - Victoria" + "\n3 - Tasmânia" + "\n4 - Queensland"
						+ "\n5 - Norfolk" + "\n> ");
				p2 = sc.nextInt();
				if (p2 == 1) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Terceira pergunta:\n"
						+ "\nEm que cidade ocorreu a Eco-92, a Conferência das Nações Unidas sobre ambiente e desenvolvimento?"
						+ "\n1 - Buenos Aires" + "\n2 - Rio de Janeiro" + "\n3 - Montevidéu " + "\n4 - Assunção"
						+ "\n5 - Caracas" + "\n> ");
				p3 = sc.nextInt();
				if (p3 == 2) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Quarta pergunta:\n" + "\nEm qual local da Ásia o português é a língua oficial?"
						+ "\n1 - Portugal" + "\n2 - Índia" + "\n3 - Filipinas " + "\n4 - Macau" + "\n5 - Moçambique"
						+ "\n> ");
				p4 = sc.nextInt();
				if (p4 == 4) {
					correto++;
				}

				System.out.println("--------------");
				System.out.print("Quinta pergunta:\n" + "\nQual destes países é transcontinental?" + "\n1 - Rússia"
						+ "\n2 - Filipinas" + "\n3 - Marrocos " + "\n4 - Groenlândia" + "\n5 - Tanzânia" + "\n> ");
				p5 = sc.nextInt();
				if (p5 == 1) {
					correto++;
				}

				if (correto == 5) {
					classificacao = "Muito bom";
				} else if (correto == 4) {
					classificacao = "Bom";
				} else if (correto == 3) {
					classificacao = "Na média";
				} else if (correto == 2) {
					classificacao = "Abaixo da média";
				} else if (correto == 1) {
					classificacao = "Ruim";
				} else {
					classificacao = "Muito Ruim";
				}

				// Saída na tela com a quantidade de questões correteas e sua classificação
				System.out.println(nome + ", sua pontuação no Nível " + opcao + " foi: " + correto
						+ "/5 \nSegundo nosso quiz, seu nível de conhecimento é: " + classificacao);

				// Pergunta pro usuário se ele gostaria de saber as respostas
				System.out.print("Você gostaria de saber as respostas corretas?" + "\n1 - Sim" + "\n2 - Não" + "\n> ");
				saberResp = sc.nextInt();

				// Se ele quiser saber as respostas informar
				if (saberResp == 1) {
					// Informar as respostas
					System.out.println(
							"Questão 1 -> 2 - Bandeira nacional, armas nacionais, hino nacional e selo nacional"
									+ "\nQuestão 2 -> 1 - Nova Gales do Sul" + "\nQuestão 3 -> 2 - Rio de Janeiro"
									+ "\nQuestão 4 -> 4 - Macau" + "\nQuestão 5 -> 1 - Rússia");
				}

				break;
			case 4:
				// Finalização do programa caso a opção for 4 (Quer finalizar o quiz)
				contador = 0;
				break;
			default:
				// Caso o usuário informar uma opção diferente das disponíveis ele informa a
				// mensagem de dificuldade inválida
				System.out.println("Dificuldade inválida!");
			}

			// Reiniciando o valor da variável caso ele queira responder novamente o quiz
			correto = 0;
		}
		sc.close();
	}
}
