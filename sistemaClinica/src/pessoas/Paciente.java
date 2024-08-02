package pessoas;

import java.util.ArrayList;

public class Paciente {
    private static int contadorId = 0; // Contador estático para gerar IDs únicos
    private int id;
    // dados que podem ser gerenciados pela secretária
    private String nome;
    private String data_nascimento;
    private String endereco;
    private String info_contatoCelular;
    private String info_contatoEmail;
    private String tipo_convenio;
    private ArrayList<Medico> medicos;
    
    // dados que só podem ser gerenciados pelos médicos
    private String fuma;
    private String bebe;
    private String nivelColesterol;
    private String diabete;
    private String doencaCardiaca;
    private String cirurgias;
    private String alergias;
    
    // construtor para secretaria
    public Paciente(String nome, String data_nascimento, String endereco, String info_contatoCelular, String info_contatoEmail, String tipo_convenio) {
        this.id = ++contadorId; // Gera um ID único para cada novo objeto Paciente
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
    
    // setters e getters

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setInfoContatoCelular(String info_contatoCelular) {
        this.info_contatoCelular = info_contatoCelular;
    }
    
    public void setInfoContatoEmail(String info_contatoEmail) {
        this.info_contatoEmail = info_contatoEmail;
    }

    public void setTipoConvenio(String tipo_convenio) {
        this.tipo_convenio = tipo_convenio;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    public void setFuma(String fuma) {
        this.fuma = fuma;
    }

    public void setBebe(String bebe) {
        this.bebe = bebe;
    }

    public void setNivelColesterol(String nivelColesterol) {
        this.nivelColesterol = nivelColesterol;
    }

    public void setDiabete(String diabete) {
        this.diabete = diabete;
    }

    public void setDoencaCardiaca(String doencaCardiaca) {
        this.doencaCardiaca = doencaCardiaca;
    }

    public void setCirurgias(String cirurgias) {
        this.cirurgias = cirurgias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getInfo_contatoCelular() {
        return info_contatoCelular;
    }
    
    public String getInfo_contatoEmail() {
        return info_contatoEmail;
    }

    public String getTipo_convenio() {
        return tipo_convenio;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public String getFuma() {
        return fuma;
    }

    public String getBebe() {
        return bebe;
    }

    public String getNivelColesterol() {
        return nivelColesterol;
    }

    public String getDiabete() {
        return diabete;
    }

    public String getDoencaCardiaca() {
        return doencaCardiaca;
    }

    public String getCirurgias() {
        return cirurgias;
    }

    public String getAlergias() {
        return alergias;
    }

}
