package upt.pl.equipa2;

public class Utilizador {
	private String idUtilizador;
	private String nome;
	private int idade;
	private String password;
	
	
	
	public Utilizador(String idUtilizador, String nome, int idade, String password) {
		this.idUtilizador = idUtilizador;
		this.nome = nome;
		this.idade = idade;
		this.password = password;
	}



	public String getIdUtilizador() {
		return idUtilizador;
	}



	public void setIdUtilizador(String idUtilizador) {
		this.idUtilizador = idUtilizador;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Utilizador [idUtilizador=" + idUtilizador + ", nome=" + nome + ", idade=" + idade + ", password="
				+ password + "]";
	}
	
	
	
	
	
	
}
