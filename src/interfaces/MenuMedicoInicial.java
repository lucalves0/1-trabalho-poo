/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import pessoas.Medico;
import pessoas.Paciente;

public class MenuMedicoInicial extends javax.swing.JFrame {
    private EntityManagerFactory EMF;
    private Medico MEDICO;
    private List<Paciente> PACIETNES_BUSCADOS;
    /**
     * Creates new form MenuMedicoInicial
     */
    public MenuMedicoInicial(EntityManagerFactory emf, Medico medico) {
        this.EMF = emf;
        this.MEDICO = medico;
        initComponents();
        setLocationRelativeTo(null);
        jButton6.setVisible(false);
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
        jOptionPane1 = new javax.swing.JOptionPane();
        JDbuscarPaciente1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        JDbuscarPaciente.setTitle("BUSCA DO PACIENTE");
        JDbuscarPaciente.setResizable(false);
        JDbuscarPaciente.setSize(new java.awt.Dimension(400, 500));

        jLabel1.setText("Informe o nome do paciente");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton5.setText("BUSCAR");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
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
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JDbuscarPacienteLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton6)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        JDbuscarPacienteLayout.setVerticalGroup(
            JDbuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDbuscarPacienteLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton6)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        JDbuscarPaciente1.setTitle("BUSCA DO PACIENTE");
        JDbuscarPaciente1.setResizable(false);
        JDbuscarPaciente1.setSize(new java.awt.Dimension(400, 500));

        jLabel2.setText("Informe o nome do paciente");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton7.setText("BUSCAR");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(jList2);

        jButton8.setText("OK");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JDbuscarPaciente1Layout = new javax.swing.GroupLayout(JDbuscarPaciente1.getContentPane());
        JDbuscarPaciente1.getContentPane().setLayout(JDbuscarPaciente1Layout);
        JDbuscarPaciente1Layout.setHorizontalGroup(
            JDbuscarPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDbuscarPaciente1Layout.createSequentialGroup()
                .addGroup(JDbuscarPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDbuscarPaciente1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2))
                    .addGroup(JDbuscarPaciente1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JDbuscarPaciente1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton7))
                    .addGroup(JDbuscarPaciente1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JDbuscarPaciente1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton8)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        JDbuscarPaciente1Layout.setVerticalGroup(
            JDbuscarPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDbuscarPaciente1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton8)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU MÉDICO");

        jButton1.setText("PRONTUÁRIO DO PACIENTE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("FICHA DO PACIENTE");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("RELATÓRIOS");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("VOLTAR");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jButton4)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(40, 40, 40)
                .addComponent(jButton4)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // BOTÃO PRONTUÁRIO DO PACIENTE
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        JDbuscarPaciente.setVisible(true);
        
    }//GEN-LAST:event_jButton1MouseClicked
    
    // BOTÃO FICHA DO PACIENTE
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        JDbuscarPaciente1.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    // BOTÃO VOLTAR
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        new JanelaStart(this.EMF).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    // BOTÃO BUSCAR PACIENTE
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // buscar o paciente no banco de dados pelo nome
        String nomeBuscado = jTextField1.getText();
        List<Paciente> listaPacientes = this.MEDICO.searchPacienteByName(this.EMF, nomeBuscado);
        this.PACIETNES_BUSCADOS = listaPacientes;
        
        if (listaPacientes.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Nenhum paciente encontrado com o nome " + nomeBuscado + ".", 
                    "Paciente não encontrado", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultListModel<String> listModel = new DefaultListModel<>();

            for (Paciente paciente : listaPacientes) {
                String infoPaciente = String.format("Identificador do paciente: %d | "
                                                  + "Nome do paciente: %s | " 
                                                  + "Data de Nascimento: %s | " 
                                                  + "Celular: %d | " 
                                                  + "Convenio: %s |" ,
                                                    paciente.getId(), 
                                                    paciente.getNome(),
                                                    paciente.getData_nascimento(),
                                                    paciente.getInfo_contatoCelular(),
                                                    paciente.getTipo_convenio());
                listModel.addElement(infoPaciente);
            }
            jList1.setModel(listModel);
            jButton6.setVisible(true);
        }
        //this.setVisible(false);
        //JDbuscarPaciente.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    // BOTÃO OK - PACIENTE SELECIONADO
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        int indexSelecionado = jList1.getSelectedIndex();
        System.out.println(indexSelecionado);
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        Paciente pacienteSelecionado = this.PACIETNES_BUSCADOS.get(indexSelecionado);
        System.out.println(indexSelecionado);
        System.out.println(pacienteSelecionado.getNome());
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        new MenuMedicoProntuarios(this.EMF, this, this.MEDICO, pacienteSelecionado).setVisible(true);
        System.out.println(indexSelecionado);
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // buscar o paciente no banco de dados pelo nome
        String nomeBuscado = jTextField2.getText();
        List<Paciente> listaPacientes = this.MEDICO.searchPacienteByName(this.EMF, nomeBuscado);
        this.PACIETNES_BUSCADOS = listaPacientes;
        
        if (listaPacientes.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Nenhum paciente encontrado com o nome " + nomeBuscado + ".", 
                    "Paciente não encontrado", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultListModel<String> listModel = new DefaultListModel<>();

            for (Paciente paciente : listaPacientes) {
                String infoPaciente = String.format("Identificador do paciente: %d | "
                                                  + "Nome do paciente: %s | " 
                                                  + "Data de Nascimento: %s | " 
                                                  + "Celular: %d | " 
                                                  + "Convenio: %s |" ,
                                                    paciente.getId(), 
                                                    paciente.getNome(),
                                                    paciente.getData_nascimento(),
                                                    paciente.getInfo_contatoCelular(),
                                                    paciente.getTipo_convenio());
                listModel.addElement(infoPaciente);
            }
            jList2.setModel(listModel);
            jButton8.setVisible(true);
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        int indexSelecionado = jList2.getSelectedIndex();
        Paciente pacienteSelecionado = this.PACIETNES_BUSCADOS.get(indexSelecionado);
        new MenuMedicoFicha(this.EMF, this, this.MEDICO, pacienteSelecionado).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JDbuscarPaciente;
    private javax.swing.JDialog JDbuscarPaciente1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
