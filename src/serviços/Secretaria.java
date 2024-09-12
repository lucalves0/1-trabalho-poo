package serviços;

import registros.Paciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import registros.Consulta;
import registros.ProntuarioAtendimento;
import registros.ProntuarioPaciente;

public class Secretaria extends Departamento{
    
    public Secretaria(){
        super("Secretaria", 1);
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
    
        public List<Consulta> searchAllConsultas(EntityManagerFactory emf){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT c FROM Consulta c");
        List<Consulta> consultas = query.getResultList();
        
        em.close();
        
        return consultas;

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
        //EntityManager em = emf.createEntityManager();
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
}
