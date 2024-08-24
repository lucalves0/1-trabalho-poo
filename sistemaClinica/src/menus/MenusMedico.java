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
import gerenciadorMensagens.*;

public class MenusMedico{
    Scanner in = new Scanner(System.in);
    
    // métodos de menus
    public boolean menuPrincipal(Medico MED){
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
                case "1" -> retornado = menuProntuariosInicial(MED);
                case "2" -> {
                    System.out.println("+------------------------------------+");
                    System.out.println("|Informe o nome do paciente:         |");
                    System.out.println("|                                    |");
                    System.out.println("|(0) Voltar                          |");
                    System.out.println("+------------------------------------+");
                    System.out.print("|>>> ");
                    nomePaciente = in.nextLine();
                    switch(nomePaciente){
                        case "0" -> System.out.println("");
                        default -> {
                            Paciente pac = MED.buscarPaciente(nomePaciente);
                            int j = 0;
                            while (pac == null && j < 3){
                                System.out.println("Paciente nao encontrado:");
                                System.out.print("\nInforme o nome do Paciente: ");
                                nomePaciente = in.nextLine();
                                pac = MED.buscarPaciente(nomePaciente);
                                ++j;
                            }
                            if (pac != null){
                                retornado = menuFichaPaciente(MED, nomePaciente);
                            }
                        }
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
    public boolean menuProntuariosInicial(Medico MED){ 
        // objeto paciente
        String NomePaciente;
        
        System.out.println("+------------------------------------+");
        System.out.println("|=========== PRONTUARIOS ============|");
        System.out.println("+------------------------------------+");
        System.out.println("|Informe o nome do paciente          |");
        System.out.println("|                                    |");
        System.out.println("|(0) Voltar                          |");
        System.out.println("+------------------------------------+");
        System.out.print("|>>> ");
        NomePaciente = in.nextLine();
        System.out.println("+------------------------------------+");
        
        switch(NomePaciente){
            case "0" -> System.out.println("");
            default -> {
                // System.out.println(NomePaciente);
                Paciente pac = MED.buscarPaciente(NomePaciente);
                int j = 0;
                while (pac == null && j < 3){
                    System.out.println("Paciente nao encontrado:");
                    System.out.print("\nInforme o nome do paciente: ");
                    NomePaciente = in.nextLine();
                    pac = MED.buscarPaciente(NomePaciente);
                    ++j;
                }
                if (pac != null){
                    menuProntuariosSecundario(MED, NomePaciente);
                }
            }
        }
        
        
        return true; //voltar;
    }
    
    public boolean menuProntuariosSecundario(Medico MED, String nome){
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
            System.out.println("+----------------------------------------+");            
            
            switch(selecao){
                case "0" -> {
                    //voltar = true;
                    retornado = false;
                }
                case "1" -> retornado = consultarProntuarioPaciente(nome);
                case "2" -> retornado = MED.cadastrarProntuarioAtendimento(nome);
                case "3" -> retornado = MED.atualizarProntuarioAtendimento(nome);
                case "4" -> retornado = apagarProntuarioAtendimento(nome);
            }
        }      
        return true;
    }

// -----------------------   MENUS FICHA DO PACIENTE   ----------------------------------
    public boolean menuFichaPaciente(Medico MED, String nome){
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
                case "1" -> retornado = MED.adicionarDadosComplementares(nome);
                case "2" -> retornado = MED.atualizarDadosComplementares(nome);
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
        
        boolean retornado = true;
        while (retornado){
            System.out.println("+------------------------------------+");
            System.out.println("|             RELATORIOS             |");
            System.out.println("+------------------------------------+");
            System.out.println("|(1) Receita                         |");
            System.out.println("|(2) Atestado                        |");
            System.out.println("|(3) Declaracao de acompanhamento    |");       
            System.out.println("|(4) Clientes atendidos no mes       |");
            System.out.println("|                                    |");
            System.out.println("|(0) Voltar                          |");
            System.out.println("+------------------------------------+");
            System.out.print(">>> ");
            opcao = in.nextLine();
            switch(opcao){
                case "1" -> receita();
                case "2" -> atestado();
                case "3" -> declaracaoAcompanhamento();
                case "4" -> clientesNoMes();
                case "0" -> retornado = false;
            }
        }  
        return true;
    }
    
    public void receita(){
        System.out.println("Receituario selecionado.");
        // in.nextLine();
        System.out.println("");
        System.out.println("Insira o nome completo do medico a emitir a receita e aperte enter: ");
        System.out.printf(">>> ");
        String nomeMedico = in.nextLine();
        System.out.println("");
        System.out.println("Insira o nome completo do paciente e aperte enter: ");
        System.out.printf(">>> ");
        String nomePaciente = in.nextLine();
        System.out.println("");
        System.out.println("Agora insira a data de emissao do atestado e aperte enter: ");
        System.out.printf(">>> ");
        String dataReceita = in.nextLine();
        System.out.println("");
        ArrayList<String> medicacoes = new ArrayList<>();
        ArrayList<String> quantidadesPrescritas = new ArrayList<>();
        ArrayList<String> modosDeUsarPrescritos = new ArrayList<>();
        String medicacao;
        do{
            System.out.println("Insira o nome da medicacao receitada e aperte enter,");
            System.out.println("ou, caso finalizada a receita, apenas aperte enter:");
            System.out.printf(">>> ");
            medicacao = in.nextLine();
            System.out.println("");
            if(!"".equals(medicacao)){
                medicacoes.add(medicacao);
                System.out.println("Insira a quantidade da medicacao prescrita e aperte enter:");
                System.out.printf(">>> ");
                String quantidadePrescrita = in.nextLine();
                System.out.println("");
                quantidadesPrescritas.add(quantidadePrescrita);
                System.out.println("Insira o modo de usar da medicacao prescrita e aperte enter:");
                System.out.printf(">>> ");
                String modoDeUsarPrescrito = in.nextLine();
                System.out.println("");
                modosDeUsarPrescritos.add(modoDeUsarPrescrito);
            }
        }while(!"".equals(medicacao));
        
        System.out.println("+------------------------------------+");
        System.out.println("|            Receita Medica          |");
        System.out.println("+------------------------------------+");
        System.out.printf("Paciente: %s\n", nomePaciente);
        System.out.println("");
        System.out.println("Prescricao:");
        System.out.println("");
        for(int i = 0; i < medicacoes.size(); i++){
            String medPrescrita = medicacoes.get(i);
            String qtdPrescrita = quantidadesPrescritas.get(i);
            String modoUsarPrescrito = modosDeUsarPrescritos.get(i);
            System.out.printf("%s ------- %s\n", medPrescrita, qtdPrescrita);
            System.out.printf("%s\n", modoUsarPrescrito);
        }
        
        System.out.println("");
        System.out.printf("Medico: %s\n", nomeMedico);
        System.out.printf("Data: %s\n", dataReceita);
        System.out.println("");
        System.out.println("Receita emitida. Aperte enter para continuar.");
        System.out.printf(">>> ");
        in.nextLine();
        System.out.println("");
    }

    public void atestado(){
        System.out.println("Declaracao de atestado medico selecionado: ");
        // in.nextLine();
        System.out.println("");
        System.out.println("Insira o nome completo do medico a declarar o atestado e aperte enter: ");
        System.out.printf(">>> ");
        String nomeMedico = in.nextLine();
        System.out.println("");
        System.out.println("Insira o nome completo do paciente e aperte enter: ");
        System.out.printf(">>> ");
        String nomePaciente = in.nextLine();
        System.out.println("");
        System.out.println("Agora insira a quantidade de dias de atestado e aperte enter: ");
        System.out.printf(">>> ");
        String quantidadeDiasAtestado = in.nextLine();
        System.out.println("");
        System.out.println("Agora insira a data de emissao do atestado e aperte enter: ");
        System.out.printf(">>> ");
        String dataAtestado = in.nextLine();
        System.out.println("");
        System.out.println("+------------------------------------+");
        System.out.println("|           Atestado Medico          |");
        System.out.println("+------------------------------------+");
        System.out.printf("Eu, %s,\n", nomeMedico);
        System.out.printf("forneco o presente atestado medico referente a %s\n", nomePaciente);
        System.out.printf("para fins de afastamento de suas atividades pelo periodo de %s dias,\n", quantidadeDiasAtestado);
        System.out.printf("no dia %s.\n", dataAtestado);
        System.out.println("");
        System.out.println("Atestado realizado. Aperte enter para continuar.");
        System.out.printf(">>> ");
        in.nextLine();
        System.out.println("");
        
    }

    public void declaracaoAcompanhamento(){
        System.out.println("Declaracao de acompanhamento selecionado: ");
        in.nextLine();
        System.out.println("");
        System.out.println("Insira o nome completo do medico a declarar acompanhamento e aperte enter: ");
        System.out.printf(">>> ");
        String nomeMedico = in.nextLine();
        System.out.println("");
        System.out.println("Insira o nome completo do acompanhante e aperte enter: ");
        System.out.printf(">>> ");
        String nomeAcompanhante = in.nextLine();
        System.out.println("");
        System.out.println("Insira o nome completo do paciente acompanhado e aperte enter: ");
        System.out.printf(">>> ");
        String nomeAcompanhado = in.nextLine();
        System.out.println("");
        System.out.println("Agora insira a data em que o paciente foi acompanhado e aperte enter: ");
        System.out.printf(">>> ");
        String dataAcompanhamento = in.nextLine();
        System.out.println("");
        System.out.println("+------------------------------------+");
        System.out.println("|    DECLARACAO DE ACOMPANHAMENTO    |");
        System.out.println("+------------------------------------+");
        System.out.printf("Eu, %s,\n", nomeMedico);
        System.out.printf("declaro que %s\n", nomeAcompanhante);
        System.out.printf("acompanhou %s\n", nomeAcompanhado);
        System.out.printf("em uma consulta em meu consultorio\n");
        System.out.printf("no dia %s", dataAcompanhamento);
        System.out.println("");
        System.out.println("Declaracao realizada. Aperte enter para continuar.");
        System.out.printf(">>> ");
        in.nextLine();
        System.out.println("");
    }
    
    public void clientesNoMes(){
        // in.nextLine();
        System.out.println("");

        // Invoca o gerenciador de mensagens para obter a data de hoje
        GerenciadorMensagens gerMens = new GerenciadorMensagens();

        // Obtem a data e mes de hoje
        String dataHoje = gerMens.getData();
        String mesHoje = dataHoje.substring(3,5);

        // Cria um objeto da classe BancoDeDados para obter a ArrayList prontAtendClientesNoMes, de ProntuarioAtendimento
        BancoDeDados bancoClientesNoMes = new BancoDeDados();
        ArrayList<ProntuarioAtendimento> prontAtendClientesNoMes = bancoClientesNoMes.buscarProntuarioAtendimentos();
        
        // Cria a ArrayList idsClientesMes, para que não seja contado um mesmo cliente repetidas vezes
        ArrayList<Integer> idsClientesMes = new ArrayList<>();

        // Inicia os contadores de atendimentos no mes e clientes no mes
        int qtdProntAtendNoMes = 0;
        int qtdClientesNoMes = 0;

        // Itera por todos os atendimentos
        for (ProntuarioAtendimento prontAtendIterado : prontAtendClientesNoMes){
        //for(int i = 0; i < prontAtendClientesNoMes.size(); i++){
            //ProntuarioAtendimento prontAtendIterado = prontAtendClientesNoMes.get(i);
            
            // Obtem a data e mes de atendimento do prontuario iterado
            String dataAtendimento = prontAtendIterado.getDataAtendimento();
            String mesAtendimento = dataAtendimento.substring(3, 5);

            // Se o mes de atendimento for o mesmo do mes de hoje, incrementa o contador de atendimentos no mes
            if(mesHoje.equals(mesAtendimento)){
                qtdProntAtendNoMes++;
                
                // Obtem o paciente do atendimento iterado e seu ID
                Paciente pacienteAtendimento = prontAtendIterado.getPaciente();
                int idClienteAtendimento = pacienteAtendimento.getId();

                // Verifica se o paciente está na ArrayList que criamos, ou seja, se seu atendimento já foi contabilizado
                int indiceClienteAtendimento = idsClientesMes.indexOf(idClienteAtendimento);

                // Caso o atendimento do paciente não havia sido contabilizado, contabiliza esse atendimento
                // e incrementa a quantidade de clientes atendidos no mes
                if(indiceClienteAtendimento == -1){
                    qtdClientesNoMes++;
                    idsClientesMes.add(idClienteAtendimento);
                }
            }
        }
        System.out.printf("Houveram %d atendimentos no mes,\natendendo a %d clientes distintos.\n\n", qtdProntAtendNoMes, qtdClientesNoMes);
        System.out.println("Pressione enter para continuar");
        System.out.printf(">>> ");
        in.nextLine();
        System.out.println("");
    }
// ------------------------   MÉTODOS DE GERENCIAMENTO  ----------------------------------
    public boolean consultarProntuarioPaciente(String nome){
        ProntuarioPaciente PPAC = banco.buscarProntuarioPaciente(nome);
        if (PPAC != null){
            PPAC.mostrarProntuarioPaciente();
        } else {
            System.out.println("Prontuario nao encontrado");
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
                    System.out.println("============= HISTORICO DE ATENDIMENTOS DO PACIENTE =============");
                    for (ProntuarioAtendimento PAT : historico){
                        PAT.resumoProntuarioAtendimento();
                    }
                    System.out.println("=================================================================");
                    System.out.println("Prontuario removido com sucesso");
                }  
            }
        } else {
            System.out.println("Prontuario do Paciente nao encontrado!");
        }
        return true;
    }
    

    
}
