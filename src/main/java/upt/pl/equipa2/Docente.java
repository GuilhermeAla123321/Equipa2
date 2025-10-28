package upt.pl.equipa2;

public class Docente extends Utilizador {

    private String emailIns;

    public Docente(int idUtilizador, String nome, int idade, String password, String emailIns) {
        super(idUtilizador, nome, idade, password);
        this.emailIns = emailIns;
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