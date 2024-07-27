package pessoas;

import java.util.ArrayList;

public class Paciente {
    private static int contadorId = 0; // Contador estático para gerar IDs únicos
    private int id;
    // dados que podem ser gerenciados pela secretária
    private String dados_identificacao;
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
    private ArrayList<String> cirurgias;
    private ArrayList<String> alergias;
    

    public Paciente(String dados_identificacao, String data_nascimento, String endereco, String info_contato, String tipo_convenio) {
        this.id = ++contadorId; // Gera um ID único para cada novo objeto Paciente
        this.dados_identificacao = dados_identificacao;
        this.data_nascimento = data_nascimento;
        this.endereco = endereco;
        this.info_contato = info_contato;
        this.tipo_convenio = tipo_convenio;
    }
    
    // Método para encontrar uma paciente pelo nome
    public Paciente encontrar_paciente(ArrayList<Paciente> lista, String nome) {
        for (Paciente paciente : lista) {
            if (paciente.getDados_identificacao().equalsIgnoreCase(nome)) {
                return paciente;
            }
        }
        return null; 
    }

    public void visualizar_dados(){
        System.out.println("+-----------------------+" + "");
        System.out.println("|    DADOS PESSOAIS     |" + "");
        System.out.println("+-----------------------+" + "");
        System.out.println("|Nome:                  |" + dados_identificacao);
        System.out.println("|Data de nascimento:    |" + data_nascimento);
        System.out.println("|Endereco:              |" + endereco);
        System.out.println("|Informação de contato: |" + info_contato);
        System.out.println("|Tipo do convenio:      |" + tipo_convenio);
        System.out.println("+-----------------------+" + "");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Paciente(String dados_identificacao){
        this.dados_identificacao = dados_identificacao;
    }

    public String getDados_identificacao() {
        return dados_identificacao;
    }

    public void setDados_identificacao(String dados_identificacao) {
        this.dados_identificacao = dados_identificacao;
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

    public String getInfo_contato() {
        return info_contato;
    }

    public void setInfo_contato(String info_contato) {
        this.info_contato = info_contato;
    }

    public String getTipo_convenio() {
        return tipo_convenio;
    }

    public void setTipo_convenio(String tipo_convenio) {
        this.tipo_convenio = tipo_convenio;
    }
       
}
