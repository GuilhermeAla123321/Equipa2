package upt.pl.equipa2;

public class AlunoUpt extends Utilizador{
	private int numeroAluno;
	
    public AlunoUpt(int idUtilizador, String nome, int idade, String password) {
        super(idUtilizador, nome, idade, password);
        this.numeroAluno= numeroAluno;
	}

	public int getNumeroAluno() {
		return numeroAluno;
	}

	public void setNumeroAluno(int numeroAluno) {
		this.numeroAluno = numeroAluno;
	}

	@Override
	public String toString() {
		return "AlunoUpt [numeroAluno=" + numeroAluno + "]";
	}
	
    
	
	
}
