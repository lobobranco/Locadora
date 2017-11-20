public class CopiaFilme {

	private String nome;
	private boolean alugado;

	public CopiaFilme() {
	}
	
	public CopiaFilme(String nome, boolean alugado) {
		this.alugado = alugado;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public boolean setAlugado(boolean alugado) {
		return this.alugado = alugado;
	}

	public boolean getAlugado() {
		return alugado;
	}
}