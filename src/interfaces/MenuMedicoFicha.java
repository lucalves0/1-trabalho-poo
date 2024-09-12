package interfaces;

import javax.persistence.EntityManagerFactory;
import servicos.Medico;
import registros.Paciente;

public class MenuMedicoFicha extends javax.swing.JFrame {
    private EntityManagerFactory EMF;
    private MenuMedicoInicial PAGINA_ANTERIOR;
    private Medico MEDICO;
    private Paciente PACIENTE;

    public MenuMedicoFicha(EntityManagerFactory emf, MenuMedicoInicial paginaAnterior, Medico medico, Paciente paciente) {
        this.EMF = emf;
        this.PAGINA_ANTERIOR = paginaAnterior;
        this.MEDICO = medico;
        this.PACIENTE = paciente;
        initComponents();
        iniciaCampos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void iniciaCampos(){
        jLabel3.setText(this.PACIENTE.getNome());
        jLabel4.setText(this.PACIENTE.getData_nascimento());
        jLabel5.setText(this.PACIENTE.getEndereco());
        jLabel6.setText(this.PACIENTE.getInfo_contatoCelular().toString());
        jLabel7.setText(this.PACIENTE.getInfo_contatoEmail());
        jLabel8.setText(this.PACIENTE.getTipo_convenio());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDatualizarDadosComplementares = new javax.swing.JDialog();
        JLalergias = new javax.swing.JLabel();
        JLcircurgias = new javax.swing.JLabel();
        JLcolesterol = new javax.swing.JLabel();
        JLbebe = new javax.swing.JLabel();
        JLfuma = new javax.swing.JLabel();
        JLdoencaCardiaca = new javax.swing.JLabel();
        JLdiabetes = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JLnome = new javax.swing.JLabel();
        JLdataNascimento = new javax.swing.JLabel();
        JLendereco = new javax.swing.JLabel();
        JLcelular = new javax.swing.JLabel();
        JLemail = new javax.swing.JLabel();
        JLconvenio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        JDatualizarDadosComplementares.setResizable(false);
        JDatualizarDadosComplementares.setSize(new java.awt.Dimension(500, 360));

        JLalergias.setText("ALERGIAS:");

        JLcircurgias.setText("CIRURGIAS:");

        JLcolesterol.setText("COLESTEROL:");

        JLbebe.setText("BEBE?:");

        JLfuma.setText("FUMA?:");

        JLdoencaCardiaca.setText("DOENÇAS CARDÍACAS:");

        JLdiabetes.setText("DIABETES:");

        jButton3.setText("SALVAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("DADOS COMPLEMENTARES");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JDatualizarDadosComplementaresLayout = new javax.swing.GroupLayout(JDatualizarDadosComplementares.getContentPane());
        JDatualizarDadosComplementares.getContentPane().setLayout(JDatualizarDadosComplementaresLayout);
        JDatualizarDadosComplementaresLayout.setHorizontalGroup(
            JDatualizarDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDatualizarDadosComplementaresLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(JDatualizarDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDatualizarDadosComplementaresLayout.createSequentialGroup()
                        .addGroup(JDatualizarDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLalergias)
                            .addComponent(JLcircurgias)
                            .addComponent(JLdoencaCardiaca)
                            .addComponent(JLdiabetes)
                            .addComponent(JLfuma)
                            .addComponent(JLbebe)
                            .addComponent(JLcolesterol))
                        .addGap(18, 18, 18)
                        .addGroup(JDatualizarDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(JDatualizarDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2)
                                .addComponent(jTextField3)
                                .addComponent(jTextField4)
                                .addComponent(jTextField5)
                                .addComponent(jTextField6)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JDatualizarDadosComplementaresLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jButton3)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        JDatualizarDadosComplementaresLayout.setVerticalGroup(
            JDatualizarDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDatualizarDadosComplementaresLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(JDatualizarDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLfuma)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDatualizarDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLbebe)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDatualizarDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcolesterol)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDatualizarDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLdiabetes)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDatualizarDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLdoencaCardiaca)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDatualizarDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcircurgias)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDatualizarDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLalergias)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        JLnome.setText("NOME:");

        JLdataNascimento.setText("DATA DE NASCIMENTO");

        JLendereco.setText("ENDERECO");

        JLcelular.setText("CELULAR");

        JLemail.setText("E-MAIL:");

        JLconvenio.setText("CONVENIO");

        jLabel1.setText("FICHA DO PACIENTE");

        jButton1.setText("ADICIONAR DADOS COMPLEMENTARES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ATUALIZAR DADOS COMPLEMENTARES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1)))
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLnome)
                            .addComponent(JLdataNascimento)
                            .addComponent(JLendereco)
                            .addComponent(JLcelular)
                            .addComponent(JLemail)
                            .addComponent(JLconvenio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnome)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLdataNascimento)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLendereco)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcelular)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLemail)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLconvenio)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(this.PACIENTE.getFuma());
        jTextField2.setText(this.PACIENTE.getBebe());
        jTextField3.setText(this.PACIENTE.getNivelColesterol());
        jTextField4.setText(this.PACIENTE.getDiabete());
        jTextField5.setText(this.PACIENTE.getDoencaCardiaca());
        jTextField6.setText(this.PACIENTE.getCirurgias());
        jTextField7.setText(this.PACIENTE.getAlergias());
        JDatualizarDadosComplementares.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JDatualizarDadosComplementares.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String fuma = jTextField1.getText();
        this.PACIENTE.setFuma(fuma);
        String bebe = jTextField2.getText();
        this.PACIENTE.setBebe(bebe);
        String colesterol = jTextField3.getText();
        this.PACIENTE.setNivelColesterol(colesterol);
        String diabetes = jTextField4.getText();
        this.PACIENTE.setDiabete(diabetes);
        String doencaCardiaca = jTextField5.getText();
        this.PACIENTE.setDoencaCardiaca(doencaCardiaca);
        String cirrurgias = jTextField6.getText();
        this.PACIENTE.setCirurgias(cirrurgias);
        String akergias = jTextField7.getText();
        this.PACIENTE.setAlergias(akergias);
        this.MEDICO.updateCadPaciente(this.EMF, this.PACIENTE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        this.PAGINA_ANTERIOR.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JDatualizarDadosComplementares;
    private javax.swing.JLabel JLalergias;
    private javax.swing.JLabel JLbebe;
    private javax.swing.JLabel JLcelular;
    private javax.swing.JLabel JLcircurgias;
    private javax.swing.JLabel JLcolesterol;
    private javax.swing.JLabel JLconvenio;
    private javax.swing.JLabel JLdataNascimento;
    private javax.swing.JLabel JLdiabetes;
    private javax.swing.JLabel JLdoencaCardiaca;
    private javax.swing.JLabel JLemail;
    private javax.swing.JLabel JLendereco;
    private javax.swing.JLabel JLfuma;
    private javax.swing.JLabel JLnome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
