package servicos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import registros.Paciente;
import registros.Consulta;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorMensagens{

    // Data Atual
    private static LocalDate dataAtual = LocalDate.now();
    
    // Construtor
    public GerenciadorMensagens(){}

    // Métodos para o Envio de Mensagens:
    public List<String> enviarMensagens(List<Consulta> Consultas, List<Paciente> Pacientes){
    
        List<String> Mensagens = new ArrayList<>();
        for(int i = 0; i < Consultas.size(); i++){
        
            if(!dataAtual.isEqual(LocalDate.now())){
                dataAtual = LocalDate.now();
            }
            
            LocalDate dataConsulta = LocalDate.parse(Consultas.get(i).getData(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            
            if(dataAtual.plusDays(1).isEqual(dataConsulta)){
                
                if(Pacientes.get(i).getInfo_contatoCelular() != null){
                    Mensagens.add(enviarSMS(Consultas.get(i), Pacientes.get(i)));
                }
                if(Pacientes.get(i).getInfo_contatoEmail() != null){
                    Mensagens.add(enviarEmail(Consultas.get(i), Pacientes.get(i)));
                }
            }
            
        }
        
        return Mensagens;
        
    }
    
    private String enviarSMS(Consulta con, Paciente pac){
        return "SMS Enviado para " + pac.getNome() + " para o número " + pac.getInfo_contatoCelular() + " sobre a consulta de id " + con.getId() + " do dia " + con.getData();
    }
    
    private String enviarEmail(Consulta con, Paciente pac){
        return "Email Enviado para " + pac.getNome() + " para o email " + pac.getInfo_contatoEmail() + " sobre a consulta de id " + con.getId() + " do dia " + con.getData();
    }
    
    public LocalDate getDataAtual(){
        return dataAtual;
    }

}