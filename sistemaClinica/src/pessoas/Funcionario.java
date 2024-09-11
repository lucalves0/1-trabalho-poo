package pessoas;
import java.util.ArrayList;

/**
 * A classe funcionário generaliza Secretahria e Medico
 */
public class Funcionario {
    private static int contadorID = 0; // Contador estático para gerar IDs únicos
    private int ID;
    protected String nome;
    protected String CPF;
    
    // CONSTRUTORES
    public Funcionario(String nome, String cpf){
        ID = contadorID++;
        this.nome = nome;
        this.CPF = cpf;
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
    
}
