// Classe filha de departamentos, que representa os serviços da secretaria

package servicos;

import registros.Paciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import registros.Consulta;

public class Secretaria extends Departamento{
    
    // Construtor
    
    public Secretaria(){
        super("Secretaria", 1);
    }
    
    // Métodos da secretaria
    
    // Retorna uma lista de pacientes
    public List<Paciente> searchPacienteList(EntityManagerFactory emf, Integer id){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT p FROM Paciente p WHERE p.id = :idPaciente");
        query.setParameter("idPaciente", id);

        List<Paciente> pacientes = query.getResultList();
        
        em.close();
        
        return pacientes;

    }
    
    // Retorna uma lista com todas as consultas
    public List<Consulta> searchAllConsultas(EntityManagerFactory emf){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT c FROM Consulta c");
        List<Consulta> consultas = query.getResultList();
        
        em.close();
        
        return consultas;

    }

    // Retorna uma lista de Consultas
    public List<Consulta> searchConsultaList(EntityManagerFactory emf, Integer id){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT c FROM Consulta c WHERE c.id = :idConsulta");
        query.setParameter("idConsulta", id);

        List<Consulta> consultas = query.getResultList();
        
        em.close();
        
        return consultas;

    }

    // Retorna um único paciente dado o id
    public Paciente searchPaciente(EntityManagerFactory emf, Integer id){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Paciente pac = em.find(Paciente.class, id);
        em.getTransaction().commit();
        
        em.close();
        
        return pac;

    }
    
    // Retorna uma única consulta dado o id
    public Consulta searchConsulta(EntityManagerFactory emf, Integer id){
        
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Consulta con = em.find(Consulta.class, id);
        em.getTransaction().commit();
        
        em.close();
        
        return con;

    }
    
    // Retorna uma lista de consultas dado o id do paciente
    public List<Consulta> searchConsultaByPaciente(EntityManagerFactory emf, Integer id){
    
        // Criaremos a EntityManager através da fabrica
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT c FROM Consulta c WHERE c.idPaciente = :nomeBuscar");
        query.setParameter("nomeBuscar", id);

        List<Consulta> consultas = query.getResultList();
        
        em.close();
        
        return consultas;
        
    }
    
    // Remove o cadastro de um paciente
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
    
    // Remove o cadastro de uma consulta
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
    
    // Realiza o cadastro de uma consulta
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
    
    // Atualiza o cadastro de uma consulta
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
