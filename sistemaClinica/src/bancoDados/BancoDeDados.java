/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancoDados;
import java.util.ArrayList;
import pessoas.*;
import documentos.*;

public class BancoDeDados {   
    // lista de pacientes
    private static ArrayList<Paciente> Pacientes = new ArrayList<>();
    // lista de médicos
    private static ArrayList<Medico> Medicos = new ArrayList<>();
    // lista de secretárias
    private static ArrayList<Secretahria> Secretahrias = new ArrayList<>();
    // lista de consultas
    private static ArrayList<Consulta> Consultas = new ArrayList<>();
    // lista de prontuarios de pacientes
    private static ArrayList<ProntuarioPaciente> ProntuariosPacientes = new ArrayList<>();
    // lista de prontuarios de atendimentos
    private static ArrayList<ProntuarioAtendimento> ProntuariosAtendimentos = new ArrayList<>();
    
    
// --------------- MÉTODOS PARA ADICIONAR INFORMAÇÕES -----------------------------
    public static void adicionarPaciente(Paciente pac){
        if (pac != null){
            Pacientes.add(pac);
            // quando cadastramos um paciente, criamos seu prontuário
            ProntuarioPaciente PPAC = new ProntuarioPaciente(pac);
            ProntuariosPacientes.add(PPAC);
        }   
    }
    
    public static void adicionarMedico(Medico med){
        if (med != null){
            Medicos.add(med);
        }  
    }
    
    public static void adicionarSecretahria(Secretahria SEC){
        if (SEC != null){
            Secretahrias.add(SEC);
        }
    }
    
    public static void adicionarConsulta(Consulta con){
        Consultas.add(con);
    }
     
    public static void adicionarProntuarioAtendimento(ProntuarioAtendimento pat){
        String nome;
        ProntuarioPaciente PPAC;
        // adicionando atendimento na lista de atendimentos
        ProntuariosAtendimentos.add(pat);
        
        // adicionando o atendimento na lista de histórico de atendimentos do paciente
        nome = pat.getPaciente().getNome();
        PPAC = buscarProntuarioPaciente(nome);
        PPAC.setNovoAtendimento(pat);
    }

    
// ----------------- MÉTODOS PARA ENCONTRAR INFORMAÇÕES -------------------------------
    public static ArrayList<ProntuarioAtendimento> buscarProntuarioAtendimentos(){
        return ProntuariosAtendimentos;
    }

    public static ArrayList<Paciente> buscarPacientes(){
        return Pacientes;
    }

    public static ArrayList<Consulta> buscarConsultas(){
        return Consultas;
    }   
    
    // Método para encontrar uma paciente pelo nome
    public static Paciente buscarPaciente(String nome){
        if (Pacientes.isEmpty()){
            System.out.println("Não existem pacientes cadastrados");
        } else {
            for (Paciente paciente : Pacientes){
                if (paciente.getNome().equalsIgnoreCase(nome)){
                    return paciente;
                }
            }
        }   
        return null;
    }
    
    // Método para encontrar um paciente recebendo um objeto paciente
    public static Paciente buscarPaciente(Paciente pac){
        Paciente retorno;
        String nome = pac.getNome();
        retorno = buscarPaciente(nome);
        return retorno;
    }
    
    // método para encontrar um médico pelo nome
    public static Medico buscarMedico(String nome){
        if (Medicos.isEmpty()){
            System.out.println("Lista de médicos está vazia");
        }
        for (Medico medico : Medicos){
            if (medico.getNome().equalsIgnoreCase(nome)){
                return medico;
            }
        }
        return null;
    }
    
    // método para encontrar uma secretária pelo nome
    public static Secretahria buscarSecretahria(String nome){
        if (Secretahrias.isEmpty()){
            System.out.println("A lista de secretárias está vazia");
        } else {
            for (Secretahria SEC : Secretahrias){
                if (SEC.getNome().equalsIgnoreCase(nome)){
                    return SEC;
                }
            }
        }
        return null;
    }
    
    // método para encontrar uma consulta pelo ID
    public static Consulta buscarConsulta(int ID){
        for (Consulta CON : Consultas){
            if (CON.getId() == ID){
                return CON;
            } else {
                System.out.println("Consulta não encontrada");
            }
        }
        return null;
    }
    
    // método para encontrar as consultas de um paciente
    public static ArrayList<Consulta> buscarConsultaPaciente(Paciente PAC){
        ArrayList<Consulta> lista = new ArrayList<>();
        
        // verificamos se a lista "Consultas" está vazia
        if (!Consultas.isEmpty()){
            // caso a lista não esteja vazia:
            for (Consulta CON : Consultas){
                if (CON.getPaciente() == PAC){
                    lista.add(CON);
                }
            }
        } else {
            // caso a lista esteja vazia
            System.out.println("Não existem consultas cadastradas");
        }
        return lista;
    }
        
    // método para encontrar um prontuário de paciente por nome do paciente
    public static ProntuarioPaciente buscarProntuarioPaciente(String nomePaciente){
        for (ProntuarioPaciente PPAC : ProntuariosPacientes){
            if (PPAC.getPaciente().getNome().equalsIgnoreCase(nomePaciente)){
                return PPAC;
            } else {
                System.out.println("Prontuario do Paciente não encontrado");
            }
        }
        return null;
    }
    
    // método para encontrar um prontuário de atendimento pelo ID
    public static ProntuarioAtendimento buscarProntuarioAtendimento(int ID){
        for (ProntuarioAtendimento PAT : ProntuariosAtendimentos){
            if (PAT.getId() == ID){
                return PAT;
            } else {
                System.out.println("Prontuario de Atendimento não encontrado");
            }
        }
        return null;
    }
    
    
// ---------------- MÉTODOS PARA REMOVER INFORMAÇÕES ---------------------------------
    public static boolean removerPaciente(String nome){
        if (Pacientes.isEmpty()){
            System.out.println("Não existem pacientes cadastrados!");
        } else {
            for (Paciente PAC : Pacientes){
                if (PAC.getNome().equalsIgnoreCase(nome)){ 
                    Pacientes.remove(PAC);
                    System.out.println("Paciente removido com sucesso!");
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean removerProntuarioPaciente(int ID){
        if (ProntuariosPacientes.isEmpty()){
            System.out.println("Não existem prontuários de pacientes cadastrados!");
        } else {
            for (ProntuarioPaciente PPAC : ProntuariosPacientes){
                if (PPAC.getId() == ID){
                    ProntuariosPacientes.remove(PPAC);
                    System.out.println("Prontuário de Paciente removido!");
                    return true;
                } else {
                    System.out.println("Prontuário de Paciente não encontrado!");
                }
            }
        }
        
        return false;
    }
            
    public static boolean removerProntuarioAtendimento(int ID){
        if (ProntuariosAtendimentos.isEmpty()){
            System.out.println("Lista de prontuários está vazia");
        } else {
            for (ProntuarioAtendimento PAT : ProntuariosAtendimentos){
                if (PAT.getId() == ID){
                    // removendo o Prontuario de Atendimento do Histórico de Atendimentos do Paciente
                    Paciente paciente = PAT.getPaciente();
                    ProntuarioPaciente PPAC = buscarProntuarioPaciente(paciente.getNome());
                    PPAC.getHistoricoAtendimentos().remove(PAT);

                    // removendo o Prontuario de Atendimento do banco de dados
                    ProntuariosAtendimentos.remove(PAT);
                    System.out.println("Prontuário de Atendimento removido!");
                    return true;
                } else {
                    System.out.println("Prontuário de Atendimento não encontrado!");
                }
            }
        }
        
        return false;
    }
    
    public static boolean removerConsulta(int ID){
        for (Consulta CON : Consultas){
            if (CON.getId() == ID){
                Consultas.remove(CON);
                System.out.println("Consulta removida!");
                return true;
            } else {
                System.out.println("Consulta não encontrada");
            }
        }
        return false;
    }
    
    
// ---------------- MÉTODOS PARA MOSTRAR INFORMAÇÕES ---------------------------------
    
    public static void mostrarMedicos(){
        if (Medicos.isEmpty()){
            System.out.println("Lista de médicos vazia");
        } else {
            for (Medico MED : Medicos){
                System.out.println(String.format("|ID: %d |NOME: %s|", MED.getId(), MED.getNome()));
            }
        }
    }
    
    public static void mostrarPacientes(){
        if (Pacientes.isEmpty()){
            System.out.println("A lista de pacientes está vazia");
        } else {
            for (Paciente PAC : Pacientes){
                System.out.println(String.format("|ID: %d |NOME: %s|", PAC.getId(), PAC.getNome()));
            }
        }
    }
    
    public static void mostrarSecretahrias(){
        if (Secretahrias.isEmpty()){
            System.out.println("Lista de secretárias está vazia");
        } else {
            for (Secretahria SEC : Secretahrias){
                System.out.println(String.format("||ID: %d |NOME: %s|", SEC.getId(), SEC.getNome()));
            }
        }
    }
    
    public static void visualizarDadosPaciente(Paciente paciente){
        Paciente PAC = buscarPaciente(paciente);
        System.out.println("+----------------------------+" + "");
        System.out.println("|====== DADOS PESSOAIS ======|" + "");
        System.out.println("+---+------------------------+" + "");
        System.out.println("| 1 |Nome:                   |" + PAC.getNome());
        System.out.println("| 2 |Data de nascimento:     |" + PAC.getData_nascimento());
        System.out.println("| 3 |Endereco:               |" + PAC.getEndereco());
        System.out.println("| 4 |Celular:                |" + PAC.getInfo_contatoCelular());
        System.out.println("| 5 |Email:                  |" + PAC.getInfo_contatoEmail());
        System.out.println("| 6 |Tipo do convenio:       |" + PAC.getTipo_convenio());
        System.out.println("+---+------------------------+" + "");
    }
    
    public static void visualizarDadosPacienteCompleto(Paciente paciente){
        Paciente PAC = buscarPaciente(paciente);
        System.out.println("+-----------------------------+" + "");
        System.out.println("|======= DADOS PESSOAIS ======|" + "");
        System.out.println("+----+------------------------+" + "");
        System.out.println("| 1  |Nome:                   |" + PAC.getNome());
        System.out.println("| 2  |Data de nascimento:     |" + PAC.getData_nascimento());
        System.out.println("| 3  |Endereco:               |" + PAC.getEndereco());
        System.out.println("| 4  |Celular:                |" + PAC.getInfo_contatoCelular());
        System.out.println("| 5  |Email:                  |" + PAC.getInfo_contatoEmail());
        System.out.println("| 6  |Tipo do convenio:       |" + PAC.getTipo_convenio());
        System.out.println("|-----------------------------|");
        System.out.println("| 7  |Eh fumante?:            |" + PAC.getFuma());
        System.out.println("| 8  |Bebe?:                  |" + PAC.getBebe());
        System.out.println("| 9  |Nivel do colesterol:    |" + PAC.getNivelColesterol());
        System.out.println("| 10 |Diabetes:               |" + PAC.getDiabete());
        System.out.println("| 11 |Doenca cardiaca:        |" + PAC.getDoencaCardiaca());
        System.out.println("| 12 |Cirurgias realizadas:   |" + PAC.getCirurgias());
        System.out.println("| 13 |Alergias:               |" + PAC.getAlergias());
        System.out.println("+----+------------------------+" + "");        
    }

    public boolean mostrarProntuarioPaciente(String nome){
        ProntuarioPaciente PPAC = buscarProntuarioPaciente(nome);
        if (PPAC.getHistoricoAtendimentos().isEmpty()){
            System.out.println("O paciente nao possui historico de atendimentos");
        } else {
            for (ProntuarioAtendimento PAT : PPAC.getHistoricoAtendimentos()){
                PAT.resumoProntuarioAtendimento();
            }
        }
        return true;
    }
}