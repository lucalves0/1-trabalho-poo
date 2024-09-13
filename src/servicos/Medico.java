package servicos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
    
    // SETS e GETS
    public List<Paciente> getClientesNoMes(EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT p FROM ProntuarioAtendimento p");
        List<ProntuarioAtendimento> listaPATS = query.getResultList();

        // recuperamos a data de hoje
        LocalDate dataAtual = LocalDate.now();

        //criamos uma lista para guardar os atendimentos do mês
        List<ProntuarioAtendimento> atendimentosMes = new ArrayList<>();

        // filtramos os prontuários de consultas do mês
        for(ProntuarioAtendimento PAT : listaPATS){
            LocalDate dataAtendimento = LocalDate.parse(PAT.getDataAtendimento(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (dataAtendimento.getMonth().equals(dataAtual.getMonth())){
                atendimentosMes.add(PAT);
            }
        }

        // criamos a lista de pacientes no mes
        List<Paciente> pacientesMes = new ArrayList<>();

        // agora recuperamos os clientes
        for(ProntuarioAtendimento PAT : atendimentosMes){
            Paciente PAC = PAT.getPaciente();
            if(!pacientesMes.contains(PAC)){
               pacientesMes.add(PAC);
            }
        }
        
        return pacientesMes;
        
    }
    
    
    public List<ProntuarioAtendimento> buscaHistoricoAtendimento(EntityManagerFactory emf, Paciente paciente){
        EntityManager em = emf.createEntityManager();
        // busca todos os prontuarios de atendimento de *paciente;
        Query query = em.createQuery("SELECT p FROM ProntuarioAtendimento p WHERE p.paciente = :pac");
        query.setParameter("pac", paciente);
        
        List<ProntuarioAtendimento> listaAtendiemntos = query.getResultList();
        
        em.close();        
        return listaAtendiemntos;
    }
    
    public void cadastrarProntuarioAtendimento(EntityManagerFactory emf, Paciente paciente, ProntuarioAtendimento PAT){
        EntityManager em = emf.createEntityManager();
        
        PAT.setPaciente(paciente);
        
        em.getTransaction().begin();
        em.persist(PAT);
        em.getTransaction().commit();
        em.close();
    }
    
    public void removerProntuarioAtendimento(EntityManagerFactory emf, ProntuarioAtendimento PAT){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        ProntuarioAtendimento pat = em.find(ProntuarioAtendimento.class, PAT.getId());
        em.remove(pat);
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