/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import menusGrafico.MenuInicial;
import pessoas.*;
import bancoDados.*;
import gerenciadorMensagens.*;

public class Main {
    public static void main(String args[]){
        BancoDeDados banco = new BancoDeDados();
        GerenciadorMensagens msgs = new GerenciadorMensagens();
        msgs.setData("29/07/2024");
        
        // Inicializando a lista de médicos da clínica
        Medico Ricardo = new Medico("Ricardo Nogueira", "106.609.899-99");
        Medico Roberta = new Medico("Roberta Souza", "111.222.333-44");
        banco.adicionarMedico(Ricardo);
        banco.adicionarMedico(Roberta);
        banco.mostrarMedicos();
        Paciente Enzo = new Paciente("Enzo", "16/10/2001", "Rua Seibo Kakazu, 1271", "997711590", "enzo@gmail.com", "Particular");
        banco.adicionarPaciente(Enzo);
        banco.mostrarPacientes();
        MenuInicial mnInicial = new MenuInicial();
        
        mnInicial.menuPrincipal();
    }
}
