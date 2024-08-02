/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;

/**
 *
 * @author Prointe
 */
public class MenusMostrar {
    protected static void mostrarMenuInicialPrincipal(){
        System.out.println("\n+------------------------------------+");
        System.out.println("|         CLINICA PURA SAUDE         |");
        System.out.println("+------------------------------------+");
        System.out.println("|Deseja logar em qual sistema:       |");
        System.out.println("+------------------------------------+");
        System.out.println("|(1) Secretaria                      |");
        System.out.println("|(2) Consultorio medico              |");
        System.out.println("|(3) Gerenciamento de Mensagens      |");
        System.out.println("|                                    |");
        System.out.println("|(0) Sair do menu (encerrar programa)|");
        System.out.println("+------------------------------------+");
        System.out.print(">>> ");
    }
    
    // MÉTODOS "MOSTRAR" DE MENU SECRETARIA
    
    protected static void mostrarMenuSecretariaPrincipal(){
        System.out.println("\n+------------------------------------+");
        System.out.println("|======== MENU DA SECRETARIA ========|");
        System.out.println("+------------------------------------+");
        System.out.println("|(1) Gerenciar pacientes             |");
        System.out.println("|(2) Gerenciar consultas             |");
        System.out.println("|(3) Gerar relatorios                |");
        System.out.println("|                                    |");
        System.out.println("|(0) Voltar                          |");
        System.out.println("+------------------------------------+");
        System.out.printf(">>> ");
    }
    
    protected static void mostrarMenuSecretariaGerenciarPacientes(){
        System.out.println("\n+------------------------------------+");
        System.out.println("|======= GERENCIAR PACIENTES ========|");
        System.out.println("+------------------------------------+");
        System.out.println("|(1) Cadastrar paciente              |");
        System.out.println("|(2) Atualizar dados de pacientes    |");
        System.out.println("|(3) Deletar paciente                |");
        System.out.println("|                                    |");
        System.out.println("|(0) Voltar                          |");
        System.out.println("+------------------------------------+");
        System.out.print(">>> ");
    }
    
    protected static void mostrarMenuSecretariaGerenciarConsultas(){
        System.out.println("\n+------------------------------------+");
        System.out.println("|======= GERENCIAR CONSULTAS ========|");
        System.out.println("+------------------------------------+");
        System.out.println("|(1) Cadastrar consulta              |");
        System.out.println("|(2) Atualizar dados da consulta     |");
        System.out.println("|(3) Deletar consulta                |");
        System.out.println("|                                    |");
        System.out.println("|(0) Voltar                          |");
        System.out.println("+------------------------------------+");
        System.out.print(">>> ");
    }
    
    protected static void mostrarMenuSecretariaGerarRelatorios(){
        System.out.println("\n+------------------------------------+");
        System.out.println("|             RELATORIOS             |");
        System.out.println("+------------------------------------+");
        System.out.println("|(1) Gerar relatorio consultas       |");
        System.out.println("|do dia seguinte, de pacientes       |");
        System.out.println("|com email/telefone                  |");
        System.out.println("|                                    |");
        System.out.println("|(2) Gerar relatorio consultas       |");
        System.out.println("|do dia seguinte, de pacientes       |");
        System.out.println("|sem email/telefone                  |");
        System.out.println("|                                    |");
        System.out.println("|                                    |");
        System.out.println("|(0) Voltar                          |");
        System.out.println("+------------------------------------+");
        System.out.printf(">>> ");
    }
    
    // MÉTODOS "MOSTRAR" DE MENU MENSAGENS
    
    protected static void mostrarMenuMensagensPrincipal(){
        System.out.println("\n+-----------------------------------+");
        System.out.println("|======== MENU DE MENSAGENS ========|");
        System.out.println("+-----------------------------------+");
        System.out.println("|(1) Gerenciar Mensagens Enviadas   |");
        System.out.println("|(2) Enviar Mensagem de Aviso       |");
        System.out.println("|                                   |");
        System.out.println("|(0) Voltar                         |");
        System.out.println("+-----------------------------------+");
    }
    
    // MÉTODOS "MOSTRAR" DE MENU MÉDICO
    
    protected static void mostrarMenuMedicoPrincipal(){
        System.out.println("\n+------------------------------------+");
        System.out.println("|======== CONSULTORIO MEDICO ========|");
        System.out.println("+------------------------------------+");
        System.out.println("|(1) Prontuarios                     |");
        System.out.println("|(2) Ficha do paciente               |");
        System.out.println("|(3) Gerar relatorios                |");
        System.out.println("|                                    |");
        System.out.println("|(0) Voltar                          |");
        System.out.println("+------------------------------------+");
        System.out.print(">>> ");
    }
    
    protected static void mostrarMenuMedicoProntuarioSecundario(){
        System.out.println("\n+----------------------------------------+");
        System.out.println("|============= PRONTUARIOS ==============|");
        System.out.println("+----------------------------------------+");
        System.out.println("|(1) Consultar Prontuario do Paciente    |");
        System.out.println("|(2) Cadastrar Prontuario de Atendimento |");
        System.out.println("|(3) Atualizar Prontuario de Atendimento |");
        System.out.println("|(4) Apagar Prontuario de Atendimento    |");
        System.out.println("|                                        |");
        System.out.println("|(0) Voltar                              |");
        System.out.println("+----------------------------------------+");
        System.out.print("|>>> ");
    }
}
