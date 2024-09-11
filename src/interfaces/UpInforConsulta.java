package interfaces;

import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import pessoas.Secretaria;
import documentos.Consulta;

public class UpInforConsulta extends javax.swing.JFrame {

    private static EntityManagerFactory emf;
    
    public UpInforConsulta(Integer idPaciente, EntityManagerFactory emf) {
        initComponents();
        setLocationRelativeTo(null);
        
        Secretaria sec = new Secretaria("Teste", "123");
        
        Consulta consulta = sec.searchConsulta(emf, idPaciente);
        
        txtNomePaciente.setText(consulta.getData());
        txtDataNascimentoPaciente.setText(consulta.getHorario());
        txtEnderecoPaciente.setText(consulta.getMedico());
        txtInfoContatoPaciente.setText(String.valueOf(consulta.getPaciente()));
        cbxTpConvenioPaciente.setSelectedItem(consulta.getTipoConsulta());
       
        btnSalvarPaciente.addActionListener(evt ->{
        
            try {
                
                consulta.setData(txtNomePaciente.getText());
                consulta.setHorario(txtDataNascimentoPaciente.getText());
                consulta.setMedico(txtEnderecoPaciente.getText());
                consulta.setPaciente(Integer.parseInt(txtInfoContatoPaciente.getText()));
                consulta.setTipoConsulta((String) cbxTpConvenioPaciente.getSelectedItem());
                consulta.setDuracao(consulta.getTipoConsulta());
                
                sec.updateCadConsulta(emf, consulta);
                
                this.dispose();
                new GerConsulta(emf).setVisible(true);
            
            }catch (NumberFormatException e) {
                
                // Se não for um número, exibe a mensagem de erro
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                txtInfoContatoPaciente.setText("");
                txtInfoContatoPaciente.requestFocus();
                
            }
        
        });
        
        btnCancelarPaciente.addActionListener(evt -> {
        
            setVisible(false);
            new GerConsulta(emf).setVisible(true);
        
        });
 
    }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        txtNomePaciente = new java.awt.TextField();
        label2 = new java.awt.Label();
        txtDataNascimentoPaciente = new java.awt.TextField();
        label3 = new java.awt.Label();
        txtEnderecoPaciente = new java.awt.TextField();
        label4 = new java.awt.Label();
        txtInfoContatoPaciente = new java.awt.TextField();
        label5 = new java.awt.Label();
        cbxTpConvenioPaciente = new javax.swing.JComboBox<>();
        btnSalvarPaciente = new java.awt.Button();
        btnCancelarPaciente = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atualização de informações de paciente");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atualizar Informações da Consulta");
        jLabel1.setAlignmentX(0.5F);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        label1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label1.setText("Data:");
        jPanel1.add(label1);

        txtNomePaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNomePaciente.setPreferredSize(new java.awt.Dimension(50, 15));
        txtNomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePacienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtNomePaciente);

        label2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label2.setText("Horário: ");
        jPanel1.add(label2);

        txtDataNascimentoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDataNascimentoPaciente.setMinimumSize(new java.awt.Dimension(50, 50));
        txtDataNascimentoPaciente.setPreferredSize(new java.awt.Dimension(1, 15));
        jPanel1.add(txtDataNascimentoPaciente);

        label3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label3.setText("Médico: ");
        jPanel1.add(label3);

        txtEnderecoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEnderecoPaciente.setPreferredSize(new java.awt.Dimension(1, 15));
        jPanel1.add(txtEnderecoPaciente);

        label4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label4.setText("Identificador do Paciente:");
        jPanel1.add(label4);

        txtInfoContatoPaciente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtInfoContatoPaciente.setPreferredSize(new java.awt.Dimension(1, 15));
        jPanel1.add(txtInfoContatoPaciente);

        label5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label5.setText("Tipo da consulta:");
        jPanel1.add(label5);

        cbxTpConvenioPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbxTpConvenioPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Retorno" }));
        cbxTpConvenioPaciente.setPreferredSize(new java.awt.Dimension(1, 15));
        jPanel1.add(cbxTpConvenioPaciente);

        btnSalvarPaciente.setBackground(new java.awt.Color(0, 204, 51));
        btnSalvarPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalvarPaciente.setLabel("Salvar");

        btnCancelarPaciente.setBackground(new java.awt.Color(255, 51, 0));
        btnCancelarPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelarPaciente.setLabel("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(btnCancelarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePacienteActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpInforConsulta(0, emf).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCancelarPaciente;
    private java.awt.Button btnSalvarPaciente;
    private javax.swing.JComboBox<String> cbxTpConvenioPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.TextField txtDataNascimentoPaciente;
    private java.awt.TextField txtEnderecoPaciente;
    private java.awt.TextField txtInfoContatoPaciente;
    private java.awt.TextField txtNomePaciente;
    // End of variables declaration//GEN-END:variables
}
