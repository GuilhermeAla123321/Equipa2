package upt.pl.equipa2;
import java.time.LocalDateTime;

public class Inscricao {
	private int idInscricao;
	private LocalDateTime dataInscricao;
	private boolean confirmada;
	
	public Inscricao(int idInscricao) {
        this.idInscricao = idInscricao;
        this.dataInscricao = LocalDateTime.now();
        this.confirmada = false;
	}
	public int getIdInscricao() {
		return idInscricao;
	}
	public void setIdInscricao(int idInscricao) {
		this.idInscricao = idInscricao;
	}
	public LocalDateTime getDataInscricao() {
		return dataInscricao;
	}
	public void setDataInscricao(LocalDateTime dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	public boolean isConfirmada() {
		return confirmada;
	}
	public void setConfirmada(boolean confirmada) {
		this.confirmada = confirmada;
	}
	
	public void confirmar() {
        this.confirmada = true;
        System.out.println("Inscrição confirmada com sucesso!");
    }
	
	public void cancelar() {
        this.confirmada = false;
        System.out.println("Inscrição cancelada.");
    }

}
