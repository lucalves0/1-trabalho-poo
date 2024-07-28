package pessoas;

import java.util.ArrayList;

public class Paciente {
    private static int contadorId = 0; // Contador estático para gerar IDs únicos
    private int id;
    // dados que podem ser gerenciados pela secretária
    private String nome;
    private String data_nascimento;
    private String endereco;
    private String info_contato;
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
    public Paciente(String nome, String data_nascimento, String endereco, String info_contato, String tipo_convenio) {
        this.id = ++contadorId; // Gera um ID único para cada novo objeto Paciente
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.endereco = endereco;
        this.info_contato = info_contato;
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
    
    public void visualizar_dados(){
        System.out.println("+----------------------------+" + "");
        System.out.println("|====== DADOS PESSOAIS ======|" + "");
        System.out.println("+---+------------------------+" + "");
        System.out.println("| 1 |Nome:                   |" + nome);
        System.out.println("| 2 |Data de nascimento:     |" + data_nascimento);
        System.out.println("| 3 |Endereco:               |" + endereco);
        System.out.println("| 4 |Informação de contato:  |" + info_contato);
        System.out.println("| 5 |Tipo do convenio:       |" + tipo_convenio);
        System.out.println("+---+------------------------+" + "");
    }
    
    public void visualizarDadosCompleto(){
        System.out.println("+-----------------------------+" + "");
        System.out.println("|======= DADOS PESSOAIS ======|" + "");
        System.out.println("+----+------------------------+" + "");
        System.out.println("| 1  |Nome:                   |" + nome);
        System.out.println("| 2  |Data de nascimento:     |" + data_nascimento);
        System.out.println("| 3  |Endereco:               |" + endereco);
        System.out.println("| 4  |Informação de contato:  |" + info_contato);
        System.out.println("| 5  |Tipo do convenio:       |" + tipo_convenio);
        System.out.println("|-----------------------------|");
        System.out.println("| 6  |É fumante?:             |" + fuma);
        System.out.println("| 7  |Bebe?:                  |" + bebe);
        System.out.println("| 8  |Nivel do colesterol:    |" + nivelColesterol);
        System.out.println("| 9  |Diabetes:               |" + diabete);
        System.out.println("| 10 |Doença cardíaca:        |" + doencaCardiaca);
        System.out.println("| 11 |Cirurgias realizadas:   |" + cirurgias);
        System.out.println("| 12 |Alergias:               |" + alergias);
        System.out.println("+----+------------------------+" + "");        
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

    public void setInfoContato(String info_contato) {
        this.info_contato = info_contato;
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

    public String getInfo_contato() {
        return info_contato;
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
