package interfaces;

import registros.ProntuarioAtendimento;
import javax.persistence.EntityManagerFactory;
import servicos.Medico;

public class MenuMedicoAtualizarPAT extends javax.swing.JFrame {
    private EntityManagerFactory EMF;
    private ProntuarioAtendimento PRONTUARIO_ATENDIMENTO;
    private Medico MEDICO;

    public MenuMedicoAtualizarPAT(EntityManagerFactory emf, Medico medico, ProntuarioAtendimento PAT) {
        this.EMF = emf;
        this.PRONTUARIO_ATENDIMENTO = PAT;
        this.MEDICO = medico;
        initComponents();
        jTextField1.setText(PAT.getDataAtendimento());
        jTextField2.setText(PAT.getSintomas());
        jTextField3.setText(PAT.getDignostico());
        jTextField4.setText(PAT.getPrescricao());
        jTextField5.setText(PAT.getDataRetorno());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        JBsalvarPAT = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Prontuario de Atendimento");

        jLabel1.setText("ATUALIZAR PRONTUARIO DE ATENDIMENTO");

        jTextField5.setText("jTextField5");

        JBsalvarPAT.setText("SALVAR");
        JBsalvarPAT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBsalvarPATMouseClicked(evt);
            }
        });

        jLabel19.setText("Data do atendimento:");

        jLabel20.setText("Sintomas:");

        jLabel21.setText("Diagnóstico:");

        jLabel22.setText("Prescrição:");

        jLabel23.setText("Data de retorno:");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBsalvarPAT)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField5)
                        .addComponent(jTextField4)
                        .addComponent(jTextField3)
                        .addComponent(jTextField2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(JBsalvarPAT)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBsalvarPATMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBsalvarPATMouseClicked
        // TODO add your handling code here:
        String dataAtendimento = jTextField1.getText();
        this.PRONTUARIO_ATENDIMENTO.setDataAtendimento(dataAtendimento);
        String sintomas = jTextField2.getText();
        this.PRONTUARIO_ATENDIMENTO.setSintomas(sintomas);
        String diagnostico = jTextField3.getText();
        this.PRONTUARIO_ATENDIMENTO.setDignostico(diagnostico);
        String prescricao = jTextField4.getText();
        this.PRONTUARIO_ATENDIMENTO.setPrescricao(prescricao);
        String dataRetorno = jTextField5.getText();
        this.PRONTUARIO_ATENDIMENTO.setDataRetorno(dataRetorno);

        this.MEDICO.atualizarProntuarioAtendimento(this.EMF, this.PRONTUARIO_ATENDIMENTO);
        this.dispose();
    }//GEN-LAST:event_JBsalvarPATMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBsalvarPAT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
