/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import java.util.Scanner;
import bancoDados.*;
import pessoas.*;
import documentos.*;

public class MenusMedico{
    Scanner in = new Scanner(System.in);
    
    // métodos de menus
    public boolean menuPrincipal(){
        String opcao;
        boolean voltar = false;
        boolean retornado = true;
        while (retornado) {
            System.out.println("+------------------------------------+");
            System.out.println("|         CONSULTÓRIO MÉDICO         |");
            System.out.println("+------------------------------------+");
            System.out.println("|(1) Prontuários                     |");
            System.out.println("|(2) Gerar relatórios                |");
            System.out.println("|                                    |");
            System.out.println("|(0) Voltar                          |");
            System.out.println("+------------------------------------+");
            System.out.print(">>> ");
            opcao = in.next();

            switch(opcao){
                case "1" -> retornado = menuProntuarios();
                case "2" -> retornado = menuRelatorios();
                case "0" -> {
                    voltar = true;
                    retornado = false;
                }   
            }
        }
        return voltar;
    }
    
    public boolean menuProntuarios(){
        // objeto banco de dados
        BancoDeDados banco = new BancoDeDados();
        
        // objeto paciente
        Paciente PacienteEncontrado;
        ProntuarioPaciente ProntuarioEncontrado;
        
        
        String NomePaciente;
        
        boolean voltar = false;
        System.out.println("+------------------------------------+");
        System.out.println("|            PRONTUÁRIOS             |");
        System.out.println("+------------------------------------+");
        System.out.println("|Informe o nome do paciente          |");
        System.out.println("|                                    |");
        System.out.println("|(0) Voltar                          |");
        System.out.print("|>>> ");
        NomePaciente = in.next();
        System.out.println("+------------------------------------+");
        
        switch(NomePaciente){
            case "0" -> voltar = true;
            default -> {
                PacienteEncontrado = banco.buscarPaciente(NomePaciente);
                PontuarioEcontrado = banco.buscarProntuario(NomePaciente);
            }
        }
        
        return voltar;
    }
    
    public boolean menuRelatorios(){
        String opcao;
        
        boolean voltar = false;
        System.out.println("+------------------------------------+");
        System.out.println("|             RELATÓRIOS             |");
        System.out.println("+------------------------------------+");
        System.out.println("|(1) Receita                         |");
        System.out.println("|(2) Atestado                        |");
        System.out.println("|(3) Declaração de acompanhamento    |");       
        System.out.println("|(4) Clientes atendidos no mês       |");
        System.out.println("|                                    |");
        System.out.println("|(0) Voltar                          |");
        System.out.println("+------------------------------------+");
        opcao = in.next();

        switch(opcao){
            case "1" -> System.out.println("RECEITA");
            case "2" -> System.out.println("ATESTADO");
            case "3" -> System.out.println("DECLARAÇÃO");
            case "4" -> System.out.println("CLIETES NO MÊS");
            case "0" -> voltar = true;
        }
        
        return voltar;
    }
    
    // métodos de gerenciamento
    public boolean 
}
