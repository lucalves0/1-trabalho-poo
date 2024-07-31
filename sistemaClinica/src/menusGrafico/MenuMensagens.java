/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menusGrafico;
import gerenciadorMensagens.*;
import pessoas.*;
import bancoDados.*;
import java.util.Scanner;

public class MenuMensagens {
    
    BancoDeDados banco = new BancoDeDados();
    GerenciadorMensagens msgs = new GerenciadorMensagens();
    Scanner in = new Scanner(System.in);
    
    public boolean menuPrincipal(){
        boolean retornado = true;
        while (retornado){
            String selecao;
            System.out.println("+-----------------------------------+");
            System.out.println("|======== MENU DE MENSAGENS ========|");
            System.out.println("+-----------------------------------+");
            System.out.println("|(1) Gerenciar Mensagens Enviadas   |");
            System.out.println("|(2) Enviar Mensagem de Aviso       |");
            System.out.println("|                                   |");
            System.out.println("|(0) Voltar                         |");
            System.out.println("+-----------------------------------+");
            selecao = in.next();

            switch(selecao){
                case "0" -> retornado = false;
                case "1" -> gerenciarMensagens();
                case "2" -> enviarMensagens();
            }            
        }
        return true;
    }
    
    public void gerenciarMensagens(){
    
        System.out.println("--------------------------------------------");
        System.out.println("========= GERENCIADOR DE MENSAGENS =========");
        System.out.println("Hoje foram enviadas as seguintes mensagens:\n");
        
        msgs.enviarMensagens(banco.buscarConsultas());
        
        System.out.println("--------------------------------------------\n");
    
    }
    
    public void enviarMensagens(){
    
        System.out.print("Paciente: ");
        String nomePac = in.nextLine();
        Paciente pac = banco.buscarPaciente(nomePac);
        while (pac == null){
            System.out.println("Paciente nao encontrado:");
            System.out.print("\nPaciente: ");
            nomePac = in.nextLine();
            pac = banco.buscarPaciente(nomePac);
        }
        
        msgs.enviarMensagens(banco.buscarConsultaPaciente(pac));

    }
    
}
