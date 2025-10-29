package upt.pl.equipa2;

import org.hibernate.Session;
import java.util.List;

public class GestorUtilizador {

    // Login: retorna o utilizador se nome + password existirem
    public Utilizador login(String nome, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Utilizador u = session.createQuery(
            "FROM Utilizador WHERE nome = :nome AND password = :pass", Utilizador.class)
            .setParameter("nome", nome)
            .setParameter("pass", password)
            .uniqueResult();
        session.close();
        return u;
    }

    // Criar utilizador
    public void Criar(Utilizador u) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(u);
        session.getTransaction().commit();
        session.close();
    }
}
