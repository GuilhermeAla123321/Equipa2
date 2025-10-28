package upt.pl.equipa2;

import jakarta.persistence.*;

@Entity
@Table(name = "utilizador")
public class Utilizador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilizador")
    private int idUtilizador;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "idade", nullable = false)
    private int idade;

    @Column(name = "pass", nullable = false, length = 7)
    private String password;

    public Utilizador() {
    }
    
    public Utilizador(int idUtilizador, String nome, int idade, String password) {
        this.idUtilizador = idUtilizador;
        this.nome = nome;
        this.idade = idade;
        this.password = password;
    }
    public int getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(int idUtilizador) {
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
        return "Utilizador [idUtilizador=" + idUtilizador + ", nome=" + nome +
               ", idade=" + idade + ", password=" + password + "]";
    }
}
