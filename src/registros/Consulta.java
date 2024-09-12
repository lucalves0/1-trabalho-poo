package registros;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consulta {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String dataConsulta;
    private String horario;
    private String medico;
    
    private Integer idPaciente;
    
    private String tipoConsulta;
    private String duracao;
    
    // Construtor
    
    public Consulta(){}
    
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

    public void setPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
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

    public Integer getPaciente() {
        return idPaciente;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }
    
    public String getDuracao(){
        return duracao;
    }
    
}