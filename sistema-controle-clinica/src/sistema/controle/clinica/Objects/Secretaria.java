package sistema.controle.clinica.Objects;

import java.util.ArrayList;
import java.util.Scanner;

public class Secretaria {
    
    private String nome;
    
    // objetos
    Paciente paciente = new Paciente();
    Medico medico = new Medico();
    Consulta consulta = new Consulta();
    
    // lista de objetos
    ArrayList<Paciente> lista_pacientes = new ArrayList<>();
    ArrayList<Medico> lista_medicos = new ArrayList<>();
  
    Scanner entrada = new Scanner(System.in);

    public Secretaria() {
    }
    
    public Secretaria(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void gerenciar_pacientes(){
        
        String nome; 
        String data_nascimento;
        String endereco;
        String contato;
        String tipo_convenio;
        int acao = 0;
        boolean sessao_encerrada = false;

            
        while (!sessao_encerrada) {

            System.out.println("\n======= Ações =========");
            System.out.println("(1) Cadastrar paciente; ");
            System.out.println("(2) Atualizar dados de pacientes; e");
            System.out.println("(3) Deletar paciente.");
            System.out.println("(4) Sair");
            System.out.print("Qual ações deseja realizar: ");
            
            acao = entrada.nextInt(); 
            // Consumindo a nova linha pendente após nextInt()
            entrada.nextLine();
            
            switch (acao) {

                case 1:
                System.out.println("\n======= Ficha de cadastramento do paciente ==========");
                System.out.print("Nome: ");
                nome = entrada.nextLine();

                System.out.print("Data de nascimento: ");
                data_nascimento = entrada.nextLine();

                System.out.print("Endereço: ");
                endereco = entrada.nextLine();

                System.out.print("Contato telefonico: ");
                contato = entrada.nextLine();

                System.out.print("Tipo do convênio: ");
                tipo_convenio = entrada.nextLine();
                
                paciente = new Paciente(nome, data_nascimento, endereco, contato, tipo_convenio);
                
                lista_pacientes.add(paciente);

                System.out.println("\n======= Paciente cadastrado com sucesso ! ==========");
                paciente.visualizar_dados();
                System.out.println("======================================================");
                break;
                

                case 2:
                    Paciente paciente_encontrado = new Paciente();
                    String nome_paciente;
                    
                    System.out.print("\nQual paciente deseja encontrar: ");
                    nome_paciente = entrada.nextLine();
                    
                    paciente_encontrado = paciente.encontrar_paciente(lista_pacientes, nome_paciente);
                    
                    if (paciente_encontrado == null){
                        System.out.println("Não há paciente cadastrado no sistema com este nome, tente novamente. ");
                        break;
                        
                    } else {
                        
                        System.out.println("\nModo de atualização");
                        System.out.println("======= Dados do paciente =========");
                        System.out.println(paciente_encontrado);
                        System.out.println("===================================");
                        
                        int escolha = 0;
                        
                        while (escolha != 6) {
                            
                            System.out.println("\nQual informação você deseja atualizar ?");
                            System.out.println("1. Nome");
                            System.out.println("2. Data de nascimento");
                            System.out.println("3. Endereço");
                            System.out.println("4. Contato Telefônico");
                            System.out.println("5. Tipo do convênio");
                            System.out.println("6. Sair");
                            System.out.print("\nEscolha uma opção: ");

                            escolha = entrada.nextInt();
                            entrada.nextLine();

                            switch (escolha) {
                                case 1:
                                    System.out.print("Nome: ");
                                    nome = entrada.nextLine();
                                    paciente.setDados_identificacao(nome);
                                    break;
                                case 2:
                                    System.out.print("Data de nascimento: ");
                                    data_nascimento = entrada.nextLine();
                                    paciente.setData_nascimento(data_nascimento);
                                    break;
                                case 3:
                                    System.out.print("Endereço: ");
                                    endereco = entrada.nextLine();
                                    paciente.setEndereco(endereco);
                                    break;
                                case 4:
                                    System.out.print("Contato telefonico: ");
                                    contato = entrada.nextLine();
                                    paciente.setInfo_contato(contato);
                                    break; 
                                case 5:
                                    System.out.print("Tipo do convênio: ");
                                    tipo_convenio = entrada.nextLine();
                                    paciente.setTipo_convenio(tipo_convenio);
                                break;
                                case 6:
                                    System.out.println("==== Paciente atualizado com sucesso =====");
                                    break;
                                default:
                                    System.out.println("Opção inválida. Tente novamente.");
                            }
                        
                        }

                        break;
                    }

                case 3: 
                    
                    Paciente paciente_remover = null;
                    int idPacienteRemover;
                    
                    // Exibindo a lista de pacientes
                    System.out.println("\nLista de Pacientes cadastrados:");
                    for (Paciente paciente : lista_pacientes) {
                        System.out.println(paciente);
                    }
                
                    System.out.print("Escolha o identificados do paciente que deseja excluir: ");
                    idPacienteRemover = entrada.nextInt();
                    
                    for (Paciente paciente : lista_pacientes) {
                        if (paciente.getId() == idPacienteRemover) {
                            paciente_remover = paciente;
                            break;
                        }
                    }
                    
                    if (paciente_remover != null) {
                        lista_pacientes.remove(paciente_remover);
                        System.out.println("\nPaciente " + paciente.getDados_identificacao() + " removido com sucesso !");
                    } else {
                        System.out.println("\nPaciente não encontrado, tente novamente. ");
                    }

                    // Exibindo a lista de pessoas após a remoção
                    System.out.println("\nLista de Pacientes atualiza:");
                    for (Paciente paciente : lista_pacientes) {
                        System.out.println(paciente);
                    }
                    break;
                    
                case 4:
                    System.out.println("Gerenciamento de paciente encerra.");
                    sessao_encerrada = true;
                    break;
                
                default:
                    System.out.println("\nAção não encontrada tente novamente por favor !");
                    break;
            }  
            
        }
        entrada.close();
    }
        
    public void gerenciar_consultas(){
            
            String data; 
            String horario;
            String nome_medico;
            String nome_paciente;
            String tipo_consulta;
            int acao = 0;
            
            while (acao != 4) {

                System.out.println("(1) Cadastrar consulta; ");
                System.out.println("(2) Atualizar dados da consulta; e");
                System.out.println("(3) Deletar consulta.");
                System.out.println("(4) Sair");
                System.out.print("Qual ações deseja realizar: ");
                
                acao = entrada.nextInt(); 
                
                // Consumindo a nova linha pendente após nextInt()
                entrada.nextLine();
                
                switch (acao) {
                    case 1:

                    System.out.print("Data: ");
                    data = entrada.nextLine();

                    System.out.print("Horario: ");
                    horario = entrada.nextLine();

                    System.out.print("Nome do Medico: ");
                    nome_medico = entrada.nextLine();
                    medico.setNome(nome_medico);

                    System.out.print("Nome do paciente: ");
                    nome_paciente = entrada.nextLine();
                    paciente.setDados_identificacao(nome_paciente);
                    
                    System.out.print("Tipo da consulta: ");
                    tipo_consulta = entrada.nextLine();

                    consulta.setData(data);
                    consulta.setHorario(horario);
                    consulta.setMedico(medico);
                    consulta.setPaciente(paciente);
                    consulta.setTipo_consulta(tipo_consulta);

                    System.out.println("\n======= Consulta cadastrado com sucesso ! ==========");
                    consulta.visualizar_consulta();
                    System.out.println("======================================================");
                    break;

                    case 2:
                        
                        if (consulta.getPaciente().getDados_identificacao() == null){
                            System.out.println("Não há consulta cadastrado no sistema. ");
                            break;
                            
                        } else {
                            
                            System.out.print("Data: ");
                            data = entrada.nextLine();

                            System.out.print("Horario: ");
                            horario = entrada.nextLine();

                            System.out.print("Nome do Medico: ");
                            nome_medico = entrada.nextLine();
                            medico.setNome(nome_medico);

                            System.out.print("Nome do paciente: ");
                            nome_paciente = entrada.nextLine();
                            paciente.setDados_identificacao(nome_paciente);

                            System.out.print("Tipo da consulta: ");
                            tipo_consulta = entrada.nextLine();

                            consulta.setData(data);
                            consulta.setHorario(horario);
                            consulta.setMedico(medico);
                            consulta.setPaciente(paciente);
                            consulta.setTipo_consulta(tipo_consulta);

                            System.out.println("==== Consulta atualizado com sucesso =====");
                            consulta.visualizar_consulta();
                            System.out.println("==========================================");
                            break;
                            
                        }
    
                    case 3: 
                        
                        if (consulta.getPaciente().getDados_identificacao() == null){
                            System.out.println("Não há consulta cadastrado no sistema. ");
                            break;
                            
                        } else {
                            System.out.println("Consulta do " + consulta.getPaciente().getDados_identificacao() + " com " + consulta.getMedico().getNome() + " removido com sucesso !");
                            paciente.setDados_identificacao(null);
                            break;
                        }
                    
                    case 4:
                        System.out.println("Sessão encerrada.");
                        break;
                    
                    default:
                        System.out.println("Ação não encontrada tente novamente por favor !");
                        break;
                        

                }  
                
            }
        entrada.close();
    }
}
