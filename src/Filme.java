
public class Filme {
	private String titulo;
	private String duracao;
	private int ano;
	private String formato;
	private String atores;
	
	public Filme () {
	}
	public Filme(String titulo, String duracao, int ano, String formato, String atores) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.ano = ano;
		this.formato = formato;
		this.atores = atores;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getDuracao() {
		return duracao;
	}
	public int getAno() {
		return ano;
	}
	public String getFormato() {
		return formato;
	}
	public String getAtores() {
		return atores;
	}
}
