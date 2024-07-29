/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciadorMensagens;

import bancoDados.*;
import java.util.ArrayList;
import pessoas.*;
import documentos.*;

public class GerenciadorMensagens {
    
    // Data Atual
    private static String dataAtual;
    
    // ----------------------- MÉTODOS PARA O ENVIO DE MENSAGENS -----------------------
    
    public GerenciadorMensagens(){}
    
    public void enviarMensagens(ArrayList<Consulta> Consultas){
    
        for(Consulta con : Consultas){
        
            if(this.proxDia(dataAtual, con.getData())){
                enviarSMS(con.getPaciente(), con);
                enviarEmail(con.getPaciente(), con);
            }
            
        }
        
    }
    
    public void enviarSMS(Paciente paciente, Consulta consulta){
        
        String celular = paciente.getInfo_contatoCelular();
    
        System.out.println("SMS ENVIADO PARA " + celular);
        System.out.println("----------------------------------------------------");
        System.out.println("Prezado(a) " + paciente.getNome() + ",\n");
        System.out.println("Enviamos este SMS para lembra-lo de sua consulta");
        System.out.println("com o Dr. " + consulta.getMedico().getNome() + " agendada para amanha");
        System.out.println("dia " + consulta.getData() + " no horario " + consulta.getHorario() + " com duracao de");
        System.out.println(consulta.getDuracao() + " sendo do tipo " + consulta.getTipoConsulta() + ".");
        System.out.println("\nContamos com a sua presença, avise-nos caso");
        System.out.println("algum imprevisto ocorra.\n");
        System.out.println("Att.\nClinica Pura Saude.");
        System.out.println("----------------------------------------------------\n\n");
        
    }
    
    public void enviarEmail(Paciente paciente, Consulta consulta){
    
        String email = paciente.getInfo_contatoEmail();
    
        System.out.println("EMAIL ENVIADO PARA " + email);
        System.out.println("----------------------------------------------------");
        System.out.println("Prezado(a) " + paciente.getNome() + ",\n");
        System.out.println("Enviamos este e-mail para lembra-lo de sua consulta");
        System.out.println("com o Dr. " + consulta.getMedico().getNome() + " agendada para amanha");
        System.out.println("dia " + consulta.getData() + " no horario " + consulta.getHorario() + " com duracao de");
        System.out.println(consulta.getDuracao() + " sendo do tipo " + consulta.getTipoConsulta() + ".");
        System.out.println("\nContamos com a sua presença, avise-nos caso");
        System.out.println("algum imprevisto ocorra.\n");
        System.out.println("Att.\nClinica Pura Saude.");
        System.out.println("----------------------------------------------------\n\n");
        
    }
    
    public boolean proxDia(String d1, String d2){
    
        int dia1 = Integer.parseInt(d1.substring(0, 2));
        int mes1 = Integer.parseInt(d1.substring(3, 5));
        int ano1 = Integer.parseInt(d1.substring(6, 10));
        
        int dia2 = Integer.parseInt(d2.substring(0, 2));
        int mes2 = Integer.parseInt(d2.substring(3, 5));
        int ano2 = Integer.parseInt(d2.substring(6, 10));
        
        if(ano1 == ano2 && mes1 == mes2 && dia1+1 == dia2){
            return true;
        }
        
        if(ano1 == ano2 && mes1+1 == mes2 && dia2 == 1 && (dia1 >= 29 && dia1 <= 31)){
            return true;
        }
        
        return false;
        
    }
    
    // ----------------------- SETS E GETS -----------------------
    
    public void setData(String data){
        if(data.matches("\\d{2}/\\d{2}/\\d{4}")){
            dataAtual = data;
        }else{
            System.out.println("ERRO: Data deve ser no formato DD/MM/YYYY");
        }
    }
    
    public String getData(){
        return dataAtual;
    }
    
}
