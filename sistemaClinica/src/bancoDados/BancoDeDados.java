/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancoDados;
import java.util.ArrayList;
import pessoas.*;
import documentos.*;

public class BancoDeDados {
    // documentos armazenados
    
    // lista de pacientes
    private static ArrayList<Paciente> Pacientes = new ArrayList<>();
    // lista de médicos
    private static ArrayList<Medico> Medicos = new ArrayList<>();
    // lista de consultas
    private static ArrayList<Consulta> Consultas = new ArrayList<>();
    // lista de prontuarios de pacientes
    private static ArrayList<ProntuarioPaciente> ProntuariosPacientes = new ArrayList<>();
    // lista de prontuarios de atendimentos
    private static ArrayList<ProntuarioAtendimento> ProntuariosAtendimentos = new ArrayList<>();
    
// --------------- MÉTODOS PARA ADICIONAR INFORMAÇÕES -----------------------------
    public void adicionarPaciente(Paciente pac){
        Pacientes.add(pac);
        // quando cadastramos um paciente, criamos seu prontuário
        ProntuarioPaciente PPAC = new ProntuarioPaciente(pac);
        ProntuariosPacientes.add(PPAC);
    }
    
    public void adicionarMedico(Medico med){
        Medicos.add(med);
    }
    
    public void adicionarConsulta(Consulta con){
        Consultas.add(con);
    }
    
    /*
    Este método pode não ser útil
    public void adicionarProntuarioPaciente(ProntuarioPaciente ppac){
        ProntuariosPacientes.add(ppac);
    }*/
    
    public void adicionarProntuarioAtendimento(ProntuarioAtendimento pat){
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
    
    // Método para encontrar uma paciente pelo nome
    public Paciente buscarPaciente(String nome){
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
    
    public ArrayList<ProntuarioAtendimento> buscarProntuarioAtendimentos(){
        return ProntuariosAtendimentos;
    }

    public ArrayList<Paciente> buscarPacientes(){
        return Pacientes;
    }

    public ArrayList<Consulta> buscarConsultas(){
        return Consultas;
    }
    
    // Método para encontrar um paciente recebendo um objeto paciente
    public Paciente buscarPaciente(Paciente pac){
        Paciente retorno;
        String nome = pac.getNome();
        retorno = buscarPaciente(nome);
        return retorno;
    }
    
    // método para encontrar um médico pelo nome
    public Medico buscarMedico(String nome){
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
    
    // método para encontrar uma consulta pelo ID
    public Consulta buscarConsulta(int ID){
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
    public ArrayList<Consulta> buscarConsultaPaciente(Paciente PAC){
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
    public ProntuarioPaciente buscarProntuarioPaciente(String nomePaciente){
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
    public ProntuarioAtendimento buscarProntuarioAtendimento(int ID){
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
    
    public boolean removerPaciente(String nome){
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
    
    public boolean removerProntuarioPaciente(int ID){
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
            
    public boolean removerProntuarioAtendimento(int ID){
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
    
    public boolean removerConsulta(int ID){
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
    
    public void mostrarMedicos(){
        if (Medicos.isEmpty()){
            System.out.println("Lista de médicos vazia");
        } else {
            for (Medico MED : Medicos){
                System.out.println(String.format("|ID: %d |NOME: %s|", MED.getId(), MED.getNome()));
            }
        }
    }
    
    public void mostrarPacientes(){
        if (Pacientes.isEmpty()){
            System.out.println("A lista de pacientes está vazia");
        } else {
            for (Paciente PAC : Pacientes){
                System.out.println(String.format("|ID: %d |NOME: %s|", PAC.getId(), PAC.getNome()));
            }
        }
    }

}