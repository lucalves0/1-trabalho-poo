/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documentos;
import pessoas.*;

/**
 *
 * @author guest-0rkw0a
 */
public class Consulta {
    private static int contadorID = 0; // Contador estático para gerar IDs únicos
    private int id;
    private String data;
    private String horario;
    private Medico medico;
    private Paciente paciente;
    private String tipoConsulta; 
    
    //métodos construtores de consulta
    public Consulta(){
        id = ++contadorID;
    }
    
    public Consulta(String data, String horario, Medico medico, Paciente paciente, String tipoConsulta){
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
        this.tipoConsulta = tipoConsulta;
    }
}
