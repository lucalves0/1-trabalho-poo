/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import java.util.Scanner;
import java.util.ArrayList;
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
        String nomePaciente;
        boolean voltar = false;
        boolean retornado = true;
        while (retornado) {
            System.out.println("+------------------------------------+");
            System.out.println("|======== CONSULTÓRIO MÉDICO ========|");
            System.out.println("+------------------------------------+");
            System.out.println("|(1) Prontuários                     |");
            System.out.println("|(2) Ficha do paciente               |");
            System.out.println("|(2) Gerar relatórios                |");
            System.out.println("|                                    |");
            System.out.println("|(0) Voltar                          |");
            System.out.println("+------------------------------------+");
            System.out.print(">>> ");
            opcao = in.nextLine();

            switch(opcao){
                case "1" -> retornado = menuProntuariosInicial();
                case "2" -> {
                    System.out.println("+------------------------------------+");
                    System.out.println("|Informe o nome do paciente:         |");
                    System.out.print("|>>> ");
                    nomePaciente = in.nextLine();
                    retornado = menuFichaPaciente(nomePaciente);
                }
                case "3" -> retornado = menuRelatorios();
                case "0" -> {
                    voltar = true;
                    retornado = false;
                }   
            }
        }
        return voltar;
    }
    
    
// --------------------------   MENUS PRONTUÁRIOS   -------------------------------------
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
                case "3" -> retornado = atualizarProntuarioAtendimento(nome);
                case "4" -> System.out.println("EM OBRAS");
                
            }
            return voltar;
        }
        
        
        
        
        PacienteEncontrado = banco.buscarPaciente(nome);
        ProntuarioPacienteEcontrado = banco.buscarProntuarioPaciente(nome);
        
        return true;
    }

// -----------------------   MENUS FICHA DO PACIENTE   ----------------------------------
    public boolean menuFichaPaciente(String nome){
        String opcao;
        boolean voltar = false;
        boolean retornado = true;
        while (retornado) {
            System.out.println("+------------------------------------+");
            System.out.println("|========= FICHA DO PACIENTE ========|");
            System.out.println("+------------------------------------+");
            System.out.println("|(1) Adicionar dados complementares  |");
            System.out.println("|(2) Atualizar dados complementares  |");
            System.out.println("|                                    |");
            System.out.println("|(0) Voltar                          |");
            System.out.println("+------------------------------------+");
            System.out.print(">>> ");
            opcao = in.nextLine();

            switch(opcao){
                case "1" -> retornado = adicionarDadosComplementares(nome);
                case "2" -> retornado = atualizarDadosComplementares(nome);
                case "0" -> {
                    voltar = true;
                    retornado = false;
                }   
            }
        }
        return voltar;
    }
    
    
// ---------------------------   MENUS RELATÓRIOS   --------------------------------------
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
    
// ------------------------   MÉTODOS DE GERENCIAMENTO  ----------------------------------
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
    
    public boolean atualizarProntuarioAtendimento(String nome){
        int IDBuscado;
        ProntuarioAtendimento PATalterar;
        ProntuarioPaciente PPAC = banco.buscarProntuarioPaciente(nome);
        ArrayList<ProntuarioAtendimento> historico = PPAC.getHistoricoAtendimentos();
        
        System.out.println("============= HISTÓRICO DE ATENDIMENTOS DO PACIENTE =============");
        for (ProntuarioAtendimento PAT : historico){
            PAT.resumoProntuarioAtendimento();
        }
        System.out.println("=================================================================");
        System.out.println("Qual dos prontuários você deseja atualizar?");
        System.out.print("Digite o ID: ");
        IDBuscado = in.nextInt();
        in.nextLine();
        
        PATalterar = banco.buscarProntuarioAtendimento(IDBuscado);
        
        return true;
    }
    
    public boolean adicionarDadosComplementares(String nome){
        Paciente PAC = banco.buscarPaciente(nome);
        
        String fuma;
        String bebe;
        String nivelColesterol;
        String diabete;
        String doencaCardiaca;
        String cirurgias;
        String alergias;
        
        System.out.println("+------------------------------------------------------+");
        System.out.println("|========= CADASTRO DE DADOS COMPLEMENTARES ===========|");
        System.out.println("+------------------------------------------------------+");
        System.out.print("É fumante?: ");
        fuma = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Bebe?: ");
        bebe = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Nível do colesterol: ");
        nivelColesterol = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Diabetes: ");
        diabete = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Doença cardíaca: ");
        doencaCardiaca = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Cirurgias realizadas: ");
        cirurgias = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Alergias: ");
        alergias = in.nextLine();

        PAC.setDadosComplementares(fuma, bebe, nivelColesterol, diabete, doencaCardiaca, cirurgias, alergias);
            
        // mensagem confirmando o cadastro 
        System.out.println("\n=========== Dados complementares cadastrados! ==============");
        PAC.visualizarDadosCompleto();
        System.out.println("================================================================");          
        return true;
    }
    
    public boolean atualizarDadosComplementares(String nome){
        Paciente PAC = banco.buscarPaciente(nome);
        boolean voltar = false;
        
        String selecao;
        
        String fuma;
        String bebe;
        String nivelColesterol;
        String diabete;
        String doencaCardiaca;
        String cirurgias;
        String alergias;
        
        PAC.visualizarDadosCompleto();
        System.out.println("+----------------------------------------------+");
        System.out.println("|Informe o número do dado que deseja atualizar |");
        System.out.println("|                                              |");
        System.out.println("|(0) Voltar                                    |");
        while(!voltar){
            System.out.print("\n|>>> ");
            selecao = in.nextLine();
            
            switch(selecao){
                case "0" -> voltar = true;
                case "6" -> {
                    System.out.print("\nÉ fumante?: ");
                    fuma = in.nextLine();
                    PAC.setFuma(fuma);
                }
                case "7" -> {
                    System.out.print("\nBebe?: ");
                    bebe = in.nextLine();
                    PAC.setBebe(bebe);
                }
                case "8" -> {
                    System.out.print("\nNível do colesterol: ");
                    nivelColesterol = in.nextLine();
                    PAC.setNivelColesterol(nivelColesterol);
                }
                case "9" -> {
                    System.out.print("\nDiabetes: ");
                    diabete = in.nextLine();
                    PAC.setDiabete(diabete);
                }
                case "10" -> {
                    System.out.print("\nDoença cardíaca: ");
                    doencaCardiaca = in.nextLine();
                    PAC.setDoencaCardiaca(doencaCardiaca);
                }
                case "11" -> {
                    System.out.print("\nCirurgias realizadas: ");
                    cirurgias = in.nextLine();
                    PAC.setCirurgias(cirurgias);
                }
                case "12" -> {
                    System.out.print("\nAlergias: ");
                    alergias = in.nextLine();
                    PAC.setAlergias(alergias);
                }
            }
        }
        return true;
    }
}
