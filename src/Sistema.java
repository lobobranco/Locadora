import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int fimn;
		Metodos config = new Metodos();

		System.out.println("Bem vindo ao Sistema!");

		do {
			System.out.println("1 - Cadastrar Filme");
			System.out.println("2 - Cadastrar C�pia");
			System.out.println("3 - Cadastrar S�cio");
			System.out.println("4 - Loca��o");
			System.out.println("5 - Devolu��o");
			System.out.println("6 - Lista de Filmes");
			System.out.println("7 - Lista de C�pias");
			System.out.println("8 - Sair");
			System.out.println("Digite sua op��o: ");
			int opc = teclado.nextInt();
			fimn=opc;

			switch (opc) {
			case 1: 
				config.perguntas();
			break;
			case 2: 
				Scanner teclado2 = new Scanner(System.in);
			System.out.println("Digite o nome do filme que voc� quer copiar:");
			String nome = teclado2.nextLine();
			config.copiaFilme(nome);
			break;
			case 3: 
				config.perguntas2();
			break;
			case 4: 
				config.checarCopias();
				//Escolher um item da lista e mudar o boolean pra True
			break;
			case 5: 
				//Informar a c�pia e mudar o boolean pra False
			break;
			case 6:
				config.checarFilmes();
				break;
			case 7: config.checarCopias();
			break;
			case 8: System.out.println("Finalizando Sistema\n");
			break;
			default: System.out.println("Op��o inv�lida\n");
			break;
			}
		} while (fimn != 8); 
		teclado.close();
	}
}