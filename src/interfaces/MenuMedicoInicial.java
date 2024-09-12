package interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jLabel3 = new javax.swing.JLabel();
        jOptionPane1 = new javax.swing.JOptionPane();
        JBprontuarioPaciente = new javax.swing.JButton();
        JBfichaPaciente = new javax.swing.JButton();
        JBrelatorios = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        JDbuscarPaciente.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        JDbuscarPaciente.setTitle("BUSCA DO PACIENTE");
        JDbuscarPaciente.setResizable(false);
        JDbuscarPaciente.setSize(new java.awt.Dimension(400, 350));

        jLabel1.setText("Informe o nome do paciente");

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

        jLabel3.setText("JDIALOG 1");

        javax.swing.GroupLayout JDbuscarPacienteLayout = new javax.swing.GroupLayout(JDbuscarPaciente.getContentPane());
        JDbuscarPaciente.getContentPane().setLayout(JDbuscarPacienteLayout);
        JDbuscarPacienteLayout.setHorizontalGroup(
            JDbuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDbuscarPacienteLayout.createSequentialGroup()
                .addGroup(JDbuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDbuscarPacienteLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(JDbuscarPacienteLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JDbuscarPacienteLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton5))
                    .addGroup(JDbuscarPacienteLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton6))
                    .addGroup(JDbuscarPacienteLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JDbuscarPacienteLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel3)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        JDbuscarPacienteLayout.setVerticalGroup(
            JDbuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDbuscarPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton6)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU MÉDICO");
        setResizable(false);
        setSize(new java.awt.Dimension(480, 300));

        JBprontuarioPaciente.setText("PRONTUÁRIO DO PACIENTE");
        JBprontuarioPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBprontuarioPacienteMouseClicked(evt);
            }
        });

        JBfichaPaciente.setText("FICHA DO PACIENTE");
        JBfichaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBfichaPacienteMouseClicked(evt);
            }
        });

        JBrelatorios.setText("RELATÓRIOS");
        JBrelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBrelatoriosMouseClicked(evt);
            }
        });

        jButton4.setText("VOLTAR");
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
        // TODO add your handling code here:
        setOpcaoEscolhida("PRONTUARIO");
        apagaJanelaBusca();
        JDbuscarPaciente.setVisible(true);
        
    }//GEN-LAST:event_JBprontuarioPacienteMouseClicked
    
    // BOTÃO FICHA DO PACIENTE
    private void JBfichaPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBfichaPacienteMouseClicked
        // TODO add your handling code here:
        setOpcaoEscolhida("FICHA");
        apagaJanelaBusca();
        JDbuscarPaciente.setVisible(true);
    }//GEN-LAST:event_JBfichaPacienteMouseClicked

    private void JBrelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBrelatoriosMouseClicked
        // TODO add your handling code here:
        // cria uma janela MENU MÉDICO RELATORIO
        
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
        //this.setVisible(false);
        //JDbuscarPaciente.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    // BOTÃO OK - PACIENTE SELECIONADO
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        int indexSelecionado = jList1.getSelectedIndex();
        Paciente pacienteSelecionado = this.PACIETNES_BUSCADOS.get(indexSelecionado);
        if(getOpcaoEscolhida().equals("PRONTUARIO")){
            new MenuMedicoProntuarios(this.EMF, this, this.MEDICO, pacienteSelecionado).setVisible(true);
        } else if (getOpcaoEscolhida().equals("FICHA")){
            new MenuMedicoFicha(this.EMF, this, this.MEDICO, pacienteSelecionado).setVisible(true);
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        jButton6.setVisible(true);
    }//GEN-LAST:event_jList1ValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBfichaPaciente;
    private javax.swing.JButton JBprontuarioPaciente;
    private javax.swing.JButton JBrelatorios;
    private javax.swing.JDialog JDbuscarPaciente;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
