package pessoas;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

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
    
    public List<Paciente> searchPacienteByName(EntityManagerFactory emf, String name){
    
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT p FROM Paciente p WHERE p.nome LIKE :nomeBuscar");
        query.setParameter("nomeBuscar", "%" + name + "%");

        List<Paciente> pacientes = query.getResultList();
        
        em.close();
        
        return pacientes;
        
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
