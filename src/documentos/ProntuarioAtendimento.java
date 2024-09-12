package documentos;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import pessoas.*;

@Entity
@Table(name = "PRONTUARIOS DE ATENDIMENTO")
public class ProntuarioAtendimento {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String dataAtendimento;
    private Integer idpaciente;
    private String nomepaciente;
    private String sintomas;
    private String diagnostico;
    private String prescricao;
    private String dataRetorno;
    
    // métodos construtores
    public ProntuarioAtendimento(){
    }
    /*
    public ProntuarioAtendimento(String dataAtendimento, Paciente paciente, Medico medico, String sintomas, String diagnostico, String prescricao, String dataRetorno){
        this.dataAtendimento = dataAtendimento;
        this.paciente = paciente;
        this.medico = medico;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.dataRetorno = dataRetorno;
    }
    */
    // outros métodos
    /*
    public void mostrarProntuarioAtendimento(){
        
        System.out.println("+-------------------------------------------------+");
        System.out.println("|=========== PRONTUÁRIO DE ATENDIMENTO ===========|");
        System.out.println("+-------------------------------------------------+");
        System.out.println("| - |ID           | " + id);
        System.out.println("| 1 |DATA         | " + dataAtendimento);
        System.out.println("| 2 |PACIENTE     | " + paciente.getNome());
        System.out.println("| 3 |MEDICO       | " + medico.getNome());
        System.out.println("| 4 |SINTOMAS     | " + sintomas);
        System.out.println("| 5 |DIAGNÓSTICO  | " + diagnostico);
        System.out.println("| 6 |PRESCRIÇÃO   | " + prescricao);
        System.out.println("| 7 |RETORNO      | " + dataRetorno);
    }
    */
    
    public void resumoProntuarioAtendimento(){
        System.out.println(String.format("|ID: %d |ATENDIMENTO: %s |PACIENTE: %s |", id, dataAtendimento, nomepaciente));
    }
    
    //setters e getters

    public void setDataAtendimento(String dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public void setPaciente(Integer idpaciente){
        this.idpaciente = idpaciente;
    }
    
    public void setNomePaciente(String nomepaciente){
        this.nomepaciente = nomepaciente;
    }
    
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
    
    public int getId(){
        return id;
    }

    public Integer getPaciente() {
        return idpaciente;
    }
    
    public String getNomePaciente(){
        return nomepaciente;
    }
    
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
