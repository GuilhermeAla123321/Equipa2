package upt.pl.equipa2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        GestorUtilizador utilizador = new GestorUtilizador();
        GestorEvento evento = new GestorEvento();

        
        System.out.println("   MENU   ");
        System.out.println("1 - Registar");
        System.out.println("2 - Login");
        System.out.println("3 - Criar Evento");
        System.out.println("4 - Atualizar Evento");
        System.out.println("5 - Apagar Evento");
        System.out.println("0 - Sair");

        System.out.print("Escolha uma opção: ");
        int opcao = ler.nextInt();
        ler.nextLine();

        if (opcao == 1) {
            System.out.println("   Registo   ");
            System.out.print("Nome: ");
            String nome = ler.nextLine();

            System.out.print("Idade: ");
            int idade = ler.nextInt();
            ler.nextLine();            
            
            System.out.print("Senha: ");
            String senha = ler.nextLine();
            ler.nextLine();            

            
            utilizador.registarUtilizador(nome, idade, senha);

        } else if (opcao == 2) {
            System.out.println("\n--- Login ---");
            System.out.print("nome: ");
            String nome = ler.nextLine();

            System.out.print("Senha: ");
            String senha = ler.nextLine();
           
            utilizador.loginUtilizador(nome, senha);
        
        }else if(opcao==3) {
            System.out.println("Criar Evento");
            
            System.out.print("Título: ");
            String titulo = ler.nextLine();

            System.out.print("Descrição: ");
            String descricao = ler.nextLine();

            System.out.print("Data Início");
            String dataInicio = ler.nextLine();

            System.out.print("Data Fim");
            String dataFim = ler.nextLine();

            System.out.print("Local: ");
            String local = ler.nextLine();

            System.out.print("Vagas: ");
            int vagas = ler.nextInt();

            System.out.print("Área: ");
            String area = ler.nextLine();

            System.out.print("Tipo de Evento: ");
            String tipoEvento = ler.nextLine();

            System.out.print("Público-Alvo: ");
            String publicoAlvo = ler.nextLine();

            System.out.print("Status: ");
            String status = ler.nextLine();
            
            evento.registarEvento(titulo, descricao,dataInicio,dataFim,local,vagas,area,tipoEvento,publicoAlvo,status);


        } else {
            System.out.println(" A sair");
        }

        HibernateUtil.shutdown();
        ler.close();
    }

}