// Superclasse de Departamentos

package servicos;
import registros.Paciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 * A classe Departamentos generaliza Secretaria e Medico
 */
public class Departamento {
    protected String nome;
    
    // Diferentes Departamentos tem níveis de acesso diferentes!
    // Secretaria tem nivel 1 e médico tem nível 2 (Apenas para abstração)
    protected Integer nivelAcesso;
    
    // CONSTRUTORES
    public Departamento(String nome, Integer nivelAcesso){
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
    }
    
    // Método de adicionar informações do paciente
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
    
    // Método de atualizar informações do Paciente
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
    
    // Método de procura de Pacientes por nome
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

    public Integer getNivelAcesso() {
        return this.nivelAcesso;
    }

    public void setNivelAcesso(Integer nivelAcesso){
        this.nivelAcesso = nivelAcesso;
    }
    
}
