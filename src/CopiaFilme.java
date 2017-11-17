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

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public boolean getAlugado() {
		return alugado;
	}
}