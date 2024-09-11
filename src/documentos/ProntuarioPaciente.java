package documentos;
import pessoas.*;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRONTUÁRIOS DOS PACIENTES")
public class ProntuarioPaciente {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToOne
    private Paciente paciente;
    private final ArrayList<ProntuarioAtendimento> historicoAtendimentos;
    
    public ProntuarioPaciente(Paciente PAC){
        this.historicoAtendimentos = new ArrayList<>();
        this.paciente = PAC;
    }
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
