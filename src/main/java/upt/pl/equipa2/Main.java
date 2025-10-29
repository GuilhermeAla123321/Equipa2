package upt.pl.equipa2;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorUtilizador gUtilizador = new GestorUtilizador();
        EventoManager eventoDao = new EventoManager();

        Utilizador user = null;

        // Login na base de dados
        while (user == null) {
            System.out.println("=== LOGIN ===");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Password: ");
            String pass = sc.nextLine();

            user = gUtilizador.login(nome, pass);
            if (user == null) { 
            	System.out.println("❌ Utilizador não encontrado, Criar um novo utilizador");
	            Utilizador newUser = new Utilizador();
	            System.out.print("Nome: "); newUser.setNome(sc.nextLine());
	            System.out.print("Idade: "); newUser.setIdade(sc.nextInt());sc.nextLine();
	            System.out.print("Senha: "); newUser.setPassword(sc.nextLine());
	            gUtilizador.Criar(newUser);
	            }
            else System.out.println("✅ Bem-vindo, " + user.getNome() + "!");
        }

        // Menu de eventos
        int opcao;
        do {
            System.out.println("\n===== MENU DE EVENTOS =====");
            System.out.println("1 - Criar evento");
            System.out.println("2 - Listar eventos");
            System.out.println("3 - Atualizar evento");
            System.out.println("4 - Eliminar evento");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 :{
                    Evento e = new Evento();
                    System.out.print("Título: "); e.setTitulo(sc.nextLine());
                    System.out.print("Descrição: "); e.setDescricao(sc.nextLine());
                    System.out.print("Local: "); e.setLocal(sc.nextLine());
                    System.out.print("Vagas: "); e.setVagas(sc.nextInt()); sc.nextLine();
                    System.out.print("Área: "); e.setArea(sc.nextLine());
                    System.out.print("Tipo de evento: "); e.setTipoEvento(sc.nextLine());
                    System.out.print("Público-alvo: "); e.setPublicoAlvo(sc.nextLine());
                    System.out.print("Status: "); e.setStatus(sc.nextLine());
                    e.setDataInicio(LocalDateTime.now());
                    e.setDataFim(LocalDateTime.now().plusHours(2));
                    eventoDao.salvar(e);
                    break;
                }
                case 2 :{
                    List<Evento> lista = eventoDao.listarTodos();
                    if (lista.isEmpty()) System.out.println("Nenhum evento encontrado.");
                    else lista.forEach(ev -> System.out.println(ev.getIdEvento() + " | " + ev.getTitulo()));
                }
                case 3 :{
                    System.out.print("ID do evento: "); int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Novo título: "); String titulo = sc.nextLine();
                    System.out.print("Nova descrição: "); String descricao = sc.nextLine();
                    System.out.print("Novo local: "); String local = sc.nextLine();
                    System.out.print("Novas vagas: "); int vagas = sc.nextInt(); sc.nextLine();
                    System.out.print("Nova área: "); String area = sc.nextLine();
                    System.out.print("Novo tipo de evento: "); String tipoEvento = sc.nextLine();
                    System.out.print("Novo público-alvo: "); String publicoAlvo = sc.nextLine();
                    System.out.print("Novo status: "); String status = sc.nextLine();
                    eventoDao.update(id, titulo, descricao, LocalDateTime.now(),
                                     LocalDateTime.now().plusHours(2),
                                     local, vagas, area, tipoEvento, publicoAlvo, status);
                    break;
                }
                case 4 :{
                    System.out.print("ID do evento a eliminar: "); int id = sc.nextInt(); sc.nextLine();
                    eventoDao.deletar(id);
                    break;
                }
                case 5 : System.out.println("👋 A sair...");
                default : System.out.println("❌ Opção inválida!");
            }

        } while (opcao != 5);

        HibernateUtil.shutdown();
        sc.close();
    }
}
