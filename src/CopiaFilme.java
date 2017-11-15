public class CopiaFilme {

	private String id;
	private String nome;
	private boolean alugado;

	public CopiaFilme() {
	}
	public CopiaFilme(String nome, String id, boolean alugado) {
		this.alugado = alugado;
		this.id = id;
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public boolean isAlugado() {
		return alugado;
	}

}