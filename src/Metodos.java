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
		boolean alugado = false;
		copia = new CopiaFilme(titulo, alugado);
		cop.add(copia);
		System.out.println("Filme cadastrado com sucesso!");
		System.out.println("");
		return filme;
	}

	public Socio perguntas2() {
		Scanner teclado5 = new Scanner(System.in);
		System.out.println("Digite o nome do Sócio:");
		String nome = teclado5.nextLine();
		System.out.println("Digite o endereço do Sócio:");
		String endereco = teclado5.nextLine();
		System.out.println("Digite o telefone do Sócio:");
		int telefone = teclado5.nextInt();
		System.out.println("Digite o RG do Sócio");
		Scanner teclado6 = new Scanner(System.in);
		String rg = teclado6.nextLine();
		System.out.println("Digite o CPF do Sócio:");
		String cpf = teclado6.nextLine();
		System.out.println("Digite a data de adesão do Sócio:");
		String data = teclado6.nextLine();
		socio = new Socio(nome, endereco, telefone, rg, cpf, data);
		soc.add(socio);
		System.out.println("Sócio cadastrado com sucesso!");
		System.out.println("");
		return socio;
	}

	public void checarFilmes() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
			System.out.println("Referência do filme: " + i);
			System.out.println("Nome: " + filme.getTitulo());
			System.out.println("Duração: " + filme.getDuracao());
			System.out.println("Ano: " + filme.getAno());
			System.out.println("Formato: "+ filme.getFormato());
			System.out.println("Principais Atores: " + filme.getAtores());
			System.out.println("");
		}
	}

	public void copiaFilme(String nome) {
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
			if (filme.getTitulo().equals(nome)) {
				boolean alugado = false;
				CopiaFilme copia = new CopiaFilme(nome, alugado);
				cop.add(copia);
				System.out.println("Cópia feita com sucesso!");
				System.out.println("");
			}
			else {
				System.out.println("Este filme não está registrado.");
				System.out.println("");
			}
		}
	}

	public void checarCopias() {
		for (int i = 0; i < cop.size(); i++) {
			cop.get(i);
			System.out.println("Número de referência: " + i);
			System.out.println("Nome do filme: " + copia.getNome());
			System.out.println("Status: " + this.statusCopia());
			System.out.println("");
		}
	}

	public void checarSocios() {
		for (int i = 0; i < soc.size(); i++) {
			soc.get(i);
			System.out.println("Número: " + i);
			System.out.println("Nome: " + socio.getNome());
			System.out.println("Endereço: " + socio.getEndereco());
			System.out.println("Telefone: " + socio.getTelefone());
			System.out.println("RG: " + socio.getRg());
			System.out.println("CPF: " + socio.getCpf());
			System.out.println("Data: " + socio.getData());
			System.out.println("");
		}
	}

	public void locacao() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Nome do Sócio: ");
		String socio = teclado.nextLine();
		if (this.pickSocio(socio) == true) {
			System.out.println("Digite o nome do filme que vai ser alugado:");
			String alug = teclado.nextLine(); 
			if (this.pickFilme(alug) == true) {
				if (this.pickCopia()==true) {
					copia.setAlugado(true);
					System.out.println("Cópia alugada com sucesso!");	
					System.out.println("");
				} else {
					System.out.println("Não temos cópias disponíveis.");
					System.out.println("");
				}
			} else {
				System.out.println("Esse filme não está listado.");
				System.out.println("");
			}
		}
	}

	public String statusCopia() {
		if (copia.getAlugado() == false) {
			return ("Disponível!");
		} 
		return ("Alugado.");
	}

	public void devolução() {
		this.pickCopia();
		if (this.pickCopia() == false) {
			copia.setAlugado(false);
			System.out.println("Devolução feita com sucesso!");
			System.out.println(""); 
		}
	}

	public boolean pickSocio(String nome) {
		for (int i = 0; i < soc.size(); i++) {
			soc.get(i);
			if (socio.getNome().equals(nome)) {
				return true;
			}
		}
		return false;
	}

	public boolean pickFilme (String nome) {
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
			if (filme.getTitulo().equals(nome)) {
				return true;
			}
		}
		return false;
	}

	public boolean pickCopia () {
		for (int i = 0; i < cop.size(); i++) {
			cop.get(i);
			if (copia.getAlugado() == false) {
				return true;
			}
		} 
		return false;
	}

}