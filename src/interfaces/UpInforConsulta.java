package interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import servicos.Secretaria;
import registros.Consulta;

public class UpInforConsulta extends javax.swing.JFrame {

    private static EntityManagerFactory emf;
    
    public UpInforConsulta(Integer idPaciente, EntityManagerFactory emf) {
        initComponents();
        setLocationRelativeTo(null);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Secretaria sec = new Secretaria();
        
        Consulta consulta = sec.searchConsulta(emf, idPaciente);
        
        txtDataConsulta.setText(consulta.getData());
        txtConsultaHorario.setText(consulta.getHorario());
        txtMedicoConsulta.setText(consulta.getMedico());
        txtIdPaciente.setText(String.valueOf(consulta.getPaciente()));
        cbxTpConsulta.setSelectedItem(consulta.getTipoConsulta());
       
        btnSalvarConsulta.addActionListener(evt ->{
        
            try {
                
                Consulta con = new Consulta();
                con.setData(LocalDate.parse(txtDataConsulta.getText(), formatter).format(formatter));
                con.setHorario(txtConsultaHorario.getText());
                con.setMedico(txtMedicoConsulta.getText());
                con.setPaciente(Integer.parseInt(txtIdPaciente.getText()));
                con.setTipoConsulta((String) cbxTpConsulta.getSelectedItem());
                con.setDuracao(con.getTipoConsulta());
                
                sec.updateCadConsulta(emf, consulta);
                
                this.dispose();
                new GerConsulta(emf).setVisible(true);
            
            }catch (NumberFormatException e) {
                
                // Se não for um número, exibe a mensagem de erro
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                txtIdPaciente.setText("");
                txtIdPaciente.requestFocus();
                
            }catch (DateTimeParseException e) {
            
                JOptionPane.showMessageDialog(null, "Por favor, insira uma data válida. [dd/mm/yyyy]", "Erro", JOptionPane.ERROR_MESSAGE);
                txtDataConsulta.setText("");
                txtDataConsulta.requestFocus();
                
            }
        
        });
        
        btnCancelarConsulta.addActionListener(evt -> {
        
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
        txtDataConsulta = new java.awt.TextField();
        label2 = new java.awt.Label();
        txtConsultaHorario = new java.awt.TextField();
        label3 = new java.awt.Label();
        txtMedicoConsulta = new java.awt.TextField();
        label4 = new java.awt.Label();
        txtIdPaciente = new java.awt.TextField();
        label5 = new java.awt.Label();
        cbxTpConsulta = new javax.swing.JComboBox<>();
        btnSalvarConsulta = new java.awt.Button();
        btnCancelarConsulta = new java.awt.Button();

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

        txtDataConsulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDataConsulta.setPreferredSize(new java.awt.Dimension(50, 15));
        txtDataConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(txtDataConsulta);

        label2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label2.setText("Horário: ");
        jPanel1.add(label2);

        txtConsultaHorario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtConsultaHorario.setMinimumSize(new java.awt.Dimension(50, 50));
        txtConsultaHorario.setPreferredSize(new java.awt.Dimension(1, 15));
        jPanel1.add(txtConsultaHorario);

        label3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label3.setText("Médico: ");
        jPanel1.add(label3);

        txtMedicoConsulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMedicoConsulta.setPreferredSize(new java.awt.Dimension(1, 15));
        jPanel1.add(txtMedicoConsulta);

        label4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label4.setText("Identificador do Paciente:");
        jPanel1.add(label4);

        txtIdPaciente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtIdPaciente.setPreferredSize(new java.awt.Dimension(1, 15));
        jPanel1.add(txtIdPaciente);

        label5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label5.setText("Tipo da consulta:");
        jPanel1.add(label5);

        cbxTpConsulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbxTpConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Retorno" }));
        cbxTpConsulta.setPreferredSize(new java.awt.Dimension(1, 15));
        jPanel1.add(cbxTpConsulta);

        btnSalvarConsulta.setBackground(new java.awt.Color(0, 204, 51));
        btnSalvarConsulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalvarConsulta.setLabel("Salvar");

        btnCancelarConsulta.setBackground(new java.awt.Color(255, 51, 0));
        btnCancelarConsulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelarConsulta.setLabel("Voltar");

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
                                .addComponent(btnCancelarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btnSalvarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataConsultaActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpInforConsulta(0, emf).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCancelarConsulta;
    private java.awt.Button btnSalvarConsulta;
    private javax.swing.JComboBox<String> cbxTpConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.TextField txtConsultaHorario;
    private java.awt.TextField txtDataConsulta;
    private java.awt.TextField txtIdPaciente;
    private java.awt.TextField txtMedicoConsulta;
    // End of variables declaration//GEN-END:variables
}
