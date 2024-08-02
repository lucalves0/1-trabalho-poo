/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import java.util.Scanner;
import pessoas.*;
import bancoDados.*;

public class MenuInicial {
    public void menuPrincipal(){
        String opcao;
        String nome;
        boolean retornado = true;
        
        MenuMensagens menuMsg = new MenuMensagens();
        
        Scanner entrada = new Scanner(System.in);
        while (retornado){
            System.out.println("+------------------------------------+");
            System.out.println("|         CLINICA PURA SAUDE         |");
            System.out.println("+------------------------------------+");
            System.out.println("|Deseja logar em qual sistema:       |");
            System.out.println("+------------------------------------+");
            System.out.println("|(1) Secretaria                      |");
            System.out.println("|(2) Consultorio medico              |");
            System.out.println("|(3) Gerenciamento de Mensagens      |");
            System.out.println("|                                    |");
            System.out.println("|(0) Sair do menu (encerrar programa)|");
            System.out.println("+------------------------------------+");
            System.out.print(">>> ");
            opcao = entrada.nextLine();
            
            switch (opcao) {
                case "1" -> {
                    System.out.print("DIGITE SEU NOME: ");
                    nome = entrada.nextLine();
                    Secretahria SEC = BancoDeDados.buscarSecretahria(nome);
                    int j = 0;
                    while(SEC == null && j < 3){
                        System.out.println("Secretaharia nao encontrada, tente novametne\n");
                        System.out.print("DIGITE SEU NOME: ");
                        nome = entrada.nextLine();
                        SEC = BancoDeDados.buscarSecretahria(nome);
                        ++j;
                    }
                    if (SEC != null){
                        System.out.println("\n Login Feito Com Sucesso \n");
                        SEC.getMenu().menuPrincipal();
                    } else {
                        System.out.println("\n Não foi possível fazer o login \n");
                    }
                }

                case "2" -> {
                    System.out.print("DIGITE SEU NOME: ");
                    nome = entrada.nextLine();
                    Medico MED = BancoDeDados.buscarMedico(nome);
                    int j = 0;
                    while(MED == null && j < 3){
                        System.out.println("Medico nao encontrado, tente novametne\n");
                        System.out.print("DIGITE SEU NOME: ");
                        nome = entrada.nextLine();
                        MED = BancoDeDados.buscarMedico(nome);
                        ++j;
                    }
                    if (MED != null){
                        System.out.println("\n Login Feito Com Sucesso \n");
                        MED.getMenu().menuPrincipal();
                    } else {
                        System.out.println("\n Não foi possível fazer o login \n");
                    }
                }
                
                case "3" -> menuMsg.menuPrincipal();
                case "0" -> retornado = false;
                default -> System.out.println("Acao nao encontrada!\n"); 
                
            }
        }
    }
}
