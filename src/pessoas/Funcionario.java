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
    
    public void postCadPaciente(EntityManagerFactory emf, Paciente pac){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();
        // criamos um prontuário de paciente
        
        // Transformamos este paciente em um objeto persistente 
        em.getTransaction().begin();
        em.persist(pac);
        em.getTransaction().commit();       

        // Fechar o EntityManager e a fábrica
        em.close();
    }
    
    public void updateCadPaciente(EntityManagerFactory emf, Paciente pac){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();
        // criamos um prontuário de paciente
        
        // Transformamos este paciente em um objeto persistente 
        em.getTransaction().begin();
        em.merge(pac);
        em.getTransaction().commit();       

        // Fechar o EntityManager e a fábrica
        em.close();
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
