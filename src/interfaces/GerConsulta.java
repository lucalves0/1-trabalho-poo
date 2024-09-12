package interfaces;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import serviços.Secretaria;
import registros.Consulta;

public class GerConsulta extends javax.swing.JFrame {
    
    private static EntityManagerFactory emf;
    
    public GerConsulta(EntityManagerFactory emf) {
        initComponents();
        setLocationRelativeTo(null);
        
        Secretaria sec = new Secretaria();
        
        btnBuscarPaciente.addActionListener(avt -> {
            Integer nomeBuscar = Integer.parseInt(txtBuscaNomePaciente.getText());
            List<Consulta> consultas = sec.searchConsultaByPaciente(emf, nomeBuscar);

            if (consultas.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null, 
                        "Nenhuma consulta encontrada para o paciente de ID " + nomeBuscar + ".", 
                        "Consulta não encontrada", JOptionPane.WARNING_MESSAGE);
            } else {

                DefaultListModel<String> listModel = new DefaultListModel<>();

                for (Consulta con : consultas) {
                    String infoCon = String.format("Identificador da Consulta: %d | "
                                                      + "Data da Consulta: %s | " 
                                                      + "Horario da Consulta: %s | " 
                                                      + "Medico: %s | " 
                                                      + "Id do Paciente: %s | " 
                                                      + "Tipo da Consulta: %s |" 
                                                      + "Duracao: %s |" , 
                                                        con.getId(), 
                                                        con.getData(),
                                                        con.getHorario(),
                                                        con.getMedico(),
                                                        con.getPaciente(),
                                                        con.getTipoConsulta(),
                                                        con.getDuracao());
                    listModel.addElement(infoCon);
                }
                listPacientesCad.setModel(listModel);
            }

        });

        cadPacientes.addActionListener(e -> {
            setVisible(false);

            // Código para abrir a nova tela
            CadConsulta telaCadConsulta = new CadConsulta(emf);
            telaCadConsulta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            telaCadConsulta.setVisible(true);
        });

        upPaciente.addActionListener(e -> {
            int confirmacao = JOptionPane.showConfirmDialog(null, 
            "Recomendamos que antes de prosseguir, verifique o identificador da Consulta. Deseja prosseguir?", 
            "Confirmar", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.INFORMATION_MESSAGE);

            if (confirmacao == JOptionPane.YES_OPTION) {
                // Solicita o ID da Consulta ao usuário
                String idPacienteStr = JOptionPane.showInputDialog(null, "Digite o ID da consulta que deseja atualizar suas informações");

                // Verifica se o ID foi inserido ou se o usuário clicou em cancelar
                if (idPacienteStr != null && !idPacienteStr.trim().isEmpty()) {
                    try {
                        // Tenta converter o ID para um inteiro
                        Integer idPaciente = Integer.parseInt(idPacienteStr);

                        // Criar a query para buscar pacientes pelo ID

                        List<Consulta> consultas = sec.searchConsultaList(emf, idPaciente);

                        if (!consultas.isEmpty()) {
                            // Se a consulta for encontrada, oculta a tela atual e abre a nova tela
                            setVisible(false);
                            UpInforConsulta telaUpInforConsultas = new UpInforConsulta(idPaciente, emf);
                            telaUpInforConsultas.setVisible(true);
                            telaUpInforConsultas.setLocationRelativeTo(null); // Opcional: centraliza a nova tela
                        } else {
                            // Exibe mensagem informando que a Consulta não foi encontrada
                            JOptionPane.showMessageDialog(null, "Consulta com o ID '" + idPaciente + "' não encontrado.", "Consulta não encontrada", JOptionPane.WARNING_MESSAGE);
                        }

                    } catch (NumberFormatException ex) {
                        // Exibe mensagem de erro se o ID não for um número válido
                        JOptionPane.showMessageDialog(null, "ID inválido. Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ID da consulta não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        deletePacientes.addActionListener(e -> {
            int confirmacao = JOptionPane.showConfirmDialog(null, 
            "Recomendamos que antes de deletar a consulta, verifique o identificador da consulta. Deseja prosseguir?", 
            "Confirmar", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.INFORMATION_MESSAGE);
            
            if (confirmacao == JOptionPane.YES_OPTION) {
                
                // Solicita o ID da consulta ao usuário
                String idConsultaStr = JOptionPane.showInputDialog(null, "Digite o ID da consulta que deseja remover do sistema");
                
                // Verifica se o ID foi inserido ou se o usuário clicou em cancelar
                if (idConsultaStr != null && !idConsultaStr.trim().isEmpty()) {
                    try {
                        // Tenta converter o ID para um inteiro
                        Integer idConsulta = Integer.parseInt(idConsultaStr);

                        // Criar a query para buscar pacientes pelo ID
                        List<Consulta> lst = sec.searchConsultaList(emf, idConsulta);
                        Consulta con;
                        
                        if(lst.isEmpty()){
                            con = null;
                        }else{
                            con = lst.get(0);
                        }

                        if (con != null){
                            int conf = JOptionPane.showConfirmDialog(null, 
                            "Ao apagar a consulta você perderá todas as informações relacionado a ela. Deseja excluir mesmo?", 
                            "Confirmar", 
                            JOptionPane.YES_NO_OPTION, 
                            JOptionPane.INFORMATION_MESSAGE);

                            if (confirmacao == JOptionPane.YES_OPTION){
                                sec.removeCadConsulta(emf, con);
                            }   
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Consulta não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                            
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "ID inválido. Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ID da consulta não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        
        });
     
        Voltar.addActionListener(e -> {
            this.dispose();
            new MenuSecretaria(emf).setVisible(true);
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        panelGerPacientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        txtBuscaNomePaciente = new java.awt.TextField();
        btnBuscarPaciente = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPacientesCad = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadPacientes = new javax.swing.JMenuItem();
        upPaciente = new javax.swing.JMenuItem();
        deletePacientes = new javax.swing.JMenuItem();
        Voltar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Pacientes Cadastrados");
        setPreferredSize(new java.awt.Dimension(684, 464));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GERENCIAMENTO DE CONSULTAS");

        label1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label1.setText("Buscar Consulta por Paciente");

        txtBuscaNomePaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnBuscarPaciente.setActionCommand("Buscar");
        btnBuscarPaciente.setBackground(new java.awt.Color(0, 204, 0));
        btnBuscarPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnBuscarPaciente.setLabel("Buscar");

        jScrollPane1.setViewportView(listPacientesCad);

        javax.swing.GroupLayout panelGerPacientesLayout = new javax.swing.GroupLayout(panelGerPacientes);
        panelGerPacientes.setLayout(panelGerPacientesLayout);
        panelGerPacientesLayout.setHorizontalGroup(
            panelGerPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGerPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGerPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGerPacientesLayout.createSequentialGroup()
                        .addComponent(txtBuscaNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelGerPacientesLayout.setVerticalGroup(
            panelGerPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGerPacientesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGerPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscaNomePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelGerPacientes);

        jMenu1.setText("Ações");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        cadPacientes.setText("Cadastro de Consultas");
        cadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadPacientesActionPerformed(evt);
            }
        });
        jMenu1.add(cadPacientes);

        upPaciente.setText("Atualizar informações de Consultas");
        jMenu1.add(upPaciente);

        deletePacientes.setText("Remover Consultas");
        jMenu1.add(deletePacientes);

        Voltar.setText("Voltar");
        jMenu1.add(Voltar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadPacientesActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerConsulta(emf).setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Voltar;
    private java.awt.Button btnBuscarPaciente;
    private javax.swing.JMenuItem cadPacientes;
    private javax.swing.JMenuItem deletePacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.List list1;
    private javax.swing.JList<String> listPacientesCad;
    private javax.swing.JPanel panelGerPacientes;
    private java.awt.TextField txtBuscaNomePaciente;
    private javax.swing.JMenuItem upPaciente;
    // End of variables declaration//GEN-END:variables
}
