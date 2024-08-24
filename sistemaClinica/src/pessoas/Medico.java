/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoas;
import bancoDados.BancoDeDados;
import documentos.ProntuarioAtendimento;
import documentos.ProntuarioPaciente;
import java.util.ArrayList;
import java.util.Scanner;
import gerenciadorMensagens.GerenciadorMensagens;

public class Medico extends Funcionario{
    private Scanner in = new Scanner(System.in);

// lista de pacientes que atende
    private ArrayList<Paciente> pacientesAtendidos;
    
    // método construtor
    public Medico(String nome, String CPF, BancoDeDados BD){
        super(nome, CPF, BD);
    }
    
    
    // MÉTODOS DE GERENCIAMENTO DE PACIENTES

    public void setPacientesAtendidos(ArrayList<Paciente> pacientesAtendidos) {
        this.pacientesAtendidos = pacientesAtendidos;
    }

    public ArrayList<Paciente> getPacientesAtendidos() {
        return pacientesAtendidos;
    }
    
    
    // OUTROS MÉTODOS
    public boolean adicionarDadosComplementares(String nome){
        Paciente PAC = buscarPaciente(nome);
        
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
        System.out.print("Eh fumante?: ");
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
        Paciente PAC = buscarPaciente(nome);
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
                    System.out.print("\nEh fumante?: ");
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


    public boolean atualizarProntuarioAtendimento(String nomePaciente){
        // variaveis
        int IDBuscado;
        boolean voltar = false;
        String selecao;
        
        String dataAtend;
        String nomePac;
        String sintomas;
        String diagnostico;
        String prescricao;
        String dataRet;
        
        
        ProntuarioAtendimento PATalterar;
        
        // primeiro buscamos o prontuario do paciente
        ProntuarioPaciente PPAC = this.buscarProntuarioPaciente(nomePaciente);
        
        // depois buscamos o histórico de atendimentos do paciente
        if (PPAC != null){
            ArrayList<ProntuarioAtendimento> historico = PPAC.getHistoricoAtendimentos();
            
            // printamos na tela o histórico de atendimentos do paciente
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

                PATalterar = buscarProntuarioAtendimento(IDBuscado);

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
                            Paciente pac = buscarPaciente(nomePac);
                            int j = 0;
                            while (pac == null && j < 3){
                                System.out.println("Paciente nao encontrado:");
                                System.out.print("\nPaciente: ");
                                nomePac = in.nextLine();
                                pac = buscarPaciente(nomePac);
                                ++j;
                            }
                            if (pac != null){
                                PATalterar.setPaciente(buscarPaciente(nomePac));
                            }
                        }
                        case "3" -> System.out.println("Descontinuado");
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
            System.out.println("Prontuario do Paciente nao encontrado");
        }
        return true;
    }
    
    public boolean cadastrarProntuarioAtendimento(String nome){      
        ProntuarioAtendimento PAT;
        
        // variáveis de entrada
        
        String dataAtendimento;
        Paciente paciente = buscarPaciente(nome);
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
        medico = this;
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
        this.adicionarProntuarioAtendimento(PAT);

        // System.out.println("+------------------------------------------------------+");
        return true;
    }
    
    
    
    public ProntuarioPaciente buscarProntuarioPaciente(String nomePaciente){
        ArrayList<ProntuarioPaciente> ProntuariosPacientes = this.getBDados().getProntuariosPacientes();
        for (ProntuarioPaciente PPAC : ProntuariosPacientes){
            if (PPAC.getPaciente().getNome().equalsIgnoreCase(nomePaciente)){
                return PPAC;
            } else {
                System.out.println("Prontuario do Paciente não encontrado");
            }
        }
        return null;
    }
    
    public ProntuarioAtendimento buscarProntuarioAtendimento(int ID){
        boolean encontrou = false;
        for (ProntuarioAtendimento PAT : this.getBDados().getProntuariosAtendimentos()) {
            if (PAT.getId() == ID){
                encontrou = true;
                return PAT;
            }
        if (!encontrou){
                System.out.println("Prontuario de Atendimento não encontrado");
            }
        }
        return null;
    }

    
    
    public void adicionarProntuarioAtendimento(ProntuarioAtendimento PAT){
        String nome;
        ProntuarioPaciente PPAC;
        
        ArrayList<ProntuarioAtendimento> Prontuarios = this.getBDados().getProntuariosAtendimentos();
        Prontuarios.add(PAT);
        
        // adicionando o atendimento na lista de histórico de atendimentos do paciente
        nome = PAT.getPaciente().getNome();
        PPAC = buscarProntuarioPaciente(nome);
        PPAC.setNovoAtendimento(PAT);
    }
    
    public int[] clientesNoMes(){
        // Invoca o gerenciador de mensagens para obter a data de hoje
        GerenciadorMensagens gerMens = new GerenciadorMensagens();

        // Obtem a data e mes de hoje
        String dataHoje = gerMens.getData();
        String mesHoje = dataHoje.substring(3,5);
        
        // Obtem uma ArrayList com os prontuários de atendimento
        // realizados, de acordo com o banco de dados associado.
        ArrayList<ProntuarioAtendimento> prontAtendClientesNoMes
        = super.getBDados().buscarProntuarioAtendimentos();
        
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
        // Cria um array de inteiros para retornar as quantidades computadas neste método
        int[] retorno = {qtdProntAtendNoMes, qtdClientesNoMes};
        return retorno;
    }
}
