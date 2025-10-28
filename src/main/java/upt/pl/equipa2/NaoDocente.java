package upt.pl.equipa2;

public class NaoDocente extends Utilizador{
	private String departamento;
	
	public NaoDocente(int idUtilizador, String nome, int idade, String password, String emailIns) {
        super(idUtilizador, nome, idade, password);
        this.departamento = departamento;    
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "NaoDocente [departamento=" + departamento + "]";
	}
	

}