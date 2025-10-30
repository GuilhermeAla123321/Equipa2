package upt.pl.equipa2;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
public class GestorEvento{
	
	public void create(Evento e1) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
		
        session.persist(e1); 
        
        session.getTransaction().commit();
        session.close();

	}

    public void update(int id, String titulo, String descricao,
                       String dataInicio, String dataFim,
                       String local, int vagas, String area, String tipoEvento,
                       String publicoAlvo, String status) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Evento evento = session.get(Evento.class, id);

        if (evento == null) {
            System.out.println("Evento não encontrado.");
            evento = new Evento();
            evento.setIdEvento(id);
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

        System.out.println("Evento atualizado ou criado com sucesso!");
    }


        public void deletar(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Evento evento = session.get(Evento.class, id);
        if (evento != null) {
            session.remove(evento);
            System.out.println("Evento eliminado com sucesso!");
        } else {
            System.out.println(" Evento não encontrado.");
        }

        session.getTransaction().commit();
        session.close();
    }
}
