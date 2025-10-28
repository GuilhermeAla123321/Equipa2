package upt.pl.equipa2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Cria a SessionFactory a partir do ficheiro hibernate.cfg.xml
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Evento.class) // adiciona a entidade Evento
                .buildSessionFactory();

        // Abre uma sessão
        try (Session session = factory.openSession()) {
            session.beginTransaction();

            // Cria um novo objeto Evento
            Evento evento = new Evento();
            evento.setTitulo("Workshop de Java");
            evento.setDescricao("Introdução à Programação com Java e JPA");
            evento.setDataInicio(java.time.LocalDateTime.now());
            evento.setDataFim(java.time.LocalDateTime.now().plusHours(2));
            evento.setLocal("Auditório Principal");
            evento.setVagas(50);
            evento.setArea("Tecnologia");
            evento.setTipoEvento("Formação");
            evento.setPublicoAlvo("Estudantes Universitários");
            evento.setStatus("Ativo");

            // Guarda o objeto na base de dados
            session.persist(evento);

            // Confirma a transação
            session.getTransaction().commit();

            System.out.println("Evento guardado com sucesso!");
        } finally {
            factory.close();
        }
    }
}