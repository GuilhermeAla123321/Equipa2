package upt.pl.equipa2;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factory {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Utilizador.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Falha ao criar SessionFactory: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() { return sessionFactory; }
    public static void shutdown() { sessionFactory.close(); }
}