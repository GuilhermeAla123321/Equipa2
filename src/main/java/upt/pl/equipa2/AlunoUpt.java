package upt.pl.equipa2;

import jakarta.persistence.*;


@Entity
@Table(name = "Aluno")

public class AlunoUpt extends Utilizador{
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    @Column(name = "numero_aluno", nullable = false, length=5)
	private int numeroAluno;
	
	
    @ManyToOne
    @JoinColumn(name = "id_utilizador", nullable = false)
    private Utilizador utilizador;
    
    public AlunoUpt() {
    	
    }
    
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
