package upt.pl.equipa2;
import java.time.LocalDateTime;


public class Evento {
	private int idEvento;
	private String titulo;
	private String descricao;
	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	private String local;
	private int vagas;
	private String area;
	private String tipoEvento;
	private String publicoAlvo;
	private String status;
	
	public Evento(int idEvento, String titulo, String descricao, 
            LocalDateTime dataInicio, LocalDateTime dataFim, 
            String local, int vagas, String area, 
            String tipoEvento, String publicoAlvo, String status) {
  this.idEvento = idEvento;
  this.titulo = titulo;
  this.descricao = descricao;
  this.dataInicio = dataInicio;
  this.dataFim = dataFim;
  this.local = local;
  this.vagas = vagas;
  this.area = area;
  this.tipoEvento = tipoEvento;
  this.publicoAlvo = publicoAlvo;
  this.status = status;
}
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDateTime getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int getVagas() {
		return vagas;
	}
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public String getPublicoAlvo() {
		return publicoAlvo;
	}
	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
