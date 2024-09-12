package serviços;

//import java.util.ArrayList;

import registros.ProntuarioAtendimento;
import registros.ProntuarioPaciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

//import java.util.Scanner;

public class Medico extends Departamento{
    //private Scanner in = new Scanner(System.in);
    
    // método construtor
    public Medico(){
        super("Medico", 2);
    }
    
    // SETS e GETS
    public List<ProntuarioPaciente> buscarProntuarioPaciente(EntityManagerFactory emf, Integer id){
        EntityManager em = emf.createEntityManager();
        
        Query query = em.createQuery("SELECT p FROM ProntuarioPaciente p WHERE p.idpaciente = :id");
        query.setParameter("id", id);
        
        List<ProntuarioPaciente> listaProntuarios = query.getResultList();
        
        em.close();
        return listaProntuarios;
    }
    
    public void cadastrarProntuarioAtendimento(EntityManagerFactory emf, ProntuarioAtendimento PAT){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(PAT);
        em.getTransaction().commit();
        em.close();
    }
    
    public void atualizarProntuarioAtendimento(EntityManagerFactory emf, ProntuarioAtendimento PAT){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(PAT);
        em.getTransaction().commit();
        em.close();
    }
    
}