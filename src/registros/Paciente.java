// Classe POJO de Pacientes

package registros;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PACIENTES")
public class Paciente implements Serializable{
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    // Dados gerenciados pela secretária
    private String nome;
    private String data_nascimento;
    private String endereco;
    private Integer info_contatoCelular;
    private String info_contatoEmail;
    private String tipo_convenio;
    
    // Dados gerenciado pelo médico
    private String fuma;
    private String bebe;
    private String nivelColesterol;
    private String diabete;
    private String doencaCardiaca;
    private String cirurgias;
    private String alergias;
    
    // Construtor
    
    public Paciente() {
    }

    // Sets e Gets
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getInfo_contatoCelular() {
        return info_contatoCelular;
    }

    public void setInfo_contatoCelular(Integer info_contatoCelular) {
        this.info_contatoCelular = info_contatoCelular;
    }

    public String getInfo_contatoEmail() {
        return info_contatoEmail;
    }

    public void setInfo_contatoEmail(String info_contatoEmail) {
        this.info_contatoEmail = info_contatoEmail;
    }

    public String getTipo_convenio() {
        return tipo_convenio;
    }

    public void setTipo_convenio(String tipo_convenio) {
        this.tipo_convenio = tipo_convenio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getFuma() {
        return fuma;
    }

    public void setFuma(String fuma) {
        this.fuma = fuma;
    }

    public String getBebe() {
        return bebe;
    }

    public void setBebe(String bebe) {
        this.bebe = bebe;
    }

    public String getNivelColesterol() {
        return nivelColesterol;
    }

    public void setNivelColesterol(String nivelColesterol) {
        this.nivelColesterol = nivelColesterol;
    }

    public String getDiabete() {
        return diabete;
    }

    public void setDiabete(String diabete) {
        this.diabete = diabete;
    }

    public String getDoencaCardiaca() {
        return doencaCardiaca;
    }

    public void setDoencaCardiaca(String doencaCardiaca) {
        this.doencaCardiaca = doencaCardiaca;
    }

    public String getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(String cirurgias) {
        this.cirurgias = cirurgias;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

}