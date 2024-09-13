// Interface para a atualização de Pacientes

package interfaces;

import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import registros.Paciente;
import servicos.Secretaria;

public class UpInforPacientes extends javax.swing.JFrame {

    private static EntityManagerFactory emf;
    
    public UpInforPacientes(Integer idPaciente, EntityManagerFactory emf) {
        initComponents();
        setLocationRelativeTo(null);
        
        Secretaria sec = new Secretaria();
        
        Paciente paciente = sec.searchPaciente(emf, idPaciente);
        
        // Reescreve as informações anteriores para atualizar
        txtNomePaciente.setText(paciente.getNome());
        txtDataNascimentoPaciente.setText(paciente.getData_nascimento());
        txtEnderecoPaciente.setText(paciente.getEndereco());
        txtInfoContatoPaciente.setText(String.valueOf(paciente.getInfo_contatoCelular()));
        txtInfoEmailPaciente.setText(paciente.getInfo_contatoEmail());
        cbxTpConvenioPaciente.setSelectedItem(paciente.getTipo_convenio());
       
        // Botão que salva alterações
        btnSalvarPaciente.addActionListener(evt ->{
        
            try {
                
                paciente.setNome(txtNomePaciente.getText());
                paciente.setData_nascimento(txtDataNascimentoPaciente.getText());
                paciente.setEndereco(txtEnderecoPaciente.getText());
                paciente.setInfo_contatoCelular(Integer.parseInt(txtInfoContatoPaciente.getText()));
                paciente.setInfo_contatoEmail(txtInfoEmailPaciente.getText());
                paciente.setTipo_convenio((String) cbxTpConvenioPaciente.getSelectedItem());
                
                sec.updateCadPaciente(emf, paciente);
                
                this.dispose();
                new GerPacientes(emf).setVisible(true);
            
            }catch (NumberFormatException e) {
                
                // Se não for um número, exibe a mensagem de erro
                JOptionPane.showMessageDialog(null, "Por favor, insira um número para o contato válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                txtInfoContatoPaciente.setText("");
                txtInfoContatoPaciente.requestFocus();
                
            }
        
        });
        
        // Botão para cancelar a atualização
        btnCancelarPaciente.addActionListener(evt -> {
        
            setVisible(false);
            new GerPacientes(emf).setVisible(true);
        
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
        label6 = new java.awt.Label();
        txtInfoEmailPaciente = new java.awt.TextField();
        label5 = new java.awt.Label();
        cbxTpConvenioPaciente = new javax.swing.JComboBox<>();
        btnSalvarPaciente = new java.awt.Button();
        btnCancelarPaciente = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atualização de informações de paciente");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(684, 464));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atualizar Informações de Pacientes");
        jLabel1.setAlignmentX(0.5F);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        label1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label1.setText("Nome:");
        jPanel1.add(label1);

        txtNomePaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNomePaciente.setPreferredSize(new java.awt.Dimension(1, 1));
        jPanel1.add(txtNomePaciente);

        label2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label2.setText("Data de nascimento:");
        jPanel1.add(label2);

        txtDataNascimentoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDataNascimentoPaciente.setPreferredSize(new java.awt.Dimension(1, 1));
        jPanel1.add(txtDataNascimentoPaciente);

        label3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label3.setText("Endereço:");
        jPanel1.add(label3);

        txtEnderecoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEnderecoPaciente.setPreferredSize(new java.awt.Dimension(1, 1));
        jPanel1.add(txtEnderecoPaciente);

        label4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label4.setText("Informação de contato:");
        jPanel1.add(label4);

        txtInfoContatoPaciente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtInfoContatoPaciente.setPreferredSize(new java.awt.Dimension(1, 1));
        jPanel1.add(txtInfoContatoPaciente);

        label6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label6.setText(" E-mail para contato:");
        jPanel1.add(label6);

        txtInfoEmailPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtInfoEmailPaciente.setPreferredSize(new java.awt.Dimension(1, 1));
        jPanel1.add(txtInfoEmailPaciente);

        label5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label5.setText("Tipo de convênio:");
        jPanel1.add(label5);

        cbxTpConvenioPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbxTpConvenioPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Público", "Privado", "Não possui convênio" }));
        cbxTpConvenioPaciente.setPreferredSize(new java.awt.Dimension(1, 1));
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


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpInforPacientes(0, emf).setVisible(true);
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
    private java.awt.Label label6;
    private java.awt.TextField txtDataNascimentoPaciente;
    private java.awt.TextField txtEnderecoPaciente;
    private java.awt.TextField txtInfoContatoPaciente;
    private java.awt.TextField txtInfoEmailPaciente;
    private java.awt.TextField txtNomePaciente;
    // End of variables declaration//GEN-END:variables
}
