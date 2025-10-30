package upt.pl.equipa2;

import org.hibernate.Session;

public class GestorUtilizador {
	
	
public void registarUtilizador(String nome, int idade, String password) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    
    Utilizador novoUtilizador = new Utilizador();
    novoUtilizador.setNome(nome);
    novoUtilizador.setIdade(idade);
    novoUtilizador.setPassword(password);
    
    
    session.persist(novoUtilizador);
    session.getTransaction().commit();
    session.close();

    System.out.println("Utilizador registado!");
    
	}   
}
	
	
	


