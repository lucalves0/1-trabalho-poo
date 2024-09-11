package documentos;
import pessoas.*;
import java.util.ArrayList;

public class ProntuarioPaciente {
    private int id;
    private Paciente paciente;
    private final ArrayList<ProntuarioAtendimento> historicoAtendimentos;
    
    public ProntuarioPaciente(Paciente PAC){
        this.historicoAtendimentos = new ArrayList<>();
        this.paciente = PAC;
    }
    
    public boolean mostrarProntuarioPaciente(){
        // paciente.visualizar_dados();
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
