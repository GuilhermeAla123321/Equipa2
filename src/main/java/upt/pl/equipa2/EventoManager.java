package upt.pl.equipa2;

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
         // code to close Hibernate Session factory 
     } 
   
     public void create() { 
         // code to save a course 
     } 
   
     public void read() { 
 
         // code to get a course 
     } 
   
     public void update() { 
         // code to modify a course 
     } 
   
     public void delete() { 
         // code to remove a course 
     } 
   
  } 