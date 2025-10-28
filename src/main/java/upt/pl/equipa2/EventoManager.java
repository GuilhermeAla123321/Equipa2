package upt.pl.equipa2;

import org.hibernate.Session; 
 import org.hibernate.SessionFactory; 
 import org.hibernate.boot.MetadataSources; 
 import org.hibernate.boot.registry.StandardServiceRegistry; 
 import org.hibernate.boot.registry.StandardServiceRegistryBuilder; 
 
public class EventoManager {

    public SessionFactory sessionFactory;

    public void setup() {
        // Cria o ServiceRegistry com base no ficheiro hibernate.cfg.xml
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // lê o hibernate.cfg.xml
                .build();

        try {
            // Cria a SessionFactory a partir do registry
            sessionFactory = new MetadataSources(registry)
                    .buildMetadata()
                    .buildSessionFactory();

            System.out.println("✅ SessionFactory criada com sucesso.");

        } catch (Exception ex) {
            System.err.println("❌ Erro ao criar SessionFactory: " + ex.getMessage());
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
   
     public void exit() { 
     } 
   
     public void create(int IdUtilizador,String nome,String Password,int Idade) { 
         Session session = sessionFactory.openSession(); 
               session.beginTransaction(); 
   
               Utilizador u1=new Utilizador(); 
               u1.setNome(nome); 
               u1.setIdade(Idade); 
               u1.setPassword(Password);
               u1.setIdUtilizador(IdUtilizador);
               

               session.persist(u1); 
   
               session.getTransaction().commit(); 
               session.close(); 
   
       } 
     
   
     public void read( int IdUtilizador) {
    		    Session session = sessionFactory.openSession();
    		        		    
    		    Utilizador u = session.get(Utilizador.class, IdUtilizador);

    		    if (u != null) {
    		        System.out.println("Nome: " + u.getNome());
    		        System.out.println("Idade: " + u.getIdade());
    		        System.out.println("Password: " + u.getPassword());
    		    } else {
    		        System.out.println("Utilizador com ID " + IdUtilizador + " não encontrado.");
    		    }

    		    session.close();
        }

     public void update(int IdUtilizador,String nome,String Password,int Idade) { 
    	 	Utilizador u = new Utilizador();; 
    	 	u.setIdUtilizador(IdUtilizador);       
    	    u.setNome(nome);      
    	    u.setPassword(Password);   
    	    u.setIdade(Idade);

    	    Session session = sessionFactory.openSession();
    	    session.beginTransaction();
    	    session.merge(u);        
    	    session.getTransaction().commit();
    	    session.close();
 
    	   
     }
   
     public void delete(int IdUtilizador) { 
    	  Utilizador u = new Utilizador(); 
          u.setIdUtilizador(IdUtilizador); 
          Session session = sessionFactory.openSession(); 
           session.beginTransaction(); 
           session.remove(u); 
           session.getTransaction().commit(); 
             session.close();      
         }
}
   