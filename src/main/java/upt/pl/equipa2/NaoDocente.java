package upt.pl.equipa2;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@DiscriminatorValue("NaoDocente")
public class NaoDocente extends Utilizador{
	
	@Column(name = "departamento", length = 100)
	private String departamento;
	 
	

	
	public NaoDocente() {  
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "NaoDocente [departamento=" + departamento + "]";
	}
	

}