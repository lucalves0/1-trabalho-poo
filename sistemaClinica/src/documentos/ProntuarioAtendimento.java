/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documentos;
import pessoas.*;

public class ProntuarioAtendimento {
    private static int contadorID = 0; // Contador estático para gerar IDs únicos
    private int id;
    private String dataAtendimento;
    private Paciente paciente;
    private Medico medico;
    private String sintomas;
    private String diagnostico;
    private String prescricao;
    private String dataRetorno;
    
    // métodos construtores
    public ProntuarioAtendimento(){
        id = ++contadorID;
    }
    
    public ProntuarioAtendimento(String dataAtendimento, Paciente paciente, Medico medico, String sintomas, String diagnostico, String prescricao, String dataRetorno){
        id = ++contadorID;
        this.dataAtendimento = dataAtendimento;
        this.paciente = paciente;
        this.medico = medico;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.dataRetorno = dataRetorno;
    }
    
    // outros métodos
    
    public void resumoProntuarioAtendimento(){
        System.out.println(String.format("|ID: %d |ATENDIMENTO: %s |PACIENTE: %s |MEDICO: %s |", id, dataAtendimento, paciente.getNome(), medico.getNome()));
    }
    
    //setters e getters

    public void setDataAtendimento(String dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

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

    public Paciente getPaciente() {
        return paciente;
    }
    
    public String getDataAtendimento() {
        return dataAtendimento;
    }

    public Medico getMedico() {
        return medico;
    }

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
