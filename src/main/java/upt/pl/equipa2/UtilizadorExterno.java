package upt.pl.equipa2;

public class UtilizadorExterno extends Utilizador{
	private String email;
	
	public UtilizadorExterno(int idUtilizador, String nome, int idade, String password, String emailIns) {
        super(idUtilizador, nome, idade, password);
        this.email = email;    
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UtilizadorExterno [email=" + email + "]";
	}
	
	
}
