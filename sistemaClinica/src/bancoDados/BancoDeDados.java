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
    
    
    // métodos para adicionar elementos em cada lista
    public void adicionarPaciente(Paciente pac){
        Pacientes.add(pac);
    }
    
    public void adicionarMedico(Medico med){
        Medicos.add(med);
    }
    
    public void adicionarConsulta(Consulta con){
        Consultas.add(con);
    }
    
    public void adicionarProntuarioPaciente(ProntuarioPaciente ppac){
        ProntuariosPacientes.add(ppac);
    }
    
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

    // métodos para consulta
    
    
    // Método para encontrar uma paciente pelo nome
    public Paciente buscarPaciente(String nome){
        for (Paciente paciente : Pacientes){
            if (paciente.getNome().equalsIgnoreCase(nome)){
                return paciente;
            }
        }
        return null;
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
        for (Medico medico : Medicos){
            if (medico.getNome().equalsIgnoreCase(nome)){
                return medico;
            }
        }
        return null;
    }
        
    // método para encontrar um prontuário de paciente por nome do paciente
    public ProntuarioPaciente buscarProntuarioPaciente(String nomePaciente){
        for (ProntuarioPaciente PPAC : ProntuariosPacientes){
            if (PPAC.getPaciente().getNome().equalsIgnoreCase(nomePaciente)){
                return PPAC;
            }
        }
        return null;
    }
    
    // 
}