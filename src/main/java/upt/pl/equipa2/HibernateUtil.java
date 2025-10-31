package upt.pl.equipa2;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	private static final SessionFactory factory = new Configuration()
	.configure("hibernate.cfg.xml")
	.addAnnotatedClass(Utilizador.class)
	.addAnnotatedClass(Evento.class)
	.buildSessionFactory();

		public static SessionFactory getSessionFactory() {
	        return factory;
	    }
	    public static void shutdown() {
	        if (factory != null && factory.isOpen()) {
	            factory.close();
	            System.out.println("SessionFactory fechada.");
	        }
	    }
	}