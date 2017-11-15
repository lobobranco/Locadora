import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

	ArrayList<Filme> list = new ArrayList<>();
	ArrayList<CopiaFilme> cop = new ArrayList<>();
	
	Filme filme = new Filme();
	public Filme perguntas() {
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("Digite o título do filme:");
		String titulo = teclado2.nextLine();
		System.out.println("Digite a duração do filme:");
		String duracao = teclado2.nextLine();
		System.out.println("Digite o ano do filme:");
		int ano = teclado2.nextInt();
		System.out.println("Digite o formato do filme:");
		Scanner teclado3 = new Scanner(System.in);
		String formato = teclado3.nextLine();
		System.out.println("Digite os atores principais:");
		String atores = teclado3.nextLine();
		filme = new Filme(titulo, duracao, ano, formato, atores);
		list.add(filme);
		teclado2.close();
		teclado3.close();
		return filme;
	}
	
	public void checar() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
			System.out.println(filme.getTitulo());
		}
	}
	
	
	public void copiaFilme(String nome, int numero) {
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
			if (filme.getTitulo() == nome) {
				SecureRandom id = new SecureRandom();
				id.nextInt(100);
				
				CopiaFilme copia = new CopiaFilme(nome,id);
				cop.add(copia);
			}
		}
	}
}
