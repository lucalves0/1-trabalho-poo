package pessoas;

//import java.util.ArrayList;

import documentos.ProntuarioAtendimento;
import documentos.ProntuarioPaciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

//import java.util.Scanner;

public class Medico extends Funcionario{
    //private Scanner in = new Scanner(System.in);
    
    // método construtor
    public Medico(String nome, String CPF){
        super(nome, CPF);
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