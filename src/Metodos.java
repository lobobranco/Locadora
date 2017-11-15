import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

	ArrayList<Filme> list = new ArrayList<>();
	ArrayList<CopiaFilme> cop = new ArrayList<>();
	ArrayList<Socio> soc = new ArrayList<>();

	Filme filme = new Filme();
	CopiaFilme copia = new CopiaFilme();
	Socio socio = new Socio();
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

	public Socio perguntas2() {
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("Digite o nome do Sócio:");
		String nome = teclado2.nextLine();
		System.out.println("Digite o endereço do Sócio:");
		String endereco = teclado2.nextLine();
		System.out.println("Digite o telefone do Sócio:");
		int telefone = teclado2.nextInt();
		System.out.println("Digite o RG do Sócio");
		Scanner teclado3 = new Scanner(System.in);
		String rg = teclado3.nextLine();
		System.out.println("Digite o CPF do Sócio:");
		String cpf = teclado3.nextLine();
		System.out.println("Digite a data de adesão do Sócio:");
		String data = teclado3.nextLine();
		socio = new Socio(nome, endereco, telefone, rg, cpf, data);
		soc.add(socio);
		teclado2.close();
		teclado3.close();
		return socio;
	}
	public void checarFilmes() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
			System.out.println(filme.getTitulo());
		}
	}

	public void copiaFilme(String nome) {
		Scanner teclado4 = new Scanner(System.in);
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
			if (filme.getTitulo() == nome) {
				System.out.println("Digite uma ID para a cópia: ");
				String id = teclado4.nextLine();
				boolean alugado = false;
				CopiaFilme copia = new CopiaFilme(nome,id, alugado);
				cop.add(copia);
				teclado4.close();
			}
			else {
				System.out.println("Este filme não esttá registrado.");
			}
		}
	}

	public void checarCopias() {
		for (int i = 0; i < cop.size(); i++) {
			cop.get(i);
		}
	}
	
	public void locacao() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o nome do filme que vai ser alugado:");
		String alug = teclado.nextLine(); 
		for (int i = 0; i < cop.size(); i++) {
			cop.get(i);
			if (copia.getNome() == alug) {
				copia.setAlugado(true);
			} else {
				System.out.println("Não temos cópias disponíveis");
			}
	}
		teclado.close();
}
}