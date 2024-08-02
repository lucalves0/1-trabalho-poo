/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import gerenciadorMensagens.*;
import pessoas.*;
import bancoDados.*;
import java.util.Scanner;

public class MenuMensagens {
    GerenciadorMensagens msgs = new GerenciadorMensagens();
    Scanner in = new Scanner(System.in);
    
    public boolean menuPrincipal(){
        boolean retornado = true;
        while (retornado){
            String selecao;
            MenusMostrar.mostrarMenuMensagensPrincipal();
            selecao = in.nextLine();

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
        
        msgs.enviarMensagens(BancoDeDados.buscarConsultas());
        
        System.out.println("--------------------------------------------\n");
    
    }
    
    public void enviarMensagens(){
    
        System.out.print("Informe o nome do paciente: ");
        String nomePac = in.nextLine();
        Paciente pac = BancoDeDados.buscarPaciente(nomePac);
        int j = 0;
        while (pac == null && j < 3){
            System.out.println("Paciente nao encontrado:");
            System.out.print("\nInforme o nome do paciente: ");
            nomePac = in.nextLine();
            pac = BancoDeDados.buscarPaciente(nomePac);
            j++;
        }
        msgs.enviarMensagens(BancoDeDados.buscarConsultaPaciente(pac));

    }
    
}
