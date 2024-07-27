/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import java.util.Scanner;
import bancoDados.*;
import pessoas.*;
import documentos.*;

public class MenusMedico{
    Scanner in = new Scanner(System.in);
    // objeto banco de dados
    BancoDeDados banco = new BancoDeDados();
    
    // métodos de menus
    public boolean menuPrincipal(){
        String opcao;
        boolean voltar = false;
        boolean retornado = true;
        while (retornado) {
            System.out.println("+------------------------------------+");
            System.out.println("|         CONSULTÓRIO MÉDICO         |");
            System.out.println("+------------------------------------+");
            System.out.println("|(1) Prontuários                     |");
            System.out.println("|(2) Gerar relatórios                |");
            System.out.println("|                                    |");
            System.out.println("|(0) Voltar                          |");
            System.out.println("+------------------------------------+");
            System.out.print(">>> ");
            opcao = in.next();

            switch(opcao){
                case "1" -> retornado = menuProntuariosInicial();
                case "2" -> retornado = menuRelatorios();
                case "0" -> {
                    voltar = true;
                    retornado = false;
                }   
            }
        }
        return voltar;
    }
    
    public boolean menuProntuariosInicial(){ 
        // objeto paciente
        String NomePaciente;
        
        boolean voltar = false;
        System.out.println("+------------------------------------+");
        System.out.println("|=========== PRONTUÁRIOS ============|");
        System.out.println("+------------------------------------+");
        System.out.println("|Informe o nome do paciente          |");
        System.out.println("|                                    |");
        System.out.println("|(0) Voltar                          |");
        System.out.print("|>>> ");
        NomePaciente = in.nextLine();
        System.out.println("+------------------------------------+");
        
        switch(NomePaciente){
            case "0" -> voltar = true;
            default -> menuProntuariosSecundario(NomePaciente);
        }
        
        return voltar;
    }
    
    public boolean menuProntuariosSecundario(String nome){
        Paciente PacienteEncontrado;
        ProntuarioPaciente ProntuarioPacienteEcontrado;
        String selecao;
        boolean retornado = true;
        boolean voltar = false;
        
        while (retornado){
            System.out.println("\n+----------------------------------------+");
            System.out.println("|============= PRONTUÁRIOS ==============|");
            System.out.println("+----------------------------------------+");
            System.out.println("|(1) Consultar Prontuario do Paciente    |");
            System.out.println("|(2) Cadastrar Prontuario de Atendimento |");
            System.out.println("|(3) Atualizar Prontuario de Atendimento |");
            System.out.println("|(4) Apagar Prontuario de Atendimento    |");
            System.out.println("|                                        |");
            System.out.println("|(0) Voltar                              |");
            System.out.print("|>>> ");
            selecao = in.next();
            System.out.println("+------------------------------------+");            
            
            switch(selecao){
                case "0" -> {
                    voltar = true;
                    retornado = false;
                }
                case "1" -> retornado = mostrarProntuarioPaciente(nome);
                case "2" -> retornado = cadastrarProntuarioAtendimento();
                case "3" -> System.out.println("EM OBRAS");
                case "4" -> System.out.println("EM OBRAS");
                
            }
            return voltar;
        }
        
        
        
        
        PacienteEncontrado = banco.buscarPaciente(nome);
        ProntuarioPacienteEcontrado = banco.buscarProntuarioPaciente(nome);
        
        return true;
    }
    
    public boolean menuRelatorios(){
        String opcao;
        
        boolean voltar = false;
        System.out.println("+------------------------------------+");
        System.out.println("|             RELATÓRIOS             |");
        System.out.println("+------------------------------------+");
        System.out.println("|(1) Receita                         |");
        System.out.println("|(2) Atestado                        |");
        System.out.println("|(3) Declaração de acompanhamento    |");       
        System.out.println("|(4) Clientes atendidos no mês       |");
        System.out.println("|                                    |");
        System.out.println("|(0) Voltar                          |");
        System.out.println("+------------------------------------+");
        opcao = in.next();

        switch(opcao){
            case "1" -> System.out.println("RECEITA");
            case "2" -> System.out.println("ATESTADO");
            case "3" -> System.out.println("DECLARAÇÃO");
            case "4" -> System.out.println("CLIETES NO MÊS");
            case "0" -> voltar = true;
        }
        
        return voltar;
    }
    
    // métodos de gerenciamento
    public boolean mostrarProntuarioPaciente(String nome){
        ProntuarioPaciente PPAC;
        
        PPAC = banco.buscarProntuarioPaciente(nome);
        PPAC.getPaciente().visualizar_dados();
        
        for (ProntuarioAtendimento PAT : PPAC.getHistoricoAtendimentos()){
            PAT.resumoProntuarioAtendimento();
        }
        return true;
    }
    
    public boolean cadastrarProntuarioAtendimento(){      
        ProntuarioAtendimento PAT;
        
        // variáveis de entrada
        String nomePaciente;
        String nomeMedico;
        
        String dataAtendimento;
        Paciente paciente;
        Medico medico;
        String sintomas;
        String diagnostico;
        String prescricao;
        String dataRetorno;

        System.out.println("+------------------------------------------------------+");
        System.out.println("|========== NOVO PRONTUÁRIO DE ATENDIMENTO ============|");
        System.out.println("+------------------------------------------------------+");
        System.out.print("Data do atendimento: ");
        dataAtendimento = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Nome do paciente: ");
        nomePaciente = in.nextLine();
        paciente = banco.buscarPaciente(nomePaciente);
        System.out.println("+------------------------------------------------------+");
        System.out.print("Nome do médico: ");
        nomeMedico = in.nextLine();
        medico = banco.buscarMedico(nomeMedico);
        System.out.println("+------------------------------------------------------+");
        System.out.print("Sintomas: ");
        sintomas = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Diagnóstico: ");
        diagnostico = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Prescrição: ");
        prescricao = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Data de Retorno: ");
        dataRetorno = in.nextLine();
        
        // adicionando prontuário de atendimento ao banco de dados
        PAT = new ProntuarioAtendimento(dataAtendimento, paciente, medico, sintomas, diagnostico, prescricao, dataRetorno);
        banco.adicionarProntuarioAtendimento(PAT);

        // System.out.println("+------------------------------------------------------+");
        return true;
    }
}
