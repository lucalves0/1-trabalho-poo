/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import interfaces.*;
import pessoas.*;
import bancoDados.*;
import java.util.Scanner;

public class MenuSecretaria{
    // objeto banco de dados
    BancoDeDados banco = new BancoDeDados();
    Scanner in = new Scanner(System.in);
    
    public boolean menuPrincipal(){
        boolean voltar = false;
        boolean retornado = true;
        while (retornado){
            String selecao;
            System.out.println("+------------------------------------+");
            System.out.println("|         MENU DA SECRETARIA         |");
            System.out.println("+------------------------------------+");
            System.out.println("|(1) Gerenciar pacientes             |");
            System.out.println("|(2) Gerenciar consultas             |");
            System.out.println("|                                    |");
            System.out.println("|(0) Voltar                          |");
            System.out.println("+------------------------------------+");
            selecao = in.next();

            switch(selecao){
                case "0" -> voltar = true;
                case "1" -> retornado = menuGerenciarPacientes();
                case "2" -> retornado = menuGerenciarConsultas();
            }            
        }
        return voltar;
    }
    
    public boolean menuGerenciarPacientes(){
        boolean voltar = false;
        boolean retornado = true;
        String selecao;
        
        while (retornado){
            System.out.println("+------------------------------------+");
            System.out.println("|======= GERENCIAR PACIENTES ========|");
            System.out.println("+------------------------------------+");
            System.out.println("|(1) Cadastrar paciente              |");
            System.out.println("|(2) Atualizar dados de pacientes    |");
            System.out.println("|(3) Deletar paciente                |");
            System.out.println("|                                    |");
            System.out.println("|(0) Voltar                          |");
            System.out.println("+------------------------------------+");
            System.out.print(">>> ");
            selecao = in.next();
            
            switch(selecao){
                case "0" -> voltar = true;
                case "1" -> retornado = cadastrarPaciente();
                case "2" -> retornado = atualizarPaciente();
                case "3" -> retornado = removerPaciente();
            }            
        }
        return voltar;            
    }
    
    public boolean menuGerenciarConsultas(){
        return true;
    };
    
    public boolean cadastrarPaciente() {     
        // variáveis de entrada
        String nome;
        String data_nascimento;
        String endereco;
        String contato;
        String tipo_convenio;
        Paciente paciente;

        System.out.println("+------------------------------------------------------+");
        System.out.println("|================ CADSTRO DE PACIENTE =================|");
        System.out.println("+------------------------------------------------------+");
        System.out.print("Nome: ");
        nome = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Data de nascimento: ");
        data_nascimento = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Endereço: ");
        endereco = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Contato telefonico: ");
        contato = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Tipo do convênio: ");
        tipo_convenio = in.nextLine();
        
        // adicionando paciente ao banco de dados
        paciente = new Paciente(nome, data_nascimento, endereco, contato, tipo_convenio);
        banco.adicionarPaciente(paciente);
        
        // mensagem confirmando o cadastro 
        System.out.println("\n========= Paciente cadastrado com sucesso ! ============");
        // paciente.visualizar_dados();
        // mudei o método para ter certeza de que o paciente foi cadastrado no banco de dados
        banco.buscarPaciente(paciente).visualizar_dados();
        System.out.println("========================================================");
        // System.out.println("+------------------------------------------------------+");
        
        return true;
    }

    public boolean atualizarPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean removerPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
