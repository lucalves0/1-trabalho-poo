/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documentos;
import pessoas.*;

public class Consulta {
    private static int contadorID = 0; // Contador estático para gerar IDs únicos
    private int id;
    private String data;
    private String horario;
    private Medico medico;
    private Paciente paciente;
    private String tipoConsulta;
    private String duracao;
    
    //métodos construtores de consulta
    public Consulta(){
        id = ++contadorID;
    }
    
    public Consulta(String data, String horario, Medico medico, Paciente paciente, String tipoConsulta){
        id = ++contadorID;
        
        this.data = data;
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
    
    // outros métodos
    public void mostrarConsulta(){
        System.out.println("+-----------------------+");
        System.out.println("|====== CONSULTA =======|");
        System.out.println("+---+-------------------+");
        System.out.println("| 1 |Data:              |" + data);
        System.out.println("| 2 |Horario:           |" + horario);
        System.out.println("| 3 |Medico:            |" + medico.getNome());
        System.out.println("| 4 |Paciente:          |" + paciente.getNome());
        System.out.println("| 5 |Tipo Consulta:     |" + tipoConsulta);
        System.out.println("+---+-------------------+");
    }
    
    public void resumoConsulta(){
        System.out.println(String.format("|ID: %d |ATENDIMENTO: %s |HORARIO: %s |MÉDICO: %s |PACIENTE : %s |TIPO: %s |", id, data, horario, medico.getNome(), paciente.getNome(), tipoConsulta));
    }
    
    // setters e getters

    public final void setData(String data) {
        this.data = data;
    }

    public final void setHorario(String horario) {
        this.horario = horario;
    }

    public final void setMedico(Medico medico) {
        this.medico = medico;
    }

    public final void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public final void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
    
    public final void setDuracao(String tipoConsulta){
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
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public Medico getMedico() {
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
