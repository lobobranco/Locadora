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
		System.out.println("7 - Sair");
		System.out.println("Digite sua op��o: ");
		int opc = teclado.nextInt();
		fimn=opc;
		
		switch (opc) {
		case 1:
			config.perguntas();
		break;
		case 2: System.out.println("Teste Copia\n");
		break;
		case 3: System.out.println("Teste Socio\n");
		break;
		case 4: System.out.println("Teste loca��o\n");
		break;
		case 5: System.out.println("Teste devolucao\n");
		break;
		case 6:
			config.checar();
			break;
		case 7: System.out.println("Teste fim\n");
		break;
		default: System.out.println("Op��o inv�lida\n");
		break;
		}
	} while (fimn != 7); 
		teclado.close();
}
}