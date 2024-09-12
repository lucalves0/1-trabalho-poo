package registros;
import java.util.ArrayList;

public class ProntuarioPaciente {
    private int id;
    private Integer idpaciente;
    private String nomePaciente;
    private final ArrayList<ProntuarioAtendimento> historicoAtendimentos = null;
    
// setters e getters

    public void setPaciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }
    
    public void setNomePaciente(String nome){
        this.nomePaciente = nome;
    }

    public void setNovoAtendimento(ProntuarioAtendimento pat) {
        this.historicoAtendimentos.add(pat);
    }
    
    public int getId(){
        return id;
    }
    
    public Integer getPaciente() {
        return idpaciente;
    }
    
    public String getNomePaciente(){
        return nomePaciente;
    }

    public ArrayList<ProntuarioAtendimento> getHistoricoAtendimentos() {
        return historicoAtendimentos;
    }   
    
}