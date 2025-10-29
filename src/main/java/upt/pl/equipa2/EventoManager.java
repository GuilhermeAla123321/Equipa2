package upt.pl.equipa2;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class EventoManager{
	
	
	 // SALVAR um evento novo
    public void salvar(Evento evento) {
        // 1. Abrir uma "sessão" com a base de dados
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // 2. Começar a "transação" (é como um bloco de operações que podem ser confirmadas ou canceladas)
            Transaction tx = session.beginTransaction();

            // 3. Guardar o evento na base de dados
            session.persist(evento);

            // 4. Confirmar tudo (guardar mesmo na base de dados)
            tx.commit();

            System.out.println("✅ Evento salvo!");
        } catch (Exception e) {
            // Se der algum erro, mostrar o erro
            e.printStackTrace();
        }
    }

    // BUSCAR um evento pelo seu ID
    public Evento buscarPorId(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Procura o evento na base de dados pelo ID e devolve ele
            // Se não existir, devolve null
            return session.get(Evento.class, id);
        }
    }

    // LISTAR todos os eventos
    public List<Evento> listarTodos() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Cria uma "consulta" que pega todos os eventos e devolve como lista
            return session.createQuery("from Evento").list();
        }
    }

 // UPDATE (ou cria novo se não existir)
    public void update(int id, String titulo, String descricao,
                       java.time.LocalDateTime dataInicio, java.time.LocalDateTime dataFim,
                       String local, int vagas, String area, String tipoEvento,
                       String publicoAlvo, String status) {

    	// Usa o SessionFactory do HibernateUtil
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Evento evento = session.get(Evento.class, id);

        if (evento == null) {
            System.out.println("Evento não encontrado. Criando novo...");
            evento = new Evento();
            evento.setIdEvento(id); // opcional — pode remover se o ID for gerado automaticamente
        }

        evento.setTitulo(titulo);
        evento.setDescricao(descricao);
        evento.setDataInicio(dataInicio);
        evento.setDataFim(dataFim);
        evento.setLocal(local);
        evento.setVagas(vagas);
        evento.setArea(area);
        evento.setTipoEvento(tipoEvento);
        evento.setPublicoAlvo(publicoAlvo);
        evento.setStatus(status);

        session.merge(evento);
        session.getTransaction().commit();
        session.close();

        System.out.println("✅ Evento atualizado ou criado com sucesso!");
    }


    
    // DELETE
    public void deletar(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Evento evento = session.get(Evento.class, id);
        if (evento != null) {
            session.remove(evento);
            System.out.println("🗑️ Evento eliminado com sucesso!");
        } else {
            System.out.println("⚠️ Evento não encontrado.");
        }

        session.getTransaction().commit();
        session.close();
    }
}
