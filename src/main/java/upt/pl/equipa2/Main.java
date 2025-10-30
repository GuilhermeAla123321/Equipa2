package upt.pl.equipa2;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        GestorUtilizador utilizador = new GestorUtilizador();
        GestorEvento evento = new GestorEvento();

        Utilizador user = null;

        System.out.println("   MENU   ");
        System.out.println("1 - Registar");
        System.out.println("2 - Login");
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
           


        } else {
            System.out.println("👋 A sair...");
        }

        HibernateUtil.shutdown();
        ler.close();
    }
}