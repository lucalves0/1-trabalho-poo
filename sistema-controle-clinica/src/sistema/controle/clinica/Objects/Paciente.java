package sistema.controle.clinica.Objects;

import java.util.ArrayList;

public class Paciente {
    private static int contadorId = 0; // Contador estático para gerar IDs únicos
    private int id;
    private String dados_identificacao;
    private String data_nascimento;
    private String endereco;
    private String info_contato;
    private String tipo_convenio;

    public Paciente() {
    }

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
    
    @Override
    public String toString() {
        return  "\n" + "Id: " + id + "\n" +
                "Nome: " + dados_identificacao + "\n" +
                "Data de nascimento: " + data_nascimento + "\n" +
                "Endereço: " + endereco + "\n" +
                "Informações de contato: " + info_contato +  "\n" +
                "Tipo de convênio: " + tipo_convenio;
    }

    public void visualizar_dados(){
        System.out.println("Nome: " + getDados_identificacao());
        System.out.println("Data de nascimento: " + getData_nascimento());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Informação de contato: " + getInfo_contato());
        System.out.println("Tipo do convenio: " + getTipo_convenio());
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
