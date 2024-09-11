package pessoas;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

public class Secretaria extends Funcionario{
    // método construtor
    public Secretaria(String nome, String CPF){
        super(nome, CPF);
    }
    
    // Métodos de cadastro de Pacientes
    
    public List<Paciente> searchPacienteList(EntityManagerFactory emf, Integer id){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT p FROM Paciente p WHERE p.id = :idPaciente");
        query.setParameter("idPaciente", id);

        List<Paciente> pacientes = query.getResultList();
        
        em.close();
        
        return pacientes;

    }
    
    public Paciente searchPaciente(EntityManagerFactory emf, Integer id){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Paciente pac = em.find(Paciente.class, id);
        em.getTransaction().commit();
        
        em.close();
        
        return pac;

    }
    
    public List<Paciente> searchPacienteByName(EntityManagerFactory emf, String name){
    
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT p FROM Paciente p WHERE p.nome LIKE :nomeBuscar");
        query.setParameter("nomeBuscar", "%" + name + "%"); // Busca por nomes que contenham a string

        List<Paciente> pacientes = query.getResultList();
        
        em.close();
        
        return pacientes;
        
    }
    
    public void removeCadPaciente(EntityManagerFactory emf, Paciente pac){
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();
 
        em.getTransaction().begin();
        pac = em.merge(pac);
        em.remove(pac);
        em.getTransaction().commit();

        // Fechar o EntityManager e a fábrica
        em.close();
    }
    
    public void postCadPaciente(EntityManagerFactory emf, Paciente pac){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

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

        // Transformamos este paciente em um objeto persistente 
        em.getTransaction().begin();
        em.merge(pac);
        em.getTransaction().commit();

        // Fechar o EntityManager e a fábrica
        em.close();

    }
    
    // sets e gets
    
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