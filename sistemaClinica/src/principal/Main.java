/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import menus.*;
import pessoas.*;
import documentos.*;
import bancoDados.*;
import gerenciadorMensagens.*;
import janelas.*;

public class Main {
    public static void main(String args[]){
        
    // ESTANCIANDO OBJETOS DA CLASSE "BANCO DE DADOS", "GERENCIADOR DE MENSAGENS" E "MENU INICIAL"
        BancoDeDados banco = new BancoDeDados();
        GerenciadorMensagens msgs = new GerenciadorMensagens();
        MenuInicial mnInicial = new MenuInicial();
    
    // SETTANDO A DATA ATUAL COMO SENDO "20/07/2024"
        msgs.setData("20/07/2024");
    

    // CRIANDO OBJETOS "MÉDICO" E "PACIENTE" PARA POVOAR O BANCO DE DADOS
        Medico Ricardo = new Medico("Ricardo Nogueira", "106.609.899-99");
        Medico Roberta = new Medico("Roberta Souza", "111.222.333-44"); 
        
        Paciente Enzo = new Paciente("Enzo", "16/10/2001", "Rua Seibo Kakazu, 1271", "997711590", "enzo@gmail.com", "Particular");
        Paciente Renata = new Paciente("Renata", "12/07/1998", "Avenida Brasil 110", "998446633", "email@email.com", "Particular");
        Paciente Rosana = new Paciente("Rosana", "01/04/1990", "Rua Sao Caetano 223", null, null, "particular");
        Paciente Henrique = new Paciente("Henrique", "23/11/1991", "Rua Rio Branco 2128", "99393-7551", "", "particular");
    
// POVOANDO O BANCO DE DADOS COM PACIENTES 
        banco.adicionarPaciente(Enzo);
        banco.adicionarPaciente(Renata);
        banco.adicionarPaciente(Rosana);
        banco.adicionarPaciente(Henrique);
        banco.adicionarMedico(Ricardo);
        banco.adicionarMedico(Roberta);
    
// CRIANDO OBJETOS "CONSULTA"
    //public Consulta(String data, String horario, Medico medico, Paciente paciente, String tipoConsulta)
        Consulta primeira = new Consulta("21/07/2024", "10:00", Ricardo, Enzo, "retorno");
        Consulta segunda = new Consulta("21/07/2024", "10:30", Roberta, Rosana, "normal");
        Consulta terceira = new Consulta("25/07/2024", "10:00", Ricardo, Enzo, "normal");
        Consulta quarta = new Consulta("26/07/2024", "10:30", Roberta, Rosana, "retorno");
        
    // POVOANDO O BANCO DE DADOS COM OS OBJETOS "CONSULTA"
        banco.adicionarConsulta(primeira);
        banco.adicionarConsulta(segunda);
        banco.adicionarConsulta(terceira);
        banco.adicionarConsulta(quarta);
        
    // MOSTRANDO A LISTA DE PACIENTES E MÉDICOS CADASTRADOS NO SISTEMA
        System.out.println("=============== PACIENTES CADASTRADOS =======================");
        banco.mostrarPacientes();
        System.out.println("\n=============== MEDICOS CADASTRADOS =======================");
        banco.mostrarMedicos();  
        System.out.println("\n");
        
        // mnInicial.menuPrincipal();
        // System.out.println("=============== Programa Encerrado! =======================");
        
        //java.awt.EventQueue.invokeLater(new Runnable() {
        //    public void run() {
        //        new JanelaInicial().setVisible(true);
        //    }
        //});
        JanelaInicial janelaInicial = new JanelaInicial();
        janelaInicial.setVisible(true);
    }
}
