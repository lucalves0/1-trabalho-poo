// Interface para o Cadastro de Pacientes

package interfaces;

import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import registros.Paciente;
import servicos.Secretaria;

public class CadPacientes extends javax.swing.JFrame {
    
    private static EntityManagerFactory emf;
    
    public CadPacientes(EntityManagerFactory emf) {
        initComponents();
        setLocationRelativeTo(null);  
        
        Secretaria sec = new Secretaria();
        
        // Ação do botão de salvar
        btnSalvarPaciente.addActionListener(evt ->{
        
            try {
                
                Paciente pac = new Paciente();
                pac.setNome(txtNomePaciente.getText());
                pac.setData_nascimento(txtDataNascimentoPaciente.getText());
                pac.setEndereco(txtEnderecoPaciente.getText());
                pac.setInfo_contatoCelular(Integer.parseInt(txtInfoContatoPaciente.getText()));
                pac.setInfo_contatoEmail(txtInfoEmailPaciente.getText());
                pac.setTipo_convenio((String) cbxTpConvenioPaciente.getSelectedItem());
                
                sec.postCadPaciente(emf, pac);
                
                this.dispose();
                new GerPacientes(emf).setVisible(true);
            
            }catch (NumberFormatException e) {
                // Número Incorreto
                // Se não for um número, exibe a mensagem de erro
                JOptionPane.showMessageDialog(null, "Por favor, insira um número para o contato válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                txtInfoContatoPaciente.setText("");
                txtInfoContatoPaciente.requestFocus();
                
            }
        
        });
        
        // Ação do botão de cancelar
        btnCancelarPaciente.addActionListener(evt -> {
        
            setVisible(false);
            new GerPacientes(emf).setVisible(true);
        
        });
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelFormPaciente = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        txtNomePaciente = new java.awt.TextField();
        label2 = new java.awt.Label();
        txtDataNascimentoPaciente = new java.awt.TextField();
        label3 = new java.awt.Label();
        txtEnderecoPaciente = new java.awt.TextField();
        label4 = new java.awt.Label();
        txtInfoContatoPaciente = new java.awt.TextField();
        label6 = new java.awt.Label();
        txtInfoEmailPaciente = new java.awt.TextField();
        label5 = new java.awt.Label();
        cbxTpConvenioPaciente = new javax.swing.JComboBox<>();
        btnSalvarPaciente = new java.awt.Button();
        btnCancelarPaciente = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de cadastro de pacientes");
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(684, 464));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulário de Cadastro de Pacientes");
        jLabel1.setAlignmentX(0.5F);

        panelFormPaciente.setLayout(new javax.swing.BoxLayout(panelFormPaciente, javax.swing.BoxLayout.PAGE_AXIS));

        label1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label1.setText("Nome:");
        panelFormPaciente.add(label1);

        txtNomePaciente.setPreferredSize(new java.awt.Dimension(1, 1));
        txtNomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePacienteActionPerformed(evt);
            }
        });
        panelFormPaciente.add(txtNomePaciente);

        label2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label2.setText("Data de nascimento:");
        panelFormPaciente.add(label2);

        txtDataNascimentoPaciente.setPreferredSize(new java.awt.Dimension(1, 1));
        panelFormPaciente.add(txtDataNascimentoPaciente);

        label3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label3.setText("Endereço:");
        panelFormPaciente.add(label3);

        txtEnderecoPaciente.setPreferredSize(new java.awt.Dimension(1, 1));
        panelFormPaciente.add(txtEnderecoPaciente);

        label4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label4.setText("Informação para contato:");
        panelFormPaciente.add(label4);

        txtInfoContatoPaciente.setPreferredSize(new java.awt.Dimension(1, 1));
        panelFormPaciente.add(txtInfoContatoPaciente);

        label6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label6.setText("Informação do E-mail:");
        panelFormPaciente.add(label6);

        txtInfoEmailPaciente.setPreferredSize(new java.awt.Dimension(1, 1));
        panelFormPaciente.add(txtInfoEmailPaciente);

        label5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label5.setText("Tipo do convênio:");
        panelFormPaciente.add(label5);

        cbxTpConvenioPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbxTpConvenioPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Público", "Particular", "Não possui convênio" }));
        cbxTpConvenioPaciente.setPreferredSize(new java.awt.Dimension(1, 1));
        panelFormPaciente.add(cbxTpConvenioPaciente);

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
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelFormPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnCancelarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnSalvarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePacienteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadPacientes(emf).setVisible(true);      
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCancelarPaciente;
    private java.awt.Button btnSalvarPaciente;
    private javax.swing.JComboBox<String> cbxTpConvenioPaciente;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JPanel panelFormPaciente;
    private java.awt.TextField txtDataNascimentoPaciente;
    private java.awt.TextField txtEnderecoPaciente;
    private java.awt.TextField txtInfoContatoPaciente;
    private java.awt.TextField txtInfoEmailPaciente;
    private java.awt.TextField txtNomePaciente;
    // End of variables declaration//GEN-END:variables
}
