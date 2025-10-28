package upt.pl.equipa2;

import jakarta.persistence.*;


@Entity
@Table(name = "Aluno")
@PrimaryKeyJoinColumn(name = "id_utilizador") 
public class AlunoUpt extends Utilizador{
    @Column(name = "numero_aluno", nullable = false)
	private int numeroAluno;
    
    public AlunoUpt(){}

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
