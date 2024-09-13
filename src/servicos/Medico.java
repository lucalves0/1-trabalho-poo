// Classe filha de departamentos, que representa os serviços do médico

package servicos;

import registros.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

public class Medico extends Departamento{
    
    // método construtor
    public Medico(){
        super("Medico", 2);
    }
    
    // Métodos do médico
    
    // Retorna os prontuários de atendimento
    public List<ProntuarioAtendimento> buscaHistoricoAtendimento(EntityManagerFactory emf, Paciente paciente){
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT p FROM ProntuarioAtendimento p WHERE p.paciente = :pac");
        query.setParameter("pac", paciente);
        
        List<ProntuarioAtendimento> listaAtendiemntos = query.getResultList();
        
        em.close();        
        return listaAtendiemntos;
    }
    
    // Cadastra os prontuários de atendimento
    public void cadastrarProntuarioAtendimento(EntityManagerFactory emf, Paciente paciente, ProntuarioAtendimento PAT){
        EntityManager em = emf.createEntityManager();
        
        PAT.setPaciente(paciente);
        
        em.getTransaction().begin();
        em.persist(PAT);
        em.getTransaction().commit();
        em.close();
    }
    
    // Remove os prontuários de atendimento
    public void removerProntuarioAtendimento(EntityManagerFactory emf, ProntuarioAtendimento PAT){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        ProntuarioAtendimento pat = em.find(ProntuarioAtendimento.class, PAT.getId());
        em.remove(pat);
        em.getTransaction().commit();
        em.close();        
    }
    
    // Atualiza os prontuários de atendimento
    public void atualizarProntuarioAtendimento(EntityManagerFactory emf, ProntuarioAtendimento PAT){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(PAT);
        em.getTransaction().commit();
        em.close();
    }
    
}