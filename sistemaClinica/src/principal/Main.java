/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import menus.*;
import pessoas.*;
import bancoDados.*;
import gerenciadorMensagens.*;

public class Main {
    public static void main(String args[]){
        
    // ESTANCIANDO OBJETOS DA CLASSE "BANCO DE DADOS", "GERENCIADOR DE MENSAGENS" E "MENU INICIAL"
        GerenciadorMensagens msgs = new GerenciadorMensagens();
        MenuInicial mnInicial = new MenuInicial();
    
    // SETTANDO A DATA ATUAL COMO SENDO "20/07/2024"
        msgs.setData("20/07/2024");
    

    // CRIANDO OBJETOS "MÉDICO", "PACIENTE" E "SECRETAHRIA" PARA POVOAR O BANCO DE DADOS
        Medico Ricardo = new Medico("Ricardo Nogueira", "106.609.899-99");
        Medico Roberta = new Medico("Roberta Souza", "111.222.333-44"); 
        Secretahria Rosa = new Secretahria("Rosa Miranda", "111.222.333-44");
        Paciente Enzo = new Paciente("Enzo", "16/10/2001", "Rua Seibo Kakazu, 1271", "997711590", "enzo@gmail.com", "Particular");
        Paciente Renata = new Paciente("Renata", "12/07/1998", "Avenida Brasil 110", "998446633", "email@email.com", "Particular");
        Paciente Rosana = new Paciente("Rozana", "01/04/1990", "Rua São Caetano 223", null, null, "particular");
        Paciente Henrique = new Paciente("Henrique", "23/11/1991", "Rua Rio Branco 2128", "99393-7551", "", "particular");
       
    // POVOANDO O BANCO DE DADOS COM PACIENTES 
        BancoDeDados.adicionarPaciente(Enzo);
        BancoDeDados.adicionarPaciente(Renata);
        BancoDeDados.adicionarPaciente(Rosana);
        BancoDeDados.adicionarPaciente(Henrique);
        
        BancoDeDados.adicionarMedico(Ricardo);
        BancoDeDados.adicionarMedico(Roberta);
        
        BancoDeDados.adicionarSecretahria(Rosa);
        
    // MOSTRANDO A LISTA DE PACIENTES E MÉDICOS CADASTRADOS NO SISTEMA
        
        System.out.println("============ PACIENTES CADASTRADOS =============");
        BancoDeDados.mostrarPacientes();
        System.out.println("\n============ MEDICOS CADASTRADOS =============");
        BancoDeDados.mostrarMedicos();
        System.out.println("\n============ SECRETAHRIAS CADASTRADAS =============");
        BancoDeDados.mostrarSecretahrias();
        System.out.println("\n");
 
        mnInicial.menuPrincipal();
        System.out.println("=============== Programa Encerrado! =======================");
    }
    
}
