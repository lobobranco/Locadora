
public class Socio {
	private String nome;
	private String endereco;
	private String telefone;
	private String rg;
	private String cpf;
	private String data;
	
	public Socio(String nome, String endereco, String telefone, String rg, String cpf, String data) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
		this.data = data;
	}
	
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getRg() {
		return rg;
	}
	public String getCpf() {
		return cpf;
	}
	public String getData() {
		return data;
	}
}
