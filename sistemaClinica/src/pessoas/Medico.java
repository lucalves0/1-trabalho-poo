/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoas;
import java.util.ArrayList;
import menus.*;

public class Medico {
    // dados do médico
    private static int contadorId = 0; // Contador estático para gerar IDs únicos
    private int id;
    private String nome;
    private String CPF;
    private MenusMedico menu = new MenusMedico();
    
    // lista de pacientes que atende
    private ArrayList<Paciente> pacientesAtendidos;
    
    // método construtor
    public Medico(String nome, String CPF){
        id = ++contadorId;
        this.nome = nome;
        this.CPF = CPF;
    }
    
    // setters e getters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setPacientesAtendidos(ArrayList<Paciente> pacientesAtendidos) {
        this.pacientesAtendidos = pacientesAtendidos;
    }

    public int getId(){
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public ArrayList<Paciente> getPacientesAtendidos() {
        return pacientesAtendidos;
    }

    public MenusMedico getMenu() {
        return menu;
    }

    public void setMenu(MenusMedico menu) {
        this.menu = menu;
    }
    
    
}
