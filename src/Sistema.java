import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int fimn;
		
		System.out.println("Bem vindo ao Sistema!");
		do {
		System.out.println("1 - Cadastrar Filme");
		System.out.println("2 - Cadastrar Cópia");
		System.out.println("3 - Cadastrar Sócio");
		System.out.println("4 - Locação");
		System.out.println("5 - Devolução");
		System.out.println("6 - Sair");
		System.out.println("Digite sua opção: ");
		int opc = teclado.nextInt();
		fimn=opc;
		switch (opc) {
		case 1: System.out.println("Teste Filme");
		break;
		case 2: System.out.println("Teste Copia");
		break;
		case 3: System.out.println("Teste Socio");
		break;
		case 4: System.out.println("Teste locação");
		break;
		case 5: System.out.println("Teste devolucao");
		break;
		case 6: System.out.println("Teste fim");
		break;
		default: System.out.println("Opção inválida");
		break;
		}
	} while (fimn != 6); 
		teclado.close();
}
}