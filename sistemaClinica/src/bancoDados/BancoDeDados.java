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
    private static ArrayList<Paciente> Pacientes = new ArrayList<>();
    private static ArrayList<ProntuarioPaciente> ProntuariosPacientes = new ArrayList<>();
    private static ArrayList<ProntuarioAtendimento> ProntuariosAtendimentos = new ArrayList<>();
    
    public void adicionarPaciente(Paciente pac){
        Pacientes.add(pac);
    }


    // Método para encontrar uma paciente pelo nome
    public Paciente buscarPaciente(String nome){
        for (Paciente paciente : Pacientes){
            if (paciente.getDados_identificacao().equalsIgnoreCase(nome)){
                return paciente;
            }
        }
        return null;
    }
    
    // Método para encontrar um paciente recebendo um objeto paciente
    public Paciente buscarPaciente(Paciente pac){
        Paciente retorno;
        String nome = pac.getDados_identificacao();
        retorno = buscarPaciente(nome);
        return retorno;
    }
}