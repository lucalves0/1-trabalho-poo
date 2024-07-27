/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documentos;
import pessoas.*;
import java.util.ArrayList;

public class ProntuarioPaciente {
    private Paciente paciente;
    private ArrayList<ProntuarioAtendimento> historicoAtendimentos;
    
    // setters e getters

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setNovoAtendimento(ProntuarioAtendimento pat) {
        this.historicoAtendimentos.add(pat);
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public ArrayList<ProntuarioAtendimento> getHistoricoAtendimentos() {
        return historicoAtendimentos;
    }   
    
}
