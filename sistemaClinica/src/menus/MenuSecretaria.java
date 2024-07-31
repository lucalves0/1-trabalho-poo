/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import pessoas.*;
import bancoDados.*;
import documentos.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuSecretaria{
    // objeto banco de dados
    BancoDeDados banco = new BancoDeDados();
    Scanner in = new Scanner(System.in);
    
    public boolean menuPrincipal(){
        boolean retornado = true;
        while (retornado){
            String selecao;
            System.out.println("+------------------------------------+");
            System.out.println("|======== MENU DA SECRETARIA ========|");
            System.out.println("+------------------------------------+");
            System.out.println("|(1) Gerenciar pacientes             |");
            System.out.println("|(2) Gerenciar consultas             |");
            System.out.println("|                                    |");
            System.out.println("|(0) Voltar                          |");
            System.out.println("+------------------------------------+");
            selecao = in.next();

            switch(selecao){
                case "0" -> retornado = false;
                case "1" -> retornado = menuGerenciarPacientes();
                case "2" -> retornado = menuGerenciarConsultas();
            }            
        }
        return true;
    }
    
    public boolean menuGerenciarPacientes(){
        boolean retornado = true;
        String selecao;
        
        while (retornado){
            System.out.println("+------------------------------------+");
            System.out.println("|======= GERENCIAR PACIENTES ========|");
            System.out.println("+------------------------------------+");
            System.out.println("|(1) Cadastrar paciente              |");
            System.out.println("|(2) Atualizar dados de pacientes    |");
            System.out.println("|(3) Deletar paciente                |");
            System.out.println("|                                    |");
            System.out.println("|(0) Voltar                          |");
            System.out.println("+------------------------------------+");
            System.out.print(">>> ");
            
            selecao = in.nextLine();
            
            switch(selecao){
                case "0" -> retornado = false;
                case "1" -> retornado = cadastrarPaciente();
                case "2" -> retornado = atualizarPaciente();
                case "3" -> retornado = removerPaciente();
            }            
        }
        return true;            
    }
    
    public boolean menuGerenciarConsultas(){
        boolean retornado = true;
        String selecao;

        while (retornado){
            System.out.println("+------------------------------------+");
            System.out.println("|======= GERENCIAR CONSULTAS ========|");
            System.out.println("+------------------------------------+");
            System.out.println("|(1) Cadastrar consulta              |");
            System.out.println("|(2) Atualizar dados da consulta     |");
            System.out.println("|(3) Deletar consulta                |");
            System.out.println("|                                    |");
            System.out.println("|(0) Voltar                          |");
            System.out.println("+------------------------------------+");
            System.out.print(">>> ");
            selecao = in.nextLine();
            
            switch(selecao){
                case "0" -> retornado = false;
                case "1" -> retornado = cadastrarConsulta();
                case "2" -> retornado = atualizarConsulta();
                case "3" -> retornado = deletarConsulta();
            }            
        }
        return true;
    };

// ---------------- MÉTODOS DE GERENCIAMENTO DE PACIENTES -----------------------------
    public boolean cadastrarPaciente() {     
        // variáveis de entrada
        String nome;
        String data_nascimento;
        String endereco;
        String contatoCelular;
        String contatoEmail;
        String tipo_convenio;
        Paciente paciente;

        System.out.println("+------------------------------------------------------+");
        System.out.println("|================ CADSTRO DE PACIENTE =================|");
        System.out.println("+------------------------------------------------------+");
        System.out.print("Nome: ");
        nome = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Data de nascimento: ");
        data_nascimento = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Endereço: ");
        endereco = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Contato telefonico: ");
        contatoCelular = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Contato Email: ");
        contatoEmail = in.nextLine();
        System.out.println("+------------------------------------------------------+");
        System.out.print("Tipo do convenio: ");
        tipo_convenio = in.next();
        while(!"particular".equals(tipo_convenio) && !"plano".equals(tipo_convenio)){
            System.out.println("ERRO: Convenio deve ser 'particular' ou 'plano'");
            System.out.print("Tipo do convenio: ");
            tipo_convenio = in.next();
        }
        
        // adicionando paciente ao banco de dados
        paciente = new Paciente(nome, data_nascimento, endereco, contatoCelular, contatoEmail, tipo_convenio);
        banco.adicionarPaciente(paciente);
        
        // mensagem confirmando o cadastro 
        System.out.println("\n========= Paciente cadastrado com sucesso ! ============");
        // paciente.visualizar_dados();
        // mudei o método para ter certeza de que o paciente foi cadastrado no banco de dados
        banco.buscarPaciente(paciente).visualizar_dados();
        System.out.println("========================================================");
        // System.out.println("+------------------------------------------------------+");
        
        return true;
    }

    public boolean atualizarPaciente() {
        String selecao;
        
        String nome;
        String dataNascimento;
        String endereco;
        String infoContatoCeular;
        String infoContatoEmail;
        String tipoConvenio;
        
        boolean retornado = true;
        while (retornado){
            System.out.println("+------------------------------------+");
            System.out.println("|=== ATUALIZAR DADOS DO PACIENTE ====|");
            System.out.println("+------------------------------------+");
            System.out.println("|Informe o nome do paciente          |");
            System.out.println("|                                    |");
            System.out.println("|(0) Voltar                          |");
            System.out.print("|>>> ");
            String nomePaciente = in.nextLine();
            System.out.println("+------------------------------------+");
        
            switch(nomePaciente){
                case "0" -> retornado = false;
                default -> {
                    // buscando o paciente pelo nome
                    Paciente paciente = banco.buscarPaciente(nomePaciente);
                    
                    if (paciente != null){
                        paciente.visualizar_dados();
                    
                    /*
                        System.out.println("+----------------------------+" + "");
                        System.out.println("|====== DADOS PESSOAIS ======|" + "");
                        System.out.println("+---+------------------------+" + "");
                        System.out.println("| 1 |Nome:                   |" + nome);
                        System.out.println("| 2 |Data de nascimento:     |" + data_nascimento);
                        System.out.println("| 3 |Endereco:               |" + endereco);
                        System.out.println("| 4 |Celular:                |" + info_contatoCelular);
                        System.out.println("| 5 |Email:                  |" + info_contatoEmail);
                        System.out.println("| 6 |Tipo do convenio:       |" + tipo_convenio);
                        System.out.println("+---+------------------------+" + "");
                    */
                    
                        System.out.println("+----------------------------------------------+");
                        System.out.println("|Informe o numero do dado que deseja atualizar |");
                        System.out.println("|                                              |");
                        System.out.println("|(0) Voltar                                    |");
                        boolean voltar = false;
                        while(!voltar){
                            System.out.print("\n|>>> ");
                            selecao = in.nextLine();
                            switch(selecao){
                                case "0" -> voltar = true;
                                case "1" -> {
                                    System.out.print("\nNome: ");
                                    nome = in.nextLine();
                                    paciente.setNome(nome);
                                }
                                case "2" -> {
                                    System.out.print("\nData de Nascimento: ");
                                    dataNascimento = in.nextLine();
                                    paciente.setDataNascimento(dataNascimento);
                                }
                                case "3" -> {
                                    System.out.print("\nEndereco: ");
                                    endereco = in.nextLine();
                                    paciente.setEndereco(endereco);
                                }
                                case "4" -> {
                                    System.out.print("\nCelular: ");
                                    infoContatoCeular = in.nextLine();
                                    paciente.setInfoContatoCelular(infoContatoCeular);
                                }
                                case "5" -> {
                                    System.out.print("\nEmail: ");
                                    infoContatoEmail = in.nextLine();
                                    paciente.setInfoContatoEmail(infoContatoEmail);
                                }
                                case "6" -> {
                                    System.out.print("\nTipo de convenio: ");
                                    tipoConvenio = in.nextLine();
                                    while(tipoConvenio != "particular" && tipoConvenio != "plano"){
                                        System.out.println("ERRO: Tipo de convenio deve ser 'particular' ou 'plano'");
                                        System.out.print("\nTipo de convenio: ");
                                        tipoConvenio = in.nextLine();
                                    }
                                    paciente.setTipoConvenio(tipoConvenio);
                                }
                            }
                        }
                    }
                }   
            }
        }
        return true;
    }

    public boolean removerPaciente() {    
        boolean retornado = true;
        while (retornado){
            System.out.println("+------------------------------------+");
            System.out.println("|========= DELETAR PACIENTE =========|");
            System.out.println("+------------------------------------+");
            System.out.println("|Informe o nome do paciente          |");
            System.out.println("|                                    |");
            System.out.println("|(0) Voltar                          |");
            System.out.print("|>>> ");
            String nomePaciente = in.nextLine();
            System.out.println("+------------------------------------+");
            
            switch(nomePaciente){
                case "0" -> retornado = false;
                default -> {
                    Paciente paciente = banco.buscarPaciente(nomePaciente);
                    if (paciente != null){
                        banco.removerPaciente(nomePaciente);
                    }
                }
            }
        }
        return true;
    }

    
// ---------------- MÉTODO DE GERENCIAMENTO DE CONSULTAS ------------------------------
    public boolean cadastrarConsulta(){
        // objetos
        Consulta consulta;
        
        // variáveis de entrada
        String data;
        String horario;
        String nomeMedico;
        String nomePaciente;
        String tipoConsulta;

        System.out.println("+------------------------------------------------------+");
        System.out.println("|================ CADSTRO DE CONSULTA =================|");
        System.out.println("+------------------------------------------------------+");
        System.out.print("Data da consulta: ");
        data = in.nextLine();
        while(!data.matches("\\d{2}/\\d{2}/\\d{4}")){
            System.out.println("ERRO: Data deve estar no formato DD/MM/YYYY");
            System.out.print("Data da consulta: ");
            data = in.nextLine();
        }
        System.out.println("+------------------------------------------------------+");
        System.out.print("Horario: ");
        horario = in.nextLine();
        while(!horario.matches("\\d{2}:\\d{2}")){
            System.out.println("ERRO: Horário deve estar no formato HH:MM");
            System.out.print("Horario: ");
            horario = in.nextLine();
        }
        System.out.println("+------------------------------------------------------+");
        System.out.print("Nome do Medico: ");
        nomeMedico = in.nextLine();
        Medico medico = banco.buscarMedico(nomeMedico);
        int i = 0;
        while (medico == null && i < 3){
            System.out.println("Medico não encontrado");
            System.out.print("\nNome do Medico: ");
            nomeMedico = in.nextLine();
            medico = banco.buscarMedico(nomeMedico);
            ++i;
        }
        System.out.println("+------------------------------------------------------+");
        System.out.print("Nome do paciente: ");
        nomePaciente = in.nextLine();
        Paciente paciente = banco.buscarPaciente(nomePaciente);
        int j = 0;
        while (paciente  == null && j < 3){
            System.out.println("Paciente nao encontrado");
            System.out.print("\nNome do Paciente: ");
            nomePaciente = in.nextLine();
            paciente = banco.buscarPaciente(nomePaciente);
            ++j;
        }
        System.out.println("+------------------------------------------------------+");
        System.out.print("Tipo da consulta: ");
        tipoConsulta = in.next();
        while(!"normal".equals(tipoConsulta) && !"retorno".equals(tipoConsulta)){
            System.out.println("ERRO: tipo da consulta deve ser 'normal' ou 'retorno'");
            System.out.print("Tipo da consulta: ");
            tipoConsulta = in.next();
        }
        
        // estanciando objeto consulta e adicionando ao banco de dados
        consulta = new Consulta(data, horario, medico, paciente, tipoConsulta);
        banco.adicionarConsulta(consulta);
        
        // mensagem confirmando o cadastro 
        System.out.println("\n========= Consulta cadastrada com sucesso ! ============");
        banco.buscarConsulta(consulta.getId()).mostrarConsulta();
        System.out.println("========================================================");
        return true;
    }
    
    public boolean atualizarConsulta(){
        // variaveis
        int IDBuscado;
        boolean voltar = false;
        String selecao;
        
        // variáveis de entrada
        String data;
        String horario;
        String nomeMedico;
        String nomePaciente;
        String tipoConsulta;
        
        boolean retornado = true;
        while (retornado){
            System.out.println("+------------------------------------+");
            System.out.println("|======== ATUALIZAR CONSULTA ========|");
            System.out.println("+------------------------------------+");
            System.out.println("|Informe o nome do paciente          |");
            System.out.println("|                                    |");
            System.out.println("|(0) Voltar                          |");
            System.out.print("|>>> ");
            nomePaciente = in.nextLine();
            System.out.println("+------------------------------------+");

            switch(nomePaciente){
                case "0" -> retornado = false;
                default -> {
                    // encontramos o paciente pelo nome
                    Paciente paciente = banco.buscarPaciente(nomePaciente);
                    
                    // se o paciente não for encontrado, uma mensagem de erro aparece na tela
                    if (paciente == null){
                        System.out.println("Paciente não encontrado");
                        
                        /* logo após a mensagem de erro, o programa sai do default
                         e volta a mostrar o menu acima. Isso continua até que o 
                         usuário volte ou digite o nome de um paciente válido*/
                                
                    } else {
                        /* ativado no caso do paciente ter sido encontrado */
                        /* buscamos todas as consultas do paciente no banco de dados
                           e armazenamos em uma lista "listaConsultas" */
                        ArrayList<Consulta> listaConsultas = banco.buscarConsultaPaciente(paciente);
                        boolean vazia = listaConsultas.isEmpty();
                        /* se a lista de consultas for vazia, é porque não exitem consultas
                           cadastradas para o paciente */
                        
                        if (vazia){
                            System.out.println("O paciente ainda não possui consultas cadastradas!");
                        } else {
                            // mostrando o resumo de todas consultas do paciente
                            for (Consulta CON : listaConsultas){
                                CON.resumoConsulta();
                            }
                            
                            // recebendo o ID da consulta que será atualizada
                            System.out.println("\n|Informe o ID da consulta que deseja atualizar:");
                            System.out.println("|");
                            System.out.println("|(0) Voltar");
                            Consulta consultaAtualizar = null;
                            boolean parar = false;
                            while (consultaAtualizar == null && !parar){
                                System.out.print("\n|>>> ");
                                IDBuscado = in.nextInt();
                                in.nextLine();
                                switch(IDBuscado){
                                    case 0 -> parar = true;
                                    default -> {
                                        for (Consulta CON : listaConsultas){
                                            if (CON.getId() == IDBuscado){
                                                consultaAtualizar = CON;
                                            }
                                        }
                                    }
                                }
                            }
                            
                            // Consulta consultaAtualizar = banco.buscarConsulta(IDBuscado);
                            // consultaAtualizar será null quando o usuário digitar 0 acima
                            if (consultaAtualizar != null){
                                consultaAtualizar.mostrarConsulta();
                                System.out.println("+----------------------------------------------+");
                                System.out.println("|Informe o número do dado que deseja atualizar |");
                                System.out.println("|                                              |");
                                System.out.println("|(0) Voltar                                    |");
                                while(!voltar){
                                    System.out.print("\n|>>> ");
                                    selecao = in.nextLine();
                                    switch(selecao){
                                        case "0" -> voltar = true;
                                        case "1" -> {
                                            System.out.print("\nData do atendimento: ");
                                            data = in.nextLine();
                                            while(!data.matches("\\d{2}/\\d{2}/\\d{4}")){
                                                System.out.println("ERRO: Data deve estar no formato DD/MM/YYYY");
                                                System.out.print("Data da consulta: ");
                                                data = in.nextLine();
                                            }
                                            consultaAtualizar.setData(data);
                                        }
                                        case "2" -> {
                                            System.out.print("\nHorário: ");
                                            horario = in.nextLine();
                                            while(!horario.matches("\\d{2}:\\d{2}")){
                                                System.out.println("ERRO: Horário deve estar no formato HH:MM");
                                                System.out.print("Horario: ");
                                                horario = in.nextLine();
                                            }
                                            consultaAtualizar.setHorario(horario);
                                        }
                                        case "3" -> {
                                            System.out.print("\nMedico: ");
                                            nomeMedico = in.nextLine();
                                            Medico medico = banco.buscarMedico(nomeMedico);
                                            int i = 0;
                                            while (medico == null && i < 3){
                                                System.out.println("Medico nao encontrado:");
                                                System.out.print("\nMedico: ");
                                                nomeMedico = in.nextLine();
                                                medico = banco.buscarMedico(nomeMedico);
                                                ++i;
                                            }
                                            if (medico != null){
                                                consultaAtualizar.setMedico(medico);
                                            }
                                        }
                                        case "4" -> {
                                            System.out.print("\nPaciente: ");
                                            nomePaciente = in.nextLine();
                                            Paciente pac = banco.buscarPaciente(nomePaciente);
                                            int j = 0;
                                            while (pac == null && j < 3){
                                                System.out.println("Paciente nao encontrado:");
                                                System.out.print("\nPaciente: ");
                                                nomePaciente = in.nextLine();
                                                paciente = banco.buscarPaciente(nomePaciente);
                                                ++j;
                                            }
                                            if (pac != null){
                                                consultaAtualizar.setPaciente(pac);
                                            }
                                        }
                                        case "5" -> {
                                            System.out.print("\nTipo de consulta: ");
                                            tipoConsulta = in.nextLine();
                                            while(tipoConsulta != "normal" && tipoConsulta != "retorno"){
                                                System.out.println("ERRO: tipo da consulta deve ser 'normal' ou 'retorno'");
                                                System.out.print("Tipo da consulta: ");
                                                tipoConsulta = in.nextLine();
                                            }
                                            consultaAtualizar.setTipoConsulta(tipoConsulta);
                                        }

                                    }
                                }  
                            }
                        }
                        
                    }
                    retornado = true;
                }
                    
            }
        }
        return true;
    }

    
    public boolean deletarConsulta(){
        int IDBuscado;
        boolean retornado = true;
        while (retornado){
            System.out.println("+------------------------------------+");
            System.out.println("|========= DELETAR CONSULTA =========|");
            System.out.println("+------------------------------------+");
            System.out.println("|Informe o nome do paciente          |");
            System.out.println("|                                    |");
            System.out.println("|(0) Voltar                          |");
            System.out.print("|>>> ");
            String nomePaciente = in.nextLine();
            System.out.println("+------------------------------------+");
            
            switch(nomePaciente){
                case "0" -> retornado = false;
                default -> {
                    // encontramos o paciente pelo nome
                    Paciente paciente = banco.buscarPaciente(nomePaciente);
                    
                    if (paciente != null){
                        /* ativado no caso do paciente ter sido encontrado */
                        /* buscamos todas as consultas do paciente no banco de dados
                           e armazenamos em uma lista "listaConsultas" */
                        ArrayList<Consulta> listaConsultas = banco.buscarConsultaPaciente(paciente);

                        if (listaConsultas.isEmpty()){
                            System.out.println("O paciente ainda nao possui consultas cadastradas!");
                        } else {
                            // mostrando o resumo de todas consultas do paciente
                            for (Consulta CON : listaConsultas){
                                CON.resumoConsulta();
                            }
                            
                            // recebendo o ID da consulta que será deletada
                            System.out.println("\n|Informe o ID da consulta que deseja deletar:");
                            System.out.println("|");
                            System.out.println("|(0) Voltar");
                            boolean deletada = false;
                            boolean parar = false;
                            while (!deletada && !parar){
                                System.out.print("\n|>>> ");
                                IDBuscado = in.nextInt();
                                in.nextLine();
                                switch(IDBuscado){
                                    case 0 -> parar = true;
                                    default -> deletada = banco.removerConsulta(IDBuscado);  
                                }
                            }
                        }       
                    }
                }    
            }      
        }
        return true;
    }
        
}
