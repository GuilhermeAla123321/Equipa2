package upt.pl.equipa2;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("ALUNO")
public class AlunoUpt extends Utilizador{
	
    @Column(name = "numero_aluno", nullable = false, length=5)
	private int numeroAluno;

	
    @ManyToOne
    @JoinColumn(name = "id_utilizador", nullable = false)
    private Utilizador utilizador;
    
    public AlunoUpt() {
    	
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
