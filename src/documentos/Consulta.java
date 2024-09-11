package documentos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;
import pessoas.*;

@Entity
public class Consulta {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String dataConsulta;
    private String horario;
    private String medico;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Paciente paciente;
    
    private String tipoConsulta;
    private String duracao;
    
    public Consulta(){}
    
    public Consulta(Integer id, String data, String horario, String medico, Paciente paciente, String tipoConsulta){
        
        this.id = id;
        this.dataConsulta = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
        this.tipoConsulta = tipoConsulta;
        
        if("normal".equals(tipoConsulta.toLowerCase())){
            this.duracao = "01:00";
        }else if("retorno".equals(tipoConsulta.toLowerCase())){
            this.duracao = "00:30";
        }

    }
    
    // setters e getters

    public void setData(String data) {
        this.dataConsulta = data;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
    
    public void setDuracao(String tipoConsulta){
        if("normal".equals(tipoConsulta.toLowerCase())){
            this.duracao = "01:00";
        }else if("retorno".equals(tipoConsulta.toLowerCase())){
            this.duracao = "00:30";
        }
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return dataConsulta;
    }

    public String getHorario() {
        return horario;
    }

    public String getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }
    
    public String getDuracao(){
        return duracao;
    }
    
}
