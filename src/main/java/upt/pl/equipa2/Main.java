package upt.pl.equipa2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {              

	public static void main(String[] args) {
	    EventoManager manager = new EventoManager();
        manager.setup();   
	    manager.read(1);                           
	    manager.create(12345,"Ana","abc123",20);                          
	    manager.update(1, "Roberto", "abc1234", 25); 
	    manager.exit();
	}
}