package registros;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRONTUARIOS_PACIENTES")
public class ProntuarioPaciente {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Integer idpaciente;
    private String nomePaciente;
    private final ArrayList<ProntuarioAtendimento> historicoAtendimentos = null;
    
    /*public ProntuarioPaciente(Paciente PAC){
        this.historicoAtendimentos = new ArrayList<>();
        this.paciente = PAC;
    }*/
    /*
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
    */
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
