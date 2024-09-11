package pessoas;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paciente {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    // Dados gerenciados pela secretária
    private String nome;
    private String data_nascimento;
    private String endereco;
    private Integer info_contatoCelular;
    private String info_contatoEmail;
    private String tipo_convenio;
    //private ArrayList<String> medicos;
    
    // Dados gerenciado pelo médico
    private String fuma;
    private String bebe;
    private String nivelColesterol;
    private String diabete;
    private String doencaCardiaca;
    private String cirurgias;
    private String alergias;

    public Paciente() {
    }

    /*
    public Paciente(Integer id, String nome, String data_nascimento, String endereco, Integer info_contatoCelular, String info_contatoEmail, String tipo_convenio) {
        this.id = id;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.endereco = endereco;
        this.info_contatoCelular = info_contatoCelular;
        this.info_contatoEmail = info_contatoEmail;
        this.tipo_convenio = tipo_convenio;
    }
    
    // setter para dados complementares
    public void setDadosComplementares(String fuma, String bebe, String col, String diab, String card, String cir, String aler){
        this.fuma = fuma;
        this.bebe = bebe;
        this.nivelColesterol = col;
        this.diabete = diab;
        this.doencaCardiaca = card;
        this.cirurgias = cir;
        this.alergias = aler;
    }
*/

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

    /*public ArrayList<String> getMedicos() {
        return medicos;
    }*/

    /*public void setMedicos(ArrayList<String> medicos) {
        this.medicos = medicos;
    }*/

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