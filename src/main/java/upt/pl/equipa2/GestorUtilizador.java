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


public Utilizador loginUtilizador(String nome, String password) {
    Session session = HibernateUtil.getSessionFactory().openSession();

    Utilizador u = session.createQuery(
            "FROM Utilizador WHERE nome = :n AND password = :p", Utilizador.class)
            .setParameter("n", nome)
            .setParameter("p", password)
            .uniqueResult();

    session.close();

    if (u == null) {
        System.out.println("Credenciais inválidas.");
    } else {
        System.out.println("Login efetuado com sucesso! Bem-vindo, " + u.getNome() + "!");
    }
    return u;
	}
}
	
	
	


