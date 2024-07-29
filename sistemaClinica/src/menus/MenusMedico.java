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
            System.out.println("|======== CONSULTORIO MEDICO ========|");
            System.out.println("+------------------------------------+");
            System.out.println("|(1) Prontuarios                     |");
            System.out.println("|(2) Ficha do paciente               |");
            System.out.println("|(3) Gerar relatorios                |");
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
                    Paciente pac = banco.buscarPaciente(nomePaciente);
                    int j = 0;
                    while (pac == null && j < 3){
                        System.out.println("Paciente nao encontrado:");
                        System.out.print("\nPaciente: ");
                        nomePaciente = in.nextLine();
                        pac = banco.buscarPaciente(nomePaciente);
                        ++j;
                    }
                    if (pac != null){
                        retornado = menuFichaPaciente(nomePaciente);
                    }
                    
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
        
        boolean voltar = true;
        System.out.println("+------------------------------------+");
        System.out.println("|=========== PRONTUARIOS ============|");
        System.out.println("+------------------------------------+");
        System.out.println("|Informe o nome do paciente          |");
        System.out.print("|>>> ");
        NomePaciente = in.nextLine();
        System.out.println("+------------------------------------+");
        
        System.out.println(NomePaciente);
        
        Paciente pac = banco.buscarPaciente(NomePaciente);
        int j = 0;
        
        while (pac == null && j < 3){
            System.out.println("Paciente nao encontrado:");
            System.out.print("\nPaciente: ");
            NomePaciente = in.nextLine();
            pac = banco.buscarPaciente(NomePaciente);
            ++j;
        }
        
        if (pac != null){
            voltar = false;
            menuProntuariosSecundario(NomePaciente);
        }
        
        return voltar;
    }
    
    public boolean menuProntuariosSecundario(String nome){
        String selecao;
        boolean retornado = true;
        
        while (retornado){
            System.out.println("\n+----------------------------------------+");
            System.out.println("|============= PRONTUARIOS ==============|");
            System.out.println("+----------------------------------------+");
            System.out.println("|(1) Consultar Prontuario do Paciente    |");
            System.out.println("|(2) Cadastrar Prontuario de Atendimento |");
            System.out.println("|(3) Atualizar Prontuario de Atendimento |");
            System.out.println("|(4) Apagar Prontuario de Atendimento    |");
            System.out.println("|                                        |");
            System.out.println("|(0) Voltar                              |");
            System.out.print("|>>> ");
            selecao = in.nextLine();
            System.out.println("+------------------------------------+");            
            
            switch(selecao){
                case "0" -> {
                    //voltar = true;
                    retornado = false;
                }
                case "1" -> retornado = consultarProntuarioPaciente(nome);
                case "2" -> retornado = cadastrarProntuarioAtendimento(nome);
                case "3" -> retornado = atualizarProntuarioAtendimento(nome);
                case "4" -> retornado = apagarProntuarioAtendimento(nome);
            }
        }      
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
        System.out.println("|             RELATORIOS             |");
        System.out.println("+------------------------------------+");
        System.out.println("|(1) Receita                         |");
        System.out.println("|(2) Atestado                        |");
        System.out.println("|(3) Declaração de acompanhamento    |");       
        System.out.println("|(4) Clientes atendidos no mes       |");
        System.out.println("|                                    |");
        System.out.println("|(0) Voltar                          |");
        System.out.println("+------------------------------------+");
        opcao = in.next();

        switch(opcao){
            case "1" -> System.out.println("RECEITA"); //TODO
            case "2" -> System.out.println("ATESTADO"); //TODO
            case "3" -> {
                        System.out.println("Declaração de acompanhamento selecionado: ");
                        System.out.println("Insira o nome do médico a declarar acompanhamento e aperte enter: ");
                        String nomeMedico = in.nextLine();
                        System.out.println("Insira o nome completo do acompanhante e aperte enter: ");
                        String nomeAcompanhante = in.nextLine();
                        System.out.println("Agora insira o nome completo do paciente acompanhado e aperte enter: ");
                        String nomeAcompanhado = in.nextLine();
                        System.out.println("+------------------------------------+");
                        System.out.println("|    DECLARAÇÃO DE ACOMPANHAMENTO    |");
                        System.out.println("+------------------------------------+");
                        System.out.printf("Eu, %s,\n", nomeMedico);
                        System.out.printf(" declaro que %s\n", nomeAcompanhante);
                        System.out.printf("acompanhou %s\n", nomeAcompanhado);
                        System.out.printf("em uma consulta em meu consultório.\n");
                        System.out.println("");
                        }
            case "4" -> System.out.println("CLIENTES NO MÊS"); //TODO
            case "0" -> voltar = true;
        }
        
        return voltar;
    }
    
// ------------------------   MÉTODOS DE GERENCIAMENTO  ----------------------------------
    public boolean consultarProntuarioPaciente(String nome){
        ProntuarioPaciente PPAC = banco.buscarProntuarioPaciente(nome);
        if (PPAC != null){
            PPAC.mostrarProntuarioPaciente();
        } else {
            System.out.println("Prontuário nao encontrado");
        }
        return true;
        
    }
    
    public boolean cadastrarProntuarioAtendimento(String nome){      
        ProntuarioAtendimento PAT;
        
        // variáveis de entrada
        String nomeMedico;
        
        String dataAtendimento;
        Paciente paciente = banco.buscarPaciente(nome);
        Medico medico;
        String sintomas;
        String diagnostico;
        String prescricao;
        String dataRetorno;

        System.out.println("+------------------------------------------------------+");
        System.out.println("|========== NOVO PRONTUARIO DE ATENDIMENTO ============|");
        System.out.println("+------------------------------------------------------+");
        System.out.print("Data do atendimento: ");
        dataAtendimento = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Nome do medico: ");
        nomeMedico = in.nextLine();
        medico = banco.buscarMedico(nomeMedico);
        int i = 0;
        while (medico == null && i < 3){
            System.out.println("Medico nao encontrado");
            System.out.print("\nNome do Medico: ");
            nomeMedico = in.nextLine();
            medico = banco.buscarMedico(nomeMedico);
            ++i;
        }
        System.out.println("+------------------------------------------------------+");
        System.out.print("Sintomas: ");
        sintomas = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Diagnostico: ");
        diagnostico = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Prescricao: ");
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
        // variaveis
        int IDBuscado;
        boolean voltar = false;
        String selecao;
        
        String dataAtend;
        String nomePac;
        String nomeMed;
        String sintomas;
        String diagnostico;
        String prescricao;
        String dataRet;
        
        // objetos
        ProntuarioAtendimento PATalterar;
        ProntuarioPaciente PPAC = banco.buscarProntuarioPaciente(nome);
        if (PPAC != null){
            
            ArrayList<ProntuarioAtendimento> historico = PPAC.getHistoricoAtendimentos();
            System.out.println("============= HISTORICO DE ATENDIMENTOS DO PACIENTE =============");
            boolean historicoVazio = historico.isEmpty();
            if (historicoVazio){
                System.out.println("O paciente nao possui historico de atendimentos!");
            } else {
                for (ProntuarioAtendimento PAT : historico){
                    PAT.resumoProntuarioAtendimento();
                }
            }
            System.out.println("=================================================================");
            if (!historicoVazio){
                System.out.println("Qual dos prontuarios voce deseja atualizar?");
                System.out.print("Digite o ID: ");
                IDBuscado = in.nextInt();
                in.nextLine();

                PATalterar = banco.buscarProntuarioAtendimento(IDBuscado);

                if(PATalterar != null){
                    PATalterar.mostrarProntuarioAtendimento();
                }else{
                    return true;
                }

                System.out.println("+----------------------------------------------+");
                System.out.println("|Informe o numero do dado que deseja atualizar |");
                System.out.println("|                                              |");
                System.out.println("|(0) Voltar                                    |");
                while(!voltar){
                    System.out.print("\n|>>> ");
                    selecao = in.nextLine();
                    switch(selecao){
                        case "0" -> voltar = true;
                        case "1" -> {
                            System.out.print("\nData do atendimento: ");
                            dataAtend = in.nextLine();
                            PATalterar.setDataAtendimento(dataAtend);
                        }
                        case "2" -> {
                            System.out.print("\nPaciente: ");
                            nomePac = in.nextLine();
                            Paciente pac = banco.buscarPaciente(nomePac);
                            int j = 0;
                            while (pac == null && j < 3){
                                System.out.println("Paciente nao encontrado:");
                                System.out.print("\nPaciente: ");
                                nomePac = in.nextLine();
                                pac = banco.buscarPaciente(nomePac);
                                ++j;
                            }
                            if (pac != null){
                                PATalterar.setPaciente(banco.buscarPaciente(nomePac));
                            }
                        }
                        case "3" -> {
                            System.out.print("\nMedico: ");
                            nomeMed = in.nextLine();
                            Medico medico = banco.buscarMedico(nomeMed);
                            int i = 0;
                            while (medico == null && i < 3){
                                System.out.println("Medico nao encontrado:");
                                System.out.print("\nMedico: ");
                                nomeMed = in.nextLine();
                                medico = banco.buscarMedico(nomeMed);
                                ++i;
                            }
                            if (medico != null){
                                PATalterar.setMedico(medico);
                            }
                        }
                        case "4" -> {
                            System.out.print("\nSintomas: ");
                            sintomas = in.nextLine();
                            PATalterar.setSintomas(sintomas);
                        }
                        case "5" -> {
                            System.out.print("\nDiagnostico: ");
                            diagnostico = in.nextLine();
                            PATalterar.setDignostico(diagnostico);
                        }
                        case "6" -> {
                            System.out.print("\nPrescricao: ");
                            prescricao = in.nextLine();
                            PATalterar.setPrescricao(prescricao);
                        }
                        case "7" -> {
                            System.out.print("\nRetorno: ");
                            dataRet = in.nextLine();
                            PATalterar.setDataRetorno(dataRet);
                        }
                    }
                }
            }
            
        } else {
            System.out.println("Prontuário do Paciente nao encontrado");
        }
        return true;
    }
    
    public boolean apagarProntuarioAtendimento(String nome){
        // variáveis
        int IDBuscado;
        
        // objetos
        ProntuarioPaciente PPAC = banco.buscarProntuarioPaciente(nome);
        if (PPAC != null){
            ArrayList<ProntuarioAtendimento> historico = PPAC.getHistoricoAtendimentos();

            // mostrar histórico de atendimentos do paciente
            System.out.println("============= HISTORICO DE ATENDIMENTOS DO PACIENTE =============");
            boolean historicoVazio = historico.isEmpty();
            if (historicoVazio){
                System.out.println("O paciente nao possui historico de atendimentos!");
            } else {
                for (ProntuarioAtendimento PAT : historico){
                    PAT.resumoProntuarioAtendimento();
                }
            }
            System.out.println("=================================================================");
            if (!historicoVazio){
                System.out.println("Qual dos prontuarios voce deseja remover?");
                System.out.print("Digite o ID: ");
                IDBuscado = in.nextInt();
                in.nextLine();

                boolean resp = banco.removerProntuarioAtendimento(IDBuscado);

                // mostrar histórico de atendimentos do paciente
                if (resp){
                    System.out.println("============= HISTÓRICO DE ATENDIMENTOS DO PACIENTE =============");
                    for (ProntuarioAtendimento PAT : historico){
                        PAT.resumoProntuarioAtendimento();
                    }
                    System.out.println("=================================================================");
                    System.out.println("Prontuario removido com sucesso");
                }  
            }
        } else {
            System.out.println("Prontuario do Paciente não encontrado!");
        }
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
        System.out.print("Nivel do colesterol: ");
        nivelColesterol = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Diabetes: ");
        diabete = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Doenca cardiaca: ");
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
        System.out.println("|Informe o numero do dado que deseja atualizar |");
        System.out.println("|                                              |");
        System.out.println("|(0) Voltar                                    |");
        while(!voltar){
            System.out.print("\n|>>> ");
            selecao = in.nextLine();
            
            switch(selecao){
                case "0" -> voltar = true;
                case "7" -> {
                    System.out.print("\nÉ fumante?: ");
                    fuma = in.nextLine();
                    PAC.setFuma(fuma);
                }
                case "8" -> {
                    System.out.print("\nBebe?: ");
                    bebe = in.nextLine();
                    PAC.setBebe(bebe);
                }
                case "9" -> {
                    System.out.print("\nNivel do colesterol: ");
                    nivelColesterol = in.nextLine();
                    PAC.setNivelColesterol(nivelColesterol);
                }
                case "10" -> {
                    System.out.print("\nDiabetes: ");
                    diabete = in.nextLine();
                    PAC.setDiabete(diabete);
                }
                case "11" -> {
                    System.out.print("\nDoenca cardiaca: ");
                    doencaCardiaca = in.nextLine();
                    PAC.setDoencaCardiaca(doencaCardiaca);
                }
                case "12" -> {
                    System.out.print("\nCirurgias realizadas: ");
                    cirurgias = in.nextLine();
                    PAC.setCirurgias(cirurgias);
                }
                case "13" -> {
                    System.out.print("\nAlergias: ");
                    alergias = in.nextLine();
                    PAC.setAlergias(alergias);
                }
            }
        }
        return true;
    }
}
