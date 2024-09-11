package pessoas;

//import java.util.ArrayList;
//import java.util.Scanner;

public class Medico extends Funcionario{
    //private Scanner in = new Scanner(System.in);
    
    // método construtor
    public Medico(String nome, String CPF){
        super(nome, CPF);
    }
    
    // SETS e GETS
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCPF(){
        return this.CPF;
    }
    
}