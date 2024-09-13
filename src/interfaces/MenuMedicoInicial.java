package interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import servicos.Medico;
import registros.Paciente;

public class MenuMedicoInicial extends javax.swing.JFrame {
    private EntityManagerFactory EMF;
    private Medico MEDICO;
    private List<Paciente> PACIETNES_BUSCADOS = new ArrayList<Paciente>();
    private String OPCAO_ESCOLHIDA = "NADA";

    public MenuMedicoInicial(EntityManagerFactory emf, Medico medico) {
        this.EMF = emf;
        this.MEDICO = medico;
        initComponents();
        this.setLocationRelativeTo(null);
        JDbuscarPaciente.setLocationRelativeTo(null);
        jButton6.setVisible(false);
    }
    
    private void setOpcaoEscolhida(String opcao){
        this.OPCAO_ESCOLHIDA = opcao;
    }
    
    private String getOpcaoEscolhida(){
        return this.OPCAO_ESCOLHIDA;
    }
    
    public void apagaJanelaBusca(){
        jTextField1.setText("");
        DefaultListModel<String> listModel = new DefaultListModel<>();
        jList1.setModel(listModel);
        this.PACIETNES_BUSCADOS.clear();
        jButton6.setVisible(false);
        JDbuscarPaciente.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDbuscarPaciente = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton6 = new javax.swing.JButton();
        JDrelatorio = new javax.swing.JDialog();
        JBreceita = new javax.swing.JButton();
        JBatestado = new javax.swing.JButton();
        JBacompanha = new javax.swing.JButton();
        JBclientes = new javax.swing.JButton();
        JBvoltar = new javax.swing.JButton();
        JDclientes = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        JLclientes = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        JBprontuarioPaciente = new javax.swing.JButton();
        JBfichaPaciente = new javax.swing.JButton();
        JBrelatorios = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        JDbuscarPaciente.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        JDbuscarPaciente.setTitle("BUSCA DO PACIENTE");
        JDbuscarPaciente.setResizable(false);
        JDbuscarPaciente.setSize(new java.awt.Dimension(650, 350));

        jLabel1.setText("INFORME O NOME DO PACIENTE");

        jButton5.setText("BUSCAR");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton6.setText("OK");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JDbuscarPacienteLayout = new javax.swing.GroupLayout(JDbuscarPaciente.getContentPane());
        JDbuscarPaciente.getContentPane().setLayout(JDbuscarPacienteLayout);
        JDbuscarPacienteLayout.setHorizontalGroup(
            JDbuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDbuscarPacienteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(JDbuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jScrollPane1))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDbuscarPacienteLayout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addGroup(JDbuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDbuscarPacienteLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(285, 285, 285))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDbuscarPacienteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDbuscarPacienteLayout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(287, 287, 287))))
        );
        JDbuscarPacienteLayout.setVerticalGroup(
            JDbuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDbuscarPacienteLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        JDrelatorio.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        JDrelatorio.setSize(new java.awt.Dimension(360, 350));

        JBreceita.setText("RECEITA");
        JBreceita.setFocusable(false);
        JBreceita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBreceitaMouseClicked(evt);
            }
        });

        JBatestado.setText("ATESTADO");
        JBatestado.setFocusable(false);
        JBatestado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBatestadoMouseClicked(evt);
            }
        });

        JBacompanha.setText("DECLARAÇÃO DE ACOMPANHAMENTO");
        JBacompanha.setFocusable(false);
        JBacompanha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBacompanhaMouseClicked(evt);
            }
        });

        JBclientes.setText("CLIENTES");
        JBclientes.setFocusable(false);
        JBclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBclientesMouseClicked(evt);
            }
        });

        JBvoltar.setText("VOLTAR");
        JBvoltar.setFocusable(false);
        JBvoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBvoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JDrelatorioLayout = new javax.swing.GroupLayout(JDrelatorio.getContentPane());
        JDrelatorio.getContentPane().setLayout(JDrelatorioLayout);
        JDrelatorioLayout.setHorizontalGroup(
            JDrelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDrelatorioLayout.createSequentialGroup()
                .addGroup(JDrelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDrelatorioLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(JDrelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBacompanha, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBatestado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBreceita, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JDrelatorioLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(JBvoltar)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        JDrelatorioLayout.setVerticalGroup(
            JDrelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDrelatorioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(JBreceita)
                .addGap(18, 18, 18)
                .addComponent(JBatestado)
                .addGap(18, 18, 18)
                .addComponent(JBacompanha)
                .addGap(18, 18, 18)
                .addComponent(JBclientes)
                .addGap(38, 38, 38)
                .addComponent(JBvoltar)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        JDclientes.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        JDclientes.setTitle("CLIENTES NO MÊS");
        JDclientes.setSize(new java.awt.Dimension(400, 300));

        jScrollPane2.setViewportView(JLclientes);

        jLabel2.setText("OS CLIENTES ATENDIDOS NO MÊS FORAM");

        javax.swing.GroupLayout JDclientesLayout = new javax.swing.GroupLayout(JDclientes.getContentPane());
        JDclientes.getContentPane().setLayout(JDclientesLayout);
        JDclientesLayout.setHorizontalGroup(
            JDclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDclientesLayout.createSequentialGroup()
                .addGroup(JDclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDclientesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JDclientesLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        JDclientesLayout.setVerticalGroup(
            JDclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDclientesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Médico");
        setResizable(false);
        setSize(new java.awt.Dimension(480, 300));

        JBprontuarioPaciente.setText("PRONTUÁRIO DO PACIENTE");
        JBprontuarioPaciente.setFocusable(false);
        JBprontuarioPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBprontuarioPacienteMouseClicked(evt);
            }
        });

        JBfichaPaciente.setText("FICHA DO PACIENTE");
        JBfichaPaciente.setFocusable(false);
        JBfichaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBfichaPacienteMouseClicked(evt);
            }
        });

        JBrelatorios.setText("RELATÓRIOS");
        JBrelatorios.setFocusable(false);
        JBrelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBrelatoriosMouseClicked(evt);
            }
        });

        jButton4.setText("VOLTAR");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JBprontuarioPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBrelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBfichaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jButton4)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(JBprontuarioPaciente)
                .addGap(18, 18, 18)
                .addComponent(JBfichaPaciente)
                .addGap(18, 18, 18)
                .addComponent(JBrelatorios)
                .addGap(40, 40, 40)
                .addComponent(jButton4)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // BOTÃO PRONTUÁRIO DO PACIENTE
    private void JBprontuarioPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBprontuarioPacienteMouseClicked
        setOpcaoEscolhida("PRONTUARIO");
        apagaJanelaBusca();
        JDbuscarPaciente.setVisible(true); 
    }//GEN-LAST:event_JBprontuarioPacienteMouseClicked
    
    // BOTÃO FICHA DO PACIENTE
    private void JBfichaPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBfichaPacienteMouseClicked
        setOpcaoEscolhida("FICHA");
        apagaJanelaBusca();
        JDbuscarPaciente.setVisible(true);
    }//GEN-LAST:event_JBfichaPacienteMouseClicked

    private void JBrelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBrelatoriosMouseClicked
        // cria uma janela MENU MÉDICO RELATORIO
        JDrelatorio.setLocationRelativeTo(null);
        JDrelatorio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JBrelatoriosMouseClicked

    // BOTÃO VOLTAR
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        new JanelaStart(this.EMF).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked
    
    // BOTÃO BUSCAR PACIENTE
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // buscar o paciente no banco de dados pelo nome
        String nomeBuscado = jTextField1.getText();
        if(!nomeBuscado.isBlank()){
            List<Paciente> listaPacientes = this.MEDICO.searchPacienteByName(this.EMF, nomeBuscado);
            this.PACIETNES_BUSCADOS = listaPacientes;
            if (this.PACIETNES_BUSCADOS.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null, 
                        "Nenhum paciente encontrado com o nome " + nomeBuscado + ".", 
                        "Paciente não encontrado", JOptionPane.WARNING_MESSAGE);
            } else {
                DefaultListModel<String> listModel = new DefaultListModel<>();

                for (Paciente paciente : this.PACIETNES_BUSCADOS) {
                    String infoPaciente = String.format("ID: %d | "
                                                      + "NOME: %s | " 
                                                      + "NASC.: %s | " 
                                                      + "CEL.: %d | " 
                                                      + "CONVENIO: %s |" ,
                                                        paciente.getId(), 
                                                        paciente.getNome(),
                                                        paciente.getData_nascimento(),
                                                        paciente.getInfo_contatoCelular(),
                                                        paciente.getTipo_convenio());
                    listModel.addElement(infoPaciente);
                }
                jList1.setModel(listModel);

            } // else
        }
    }//GEN-LAST:event_jButton5MouseClicked

    // BOTÃO OK - PACIENTE SELECIONADO
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        int indexSelecionado = jList1.getSelectedIndex();
        Paciente pacienteSelecionado = this.PACIETNES_BUSCADOS.get(indexSelecionado);
        if(getOpcaoEscolhida().equals("PRONTUARIO")){
            new MenuMedicoProntuarios(this.EMF, this, this.MEDICO, pacienteSelecionado).setVisible(true);
            JDbuscarPaciente.dispose();
        } else if (getOpcaoEscolhida().equals("FICHA")){
            new MenuMedicoFicha(this.EMF, this, this.MEDICO, pacienteSelecionado).setVisible(true);
            JDbuscarPaciente.dispose();
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        jButton6.setVisible(true);
    }//GEN-LAST:event_jList1ValueChanged

    private void JBvoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBvoltarMouseClicked
        this.setVisible(true);
        JDrelatorio.dispose();
    }//GEN-LAST:event_JBvoltarMouseClicked

    private void JBreceitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBreceitaMouseClicked
        this.OPCAO_ESCOLHIDA = "RECEITA";
        new MenuMedicoRelatorios(this.EMF, this, this.MEDICO, this.OPCAO_ESCOLHIDA).setVisible(true);
    }//GEN-LAST:event_JBreceitaMouseClicked

    private void JBatestadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBatestadoMouseClicked
        this.OPCAO_ESCOLHIDA = "ATESTADO";
        new MenuMedicoRelatorios(this.EMF, this, this.MEDICO, this.OPCAO_ESCOLHIDA).setVisible(true);
    }//GEN-LAST:event_JBatestadoMouseClicked

    private void JBacompanhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBacompanhaMouseClicked
        this.OPCAO_ESCOLHIDA = "DECLARACAO";
        new MenuMedicoRelatorios(this.EMF, this, this.MEDICO, this.OPCAO_ESCOLHIDA).setVisible(true);
    }//GEN-LAST:event_JBacompanhaMouseClicked

    private void JBclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBclientesMouseClicked
        List<Paciente> clientesMes = this.MEDICO.getClientesNoMes(this.EMF);
        
        DefaultListModel<String> listModel = new DefaultListModel<>();
        
        for (Paciente PAC : clientesMes) {
            String infoAtendimento = String.format("|ID: %d |PACIENTE: %s |", PAC.getId(), PAC.getNome());
            listModel.addElement(infoAtendimento);
        }
        JLclientes.setModel(listModel);
        JDclientes.setLocationRelativeTo(null);
        JDclientes.setVisible(true);
    }//GEN-LAST:event_JBclientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBacompanha;
    private javax.swing.JButton JBatestado;
    private javax.swing.JButton JBclientes;
    private javax.swing.JButton JBfichaPaciente;
    private javax.swing.JButton JBprontuarioPaciente;
    private javax.swing.JButton JBreceita;
    private javax.swing.JButton JBrelatorios;
    private javax.swing.JButton JBvoltar;
    private javax.swing.JDialog JDbuscarPaciente;
    private javax.swing.JDialog JDclientes;
    private javax.swing.JDialog JDrelatorio;
    private javax.swing.JList<String> JLclientes;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
