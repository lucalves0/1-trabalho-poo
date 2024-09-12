package documentos;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import pessoas.*;

@Entity
@Table(name = "PRONTUARIOS_ATENDIMENTO")
public class ProntuarioAtendimento implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String dataAtendimento = "";
    //private Integer idpaciente;
    //private String nomepaciente;
    
    @ManyToOne
    private Paciente paciente;
    private String sintomas = "";
    private String diagnostico = "";
    private String prescricao = "";
    private String dataRetorno = "";
    
    // métodos construtores
    public ProntuarioAtendimento(){
    }
    
    /*
    public void resumoProntuarioAtendimento(){
        System.out.println(String.format("|ID: %d |ATENDIMENTO: %s |PACIENTE: %s |", id, dataAtendimento, this));
    }*/
    
    //setters e getters

    public Paciente getPaciente(){
        return paciente;
    }
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    public void setDataAtendimento(String dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }
/*
    public void setPaciente(Integer idpaciente){
        this.idpaciente = idpaciente;
    }
    
    public void setNomePaciente(String nomepaciente){
        this.nomepaciente = nomepaciente;
    }
    */
    /*public void setMedico(Medico medico) {
        this.medico = medico;
    }*/

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public void setDignostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }
    
    public Integer getId(){
        return id;
    }
/*
    public Integer getPaciente() {
        return idpaciente;
    }
    
    public String getNomePaciente(){
        return nomepaciente;
    }
    */
    public String getDataAtendimento() {
        return dataAtendimento;
    }

    
    /*public Medico getMedico() {
        return medico;
    }*/

    public String getSintomas() {
        return sintomas;
    }

    public String getDignostico() {
        return diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }
     
}
