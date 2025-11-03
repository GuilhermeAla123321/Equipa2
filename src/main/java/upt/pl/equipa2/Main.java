package upt.pl.equipa2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        GestorUtilizador gestorUtilizador = new GestorUtilizador();
        GestorEvento gestorEvento = new GestorEvento();

        int opcao;

        do {
            System.out.println("\n====== MENU PRINCIPAL ======");
            System.out.println("1 - Registar");
            System.out.println("2 - Login");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("    Registo    ");
                    System.out.print("Nome: ");
                    String nome = ler.nextLine();

                    System.out.print("Idade: ");
                    int idade = ler.nextInt();
                    ler.nextLine();

                    System.out.print("Senha: ");
                    String senha = ler.nextLine();

                    gestorUtilizador.registarUtilizador(nome, idade, senha);
                    break;

                case 2:
                    System.out.println("    Login    ");
                    System.out.print("Nome: ");
                    String nomeLogin = ler.nextLine();

                    System.out.print("Senha: ");
                    String senhaLogin = ler.nextLine();

            
                    Utilizador utilizador = gestorUtilizador.loginUtilizador(nomeLogin, senhaLogin);

                    if (utilizador != null) {
          
                        int opcaoEvento;
                        do {
                            System.out.println("    MENU DE EVENTOS    ");
                            System.out.println("1 - Criar Evento");
                            System.out.println("2 - Atualizar Evento");
                            System.out.println("3 - Apagar Evento");
                            System.out.println("0 - Logout");
                            System.out.print("Escolha uma opção: ");
                            opcaoEvento = ler.nextInt();
                            ler.nextLine();

                            switch (opcaoEvento) {
                                case 1:
                                    // pessoal aqui colocamos os metodos que vamos criar no gestor de eventos como criar atualizar etc...
                                    break;
                                case 2:
                                    
                                    break;
                                case 3:
                                    
                                    break;
                                case 0:
                                    System.out.println("Logout efetuado.");
                                    break;
                                default:
                                    System.out.println("Opção inválida!");
                            }

                        } while (opcaoEvento != 0);
                    }
                    break;

                case 0:
                    System.out.println(" sair ");
                    break;

                default:
                    System.out.println(" Opção inválida ");
            }

        } while (opcao != 0);

        HibernateUtil.shutdown();
        ler.close();
    }
}

