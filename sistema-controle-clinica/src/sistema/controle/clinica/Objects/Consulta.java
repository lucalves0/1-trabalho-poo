package sistema.controle.clinica.Objects;

public class Consulta{
    
    private String data;
    private String horario;
    private Medico medico;
    private Paciente paciente; 
    private String tipo_consulta;

    public Consulta() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getTipo_consulta() {
        return tipo_consulta;
    }

    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
    }
    
    public void visualizar_consulta(){
        System.out.println("Data: " + getData());
        System.out.println("Horario: " + getHorario());
        System.out.println("Medico " + getMedico().getNome());
        System.out.println("Informação de contato: " + getPaciente().getDados_identificacao());
        System.out.println("Tipo do convenio: " + getTipo_consulta());
    };
}
