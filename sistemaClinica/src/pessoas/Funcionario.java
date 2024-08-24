/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoas;
import java.util.ArrayList;
import bancoDados.BancoDeDados;


/**
 * A classe funcionário generaliza Secretahria e Medico
 * 
 */
public class Funcionario {
    private static int contadorID = 0; // Contador estático para gerar IDs únicos
    private int ID;
    private String nome;
    private String CPF;
    private BancoDeDados dados;
    
    // CONSTRUTORES
    public Funcionario(String nome, String cpf, BancoDeDados BD){
        ID = contadorID++;
        this.nome = nome;
        this.CPF = cpf;
        this.dados = BD;
    }

// MÉTODOS
    public Paciente buscarPaciente(String nome){
        /*
        * Esse método recebe como parâmetros um nome e uma lista de pacientes
        * e faz a busca do paciente pelo nome
        */
        ArrayList<Paciente> Pacientes = dados.getPacientes();
        if (Pacientes.isEmpty()){
            System.out.println("Nao existem pacientes cadastrados");
        } else {
            for (Paciente paciente : Pacientes){
                if (paciente.getNome().equalsIgnoreCase(nome)){
                    return paciente;
                }
            }
        }   
        return null;
    }
    
    public Paciente buscarPaciente(Paciente PAC){
        Paciente retorno;
        String nome = PAC.getNome();
        retorno = buscarPaciente(nome);
    return retorno;
    }
    
   
    
// SETTERS E GETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getID() {
        return ID;
    }

    public BancoDeDados getBDados() {
        return dados;
    }
    
    
}
