package upt.pl.equipa2;

import jakarta.persistence.*;

@Entity
@Table(name = "docente")
public class Docente extends Utilizador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_docente")
    private int id_docente;

    @Column(name = "emailIns", nullable = false, length = 100)
    private String emailIns;

    public Docente() {
    }

  
    public int getId_docente() {
        return id_docente;
    }

    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }

    public String getEmailIns() {
        return emailIns;
    }

    public void setEmailIns(String emailIns) {
        this.emailIns = emailIns;
    }

    @Override
    public String toString() {
        return super.toString() + ", emailIns=" + emailIns + "]";
    }
}
