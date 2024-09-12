package interfaces;

import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import servicos.Secretaria;
import registros.Consulta;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CadConsulta extends javax.swing.JFrame {
    
    private static EntityManagerFactory emf;
    
    public CadConsulta(EntityManagerFactory emf) {
        initComponents();
        setLocationRelativeTo(null);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Secretaria sec = new Secretaria();
        
        btnSalvarConsulta.addActionListener(evt ->{
        
            try {
                
                Consulta con = new Consulta();
                con.setData(LocalDate.parse(txtDataConsulta.getText(), formatter).format(formatter));
                con.setHorario(txtHorarioConsulta.getText());
                con.setMedico(txtMedico.getText());
                con.setPaciente(Integer.parseInt(txtIdPaciente.getText()));
                con.setTipoConsulta((String) cbxTpConsulta.getSelectedItem());
                con.setDuracao(con.getTipoConsulta());
                
                sec.postCadConsulta(emf, con);
                
                this.dispose();
                new GerConsulta(emf).setVisible(true);
            
            }catch (NumberFormatException e) {
                
                // Se não for um número, exibe a mensagem de erro
                JOptionPane.showMessageDialog(null, "Por favor, insira um número para o identificador válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                txtIdPaciente.setText("");
                txtIdPaciente.requestFocus();
                
            }catch (DateTimeParseException e) {
            
                JOptionPane.showMessageDialog(null, "Por favor, insira uma data válida. [dd/mm/yyyy]", "Erro", JOptionPane.ERROR_MESSAGE);
                txtDataConsulta.setText("");
                txtDataConsulta.requestFocus();
                
            }
        });
        
        btnCancelar.addActionListener(evt -> {
        
            setVisible(false);
            new GerConsulta(emf).setVisible(true);
        
        });
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelFormPaciente = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        txtDataConsulta = new java.awt.TextField();
        label2 = new java.awt.Label();
        txtHorarioConsulta = new java.awt.TextField();
        label3 = new java.awt.Label();
        txtMedico = new java.awt.TextField();
        label4 = new java.awt.Label();
        txtIdPaciente = new java.awt.TextField();
        label5 = new java.awt.Label();
        cbxTpConsulta = new javax.swing.JComboBox<>();
        btnSalvarConsulta = new java.awt.Button();
        btnCancelar = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de cadastro de consultas");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulário de Cadastro de Consultas");
        jLabel1.setAlignmentX(0.5F);

        panelFormPaciente.setLayout(new javax.swing.BoxLayout(panelFormPaciente, javax.swing.BoxLayout.PAGE_AXIS));

        label1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label1.setText("Data:");
        panelFormPaciente.add(label1);

        txtDataConsulta.setPreferredSize(new java.awt.Dimension(1, 1));
        txtDataConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataConsultaActionPerformed(evt);
            }
        });
        panelFormPaciente.add(txtDataConsulta);

        label2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label2.setText("Horário:");
        panelFormPaciente.add(label2);

        txtHorarioConsulta.setPreferredSize(new java.awt.Dimension(1, 1));
        panelFormPaciente.add(txtHorarioConsulta);

        label3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label3.setText("Médico:");
        panelFormPaciente.add(label3);

        txtMedico.setPreferredSize(new java.awt.Dimension(1, 1));
        panelFormPaciente.add(txtMedico);

        label4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label4.setText("Identificador do Paciente:");
        panelFormPaciente.add(label4);

        txtIdPaciente.setPreferredSize(new java.awt.Dimension(1, 1));
        panelFormPaciente.add(txtIdPaciente);

        label5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label5.setText("Tipo da consulta:");
        panelFormPaciente.add(label5);

        cbxTpConsulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbxTpConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Retorno" }));
        cbxTpConsulta.setPreferredSize(new java.awt.Dimension(1, 1));
        panelFormPaciente.add(cbxTpConsulta);

        btnSalvarConsulta.setBackground(new java.awt.Color(0, 204, 51));
        btnSalvarConsulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalvarConsulta.setLabel("Salvar");

        btnCancelar.setBackground(new java.awt.Color(255, 51, 0));
        btnCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelar.setLabel("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelFormPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 181, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFormPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataConsultaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadConsulta(emf).setVisible(true);      
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCancelar;
    private java.awt.Button btnSalvarConsulta;
    private javax.swing.JComboBox<String> cbxTpConsulta;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private javax.swing.JPanel panelFormPaciente;
    private java.awt.TextField txtDataConsulta;
    private java.awt.TextField txtHorarioConsulta;
    private java.awt.TextField txtIdPaciente;
    private java.awt.TextField txtMedico;
    // End of variables declaration//GEN-END:variables
}
