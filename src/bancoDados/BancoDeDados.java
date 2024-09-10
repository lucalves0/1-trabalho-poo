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
    
 // -------- SETTERS E GETTERS --------------   
    public static ArrayList<Medico> getMedicos(){    
        return Medicos;
    }

    public static void setMedicos(ArrayList<Medico> Medicos) {
        BancoDeDados.Medicos = Medicos;
    }

    public static ArrayList<Consulta> getConsultas() {
        return Consultas;
    }

    public static void setConsultas(ArrayList<Consulta> Consultas) {
        BancoDeDados.Consultas = Consultas;
    }

    public static ArrayList<ProntuarioPaciente> getProntuariosPacientes() {
        return ProntuariosPacientes;
    }

    public static void setProntuariosPacientes(ArrayList<ProntuarioPaciente> ProntuariosPacientes) {
        BancoDeDados.ProntuariosPacientes = ProntuariosPacientes;
    }

    public static ArrayList<ProntuarioAtendimento> getProntuariosAtendimentos() {
        return ProntuariosAtendimentos;
    }

    public static void setProntuariosAtendimentos(ArrayList<ProntuarioAtendimento> ProntuariosAtendimentos) {
        BancoDeDados.ProntuariosAtendimentos = ProntuariosAtendimentos;
    }

    public ArrayList<Paciente> getPacientes() {
        return Pacientes;
    }
    
    
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


    
// ----------------- MÉTODOS PARA ENCONTRAR INFORMAÇÕES -------------------------------
    
    // Método para encontrar uma paciente pelo nome
    
    public Paciente buscarPaciente(String nome){
        if (Pacientes.isEmpty()){
            System.out.println("Nao existem pacientes cadastrados");
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

    public ArrayList<Consulta> buscarConsultas(){
        return Consultas;
    }
    
    // Método para encontrar um paciente recebendo um objeto paciente
    
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
            System.out.println("Nao existem prontuarios de pacientes cadastrados!");
        } else {
            for (ProntuarioPaciente PPAC : ProntuariosPacientes){
                if (PPAC.getId() == ID){
                    ProntuariosPacientes.remove(PPAC);
                    System.out.println("Prontuario de Paciente removido!");
                    return true;
                } else {
                    System.out.println("Prontuario de Paciente não encontrado!");
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
                    /*Paciente paciente = PAT.getPaciente();
                    ProntuarioPaciente PPAC = buscarProntuarioPaciente(paciente.getNome());
                    PPAC.getHistoricoAtendimentos().remove(PAT);*/

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
                System.out.println(String.format("|ID: %d |NOME: %s|", MED.getID(), MED.getNome()));
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