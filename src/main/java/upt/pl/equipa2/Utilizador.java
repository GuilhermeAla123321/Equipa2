package upt.pl.equipa2;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "UTILIZADOR")
public class Utilizador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilizador")
    private int idUtilizador;

    @Column(name = "nome", nullable = false, length = 100, unique = true)
    private String nome;

    @Column(name = "idade", nullable = false)
    private int idade;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    // ----------------- Relação Many-to-Many inversa -----------------
    @ManyToMany(mappedBy = "utilizadores")
    private Set<Evento> eventos = new HashSet<>();

    // Construtor padrão
    public Utilizador() {}

    // Getters e Setters
    public int getIdUtilizador() { return idUtilizador; }
    public void setIdUtilizador(int idUtilizador) { this.idUtilizador = idUtilizador; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Set<Evento> getEventos() { return eventos; }
    public void setEventos(Set<Evento> eventos) { this.eventos = eventos; }
}
