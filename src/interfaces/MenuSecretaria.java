package interfaces;

import javax.persistence.EntityManagerFactory;

public class MenuSecretaria extends javax.swing.JFrame {
    
    private static EntityManagerFactory emf;
    
    public MenuSecretaria(EntityManagerFactory emf) {
        initComponents();
        setLocationRelativeTo(null);    // Centraliza ao meio do monitor
        
        btnGerPacientes.addActionListener(e -> {
            setVisible(false);
            new GerPacientes(emf).setVisible(true);
        });
        
        Voltar.addActionListener(e -> {
            this.dispose();
            new JanelaStart(emf).setVisible(true);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGerConsultas = new javax.swing.JButton();
        btnGerPacientes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Voltar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu da secretaria");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU DA SECRETARIA");
        jLabel1.setAlignmentX(0.5F);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecione abaixo o tipo de gerenciamento que deseja realizar: ");

        btnGerConsultas.setText("Gerenciar consultas");
        btnGerConsultas.setAlignmentX(0.5F);
        btnGerConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerConsultasActionPerformed(evt);
            }
        });

        btnGerPacientes.setText("Gerenciar pacientes");
        btnGerPacientes.setAlignmentX(0.5F);
        btnGerPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerPacientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGerPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGerConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 166, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(58, 58, 58)
                .addComponent(btnGerConsultas)
                .addGap(18, 18, 18)
                .addComponent(btnGerPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);

        jMenu1.setText("Ações");

        jMenuItem1.setText("Gerar relátorio");
        jMenu1.add(jMenuItem1);

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        jMenu1.add(Voltar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerConsultasActionPerformed
        
    }//GEN-LAST:event_btnGerConsultasActionPerformed

    private void btnGerPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGerPacientesActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VoltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSecretaria(emf).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Voltar;
    private javax.swing.JButton btnGerConsultas;
    private javax.swing.JButton btnGerPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
