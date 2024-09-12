package pessoas;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import documentos.Consulta;
import documentos.ProntuarioAtendimento;
import documentos.ProntuarioPaciente;

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

    public List<Consulta> searchConsultaList(EntityManagerFactory emf, Integer id){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT c FROM Consulta c WHERE c.id = :idConsulta");
        query.setParameter("idConsulta", id);

        List<Consulta> consultas = query.getResultList();
        
        em.close();
        
        return consultas;

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
    
    public Consulta searchConsulta(EntityManagerFactory emf, Integer id){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Consulta con = em.find(Consulta.class, id);
        em.getTransaction().commit();
        
        em.close();
        
        return con;

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
    
    public List<Consulta> searchConsultaByPaciente(EntityManagerFactory emf, Integer id){
    
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT c FROM Consulta c WHERE c.idPaciente = :nomeBuscar");
        query.setParameter("nomeBuscar", id);

        List<Consulta> consultas = query.getResultList();
        
        em.close();
        
        return consultas;
        
    }
    
    public void serchProntuarioAtendimentoByPaciente(EntityManagerFactory emf, Paciente PAC){
        EntityManager em = emf.createEntityManager();
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
    
    public void removeCadConsulta(EntityManagerFactory emf, Consulta con){
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();
 
        em.getTransaction().begin();
        con = em.merge(con);
        em.remove(con);
        em.getTransaction().commit();

        // Fechar o EntityManager e a fábrica
        em.close();
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
    
    public void postProntuarioPaciente(EntityManagerFactory emf, ProntuarioPaciente PPAC){
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        // Transformamos esta consulta em um objeto persistente 
        em.getTransaction().begin();
        em.persist(PPAC);
        em.getTransaction().commit();

        // Fechar o EntityManager e a fábrica
        em.close();
    }
    
    public void postCadConsulta(EntityManagerFactory emf, Consulta con){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        // Transformamos esta consulta em um objeto persistente 
        em.getTransaction().begin();
        em.persist(con);
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
    
    public void updateCadConsulta(EntityManagerFactory emf, Consulta con){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        // Transformamos esta consulta em um objeto persistente 
        em.getTransaction().begin();
        em.merge(con);
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
