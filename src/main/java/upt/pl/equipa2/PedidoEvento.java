package upt.pl.equipa2;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PedidoEvento {
	private int idPedido;
	private BigDecimal custoEstimado;
	private String statusPedido;
	private LocalDateTime dataSubmissao;
	
	public PedidoEvento(int idPedido, BigDecimal custoEstimado, String statusPedido, LocalDateTime dataSubmissao) {
        this.idPedido = idPedido;
        this.custoEstimado = custoEstimado;
        this.statusPedido = statusPedido;
        this.dataSubmissao = dataSubmissao;
    }
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public BigDecimal getCustoEstimado() {
		return custoEstimado;
	}
	public void setCustoEstimado(BigDecimal custoEstimado) {
		this.custoEstimado = custoEstimado;
	}
	public String getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}
	public LocalDateTime getDataSubmissao() {
		return dataSubmissao;
	}
	public void setDataSubmissao(LocalDateTime dataSubmissao) {
		this.dataSubmissao = dataSubmissao;
	}
	
	public void submeter() {
	    if (this.statusPedido.equals("Pendente")) {
	        this.statusPedido = "Submetido";
	        this.dataSubmissao = LocalDateTime.now(); // CORRIGIDO
	        System.out.println("Pedido #" + idPedido + " submetido com sucesso em " + dataSubmissao);
	    } else {
	        System.out.println("Erro: Pedido já foi submetido anteriormente.");
	    }
	}

	public void avaliar() {
	    if (this.statusPedido.equals("Submetido")) {
	        if (this.custoEstimado.compareTo(new BigDecimal("5000")) <= 0) { // CORRIGIDO
	            this.statusPedido = "Aprovado";
	            System.out.println("Pedido #" + idPedido + " aprovado. Custo: €" + custoEstimado);
	        } else {
	            this.statusPedido = "Rejeitado";
	            System.out.println("Pedido #" + idPedido + " rejeitado. Custo excede o limite.");
	        }
	    } else {
	        System.out.println("Erro: Apenas pedidos submetidos podem ser avaliados. Status atual: " + statusPedido);
	    }
	}
}
