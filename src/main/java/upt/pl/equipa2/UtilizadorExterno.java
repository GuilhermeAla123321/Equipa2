package upt.pl.equipa2;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("UtilizadorExterno")
public class UtilizadorExterno extends Utilizador{


    @Column(name = "email", nullable = false, length = 100)
	private String email;
	
    
    
    public UtilizadorExterno() {
    	
    }


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UtilizadorExterno [email=" + email + "]";
	}
	
	
}
