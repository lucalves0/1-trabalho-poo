/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documentos;
import pessoas.*;
import bancoDados.*;
import java.util.ArrayList;

public class ProntuarioPaciente {
    private static int contadorID = 0; // Contador estático para gerar IDs únicos
    private int id;
    private Paciente paciente;
    private final ArrayList<ProntuarioAtendimento> historicoAtendimentos;
    
    public ProntuarioPaciente(Paciente PAC){
        this.historicoAtendimentos = new ArrayList<>();
        this.paciente = PAC;
    }
    
    
    public boolean mostrarProntuarioPaciente(){
        paciente.visualizar_dados();
        if (historicoAtendimentos.isEmpty()){
            System.out.println("O paciente não possui histórico de atendimentos");
        } else {
            for (ProntuarioAtendimento PAT : historicoAtendimentos){
                PAT.resumoProntuarioAtendimento();
            }
        }
        return true;
    }    
    
// setters e getters

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setNovoAtendimento(ProntuarioAtendimento pat) {
        this.historicoAtendimentos.add(pat);
    }
    
    public int getId(){
        return id;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public ArrayList<ProntuarioAtendimento> getHistoricoAtendimentos() {
        return historicoAtendimentos;
    }   
    
}
