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
	
	 public void loginUtilizador(int id, String password) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();


	        Utilizador utilizador = session.get(Utilizador.class, id);

	        if (utilizador == null) {
	            System.out.println("Utilizador não encontrado!");
	        } else if (utilizador.getPassword().equals(password)) {
	            System.out.println("Login efetuado com sucesso! Bem-vindo, " + utilizador.getNome() + "!");
	        } else {
	            System.out.println("Password incorreta!");
	        }

	        session.getTransaction().commit();
	        session.close();
	    }

}
	
	
	


